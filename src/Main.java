import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static java.lang.System.exit;

public class Main {

    //TODO: every exec should follow buffered readers as i did in running their code
    private static String runnerLoc = "C:\\DSchecking";
    private static String innerFolderName = "thiersDir";

    public static void main(String[] args) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("ds_ass4_auto_check");
        int lastRow = 0;
        lastRow = initExcelTopRow(sheet);
        String testerAppDir = System.getProperty("user.dir");
        String workingDir = "C:\\DSchecking\\Checking";
        List<String> allZips = listOfAllZipsNames(workingDir);
        for (String zipName: allZips) {
            try {
                String groupId = zipName.split("_")[0];
                unZipGivenFile(workingDir + "\\" + zipName, workingDir + "\\" + innerFolderName, zipName);
                //unZipGivenFile(workingDir + "\\" + zipName, workingDir + "\\" + innerFolderName, zipName, workingDir);
                moveFileToGivenDir(runnerLoc + "\\Runner.java", workingDir + "\\" + innerFolderName + "\\Runner.java");
                compile(workingDir);
                List<String> testsResult = new ArrayList<>();
                testsResult.add(groupId);
                for (int i = 0; i < Tests.testsDirName.length; i++) {
                    //loop over all the tests
                    if (runIthTest(i, workingDir, testerAppDir)) {
                        testsResult.add("1");
                    }
                    else {
                        testsResult.add("0");
                    }
                }
                deleteAllFilesFromDir(workingDir + "\\" + innerFolderName, workingDir);
                String textDesc = "";
                int counter = 0;
                for (String tstRes: testsResult) {
                    if (tstRes.equals("0")) {
                        textDesc = "failed test " + counter + "\n";
                    }
                    counter++;
                }
                lastRow = writeLineToExcel(testsResult, sheet, lastRow);
            }
            catch (Exception e) {
                e.printStackTrace();
                exit(1);
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream("ds_ass4_auto_check.xls")) {
            workbook.write(outputStream);
        }
        catch (Exception e) {
            e.printStackTrace();
            exit(1);
        }
    }

    //tested
    public static int executeCommandLine(final String commandLine, final long timeout)
            throws IOException, InterruptedException, TimeoutException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commandLine);
        Worker worker = new Worker(process);
        worker.start();
        try {
            worker.join(timeout);
            if (worker.exit != null)
                return worker.exit;
            else
                throw new TimeoutException();
        } catch(InterruptedException ex) {
            worker.interrupt();
            Thread.currentThread().interrupt();
            throw ex;
        } finally {
            process.destroyForcibly();
        }
    }

    private static class Worker extends Thread {
        private final Process process;
        private Integer exit;
        private Worker(Process process) {
            this.process = process;
        }
        public void run() {
            try {
                exit = process.waitFor();
            } catch (InterruptedException ignore) {

            }
        }
    }

    //tested
    public static List<String> listOfAllZipsNames(String dirPath) {
        File dir = new File(dirPath);
        File [] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".zip");
            }
        });
        List<String> lst = new ArrayList<>();
        if (files != null) {
            for (File fl: files) {
                if (fl.isFile()) {
                    lst.add(fl.getName());
                }
            }
        }
        return lst;
    }

    //call this after compilation
    //returns true iff their code passed the test
    public static boolean runIthTest(int testNum, String workingDir, String testerDir) throws IOException, InterruptedException, TimeoutException {
        copyDirConetentToNewDir(Tests.testsLoc + "\\" + Tests.testsDirName[testNum], testerDir);
        //executeCommandLine("java " + workingDir + "\\Runner 32 32 2", 4000);
        Process pr = Runtime.getRuntime().exec("java -cp C:\\DSchecking\\Checking\\thiersDir Runner 32 2 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
        String str;
        while (((str = reader.readLine()) != null)) {
            System.out.println(str);
        }
        reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while ((reader.readLine() != null)) {}
        pr.waitFor();
        //TODO: switch for this exec, and retain the buffered readers:
        //executeCommandLine("java -cp " + workingDir + "\\" + innerFolderName + " Runner 32 2 2", 10000);
        return hasTestPassed(testNum, testerDir + "\\output.txt");
    }

    public static void compile(String workingDir) throws IOException, InterruptedException {
        Process cmndPr = Runtime.getRuntime().exec("javac " + workingDir + "\\" + innerFolderName + "\\*.java");
        cmndPr.waitFor();
    }

    public static void deleteAllFilesFromDir(String dirPath, String workingDir) throws IOException{
        FileUtils.deleteDirectory(new File(dirPath));
        new File(workingDir + "\\" + innerFolderName).mkdirs();
    }

    //tested
    public static void unZipGivenFile(String zipFilePath, String dest, String zipName)
            throws ZipException, InterruptedException, IOException{
        ZipFile zp = new ZipFile(zipFilePath);
        zp.extractAll(dest);
        moveDirContentToNewDir(dest + "\\" + zipName.split("_")[0], dest);
    }

    public static void moveFileToGivenDir(String sourceFilePath, String targetPath)
        throws IOException  {
        File source = new File(sourceFilePath);
        File dest = new File(targetPath);
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    //tested
    //sourceDirPath will be without the dir name at the end
    //destDirPthWithName will be with the dir name at the end
    //workingDir is the dir where we will compile everything, it's so we will be able to clean up the cd
    //this method cds back to working dir at the end!
    //public static void moveDirContentToNewDir(String sourceDirPath, String sourceDirName, String destDirPathWithName, String workingDir)
    public static void moveDirContentToNewDir(String sourceDir, String destPath) {
        File srcDir = new File(sourceDir);
        File[] filesInDir = srcDir.listFiles();
        if (filesInDir != null) {
            for (File fl : filesInDir) {
                if (fl.isFile()) {
                    fl.renameTo(new File(destPath + "\\" + fl.getName()));
                    //File dest = new File(destPath);
                    //Files.move(srcDir.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }

    public static void copyDirConetentToNewDir(String sourceDir, String destPath) throws IOException{
        File srcDir = new File(sourceDir);
        File[] filesInDir = srcDir.listFiles();
        if (filesInDir != null) {
            for (File fl : filesInDir) {
                if (fl.isFile()) {
                    File dest = new File(destPath + "\\" + fl.getName());
                    Files.copy(fl.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    //File dest = new File(destPath);
                    //Files.move(srcDir.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }

    //tested
    //outputPath can be output.txt
    public static boolean hasTestPassed(int testNum, String outputPath) {
        try {
            BufferedReader theirsRdr = new BufferedReader(new FileReader(outputPath));
            String line = theirsRdr.readLine();
            boolean hasPassed = true;
            int lineInd = 0;
            while (line != null && hasPassed) {
                if (lineInd > 4) {
                    hasPassed = false;
                }
                if (lineInd != 3) {
                    if (!(Tests.tests[testNum][lineInd].equals(line.replace("\n", "")))) {
                        hasPassed = false;
                    }
                }
                lineInd++;
                line = theirsRdr.readLine();
            }
            if (lineInd < 5) {
                hasPassed = false;
            }
            return hasPassed;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //every cell in line is a cell in the excel row
    //returns the new row that the next line should be written into
    public static int writeLineToExcel(List<String> line, HSSFSheet sht, int thisRowNum) {
        Row rw = sht.createRow(thisRowNum);
        for (int i = 0; i < line.size(); i++) {
            Cell cl = rw.createCell(i);
            cl.setCellValue(line.get(i));
        }
        return thisRowNum + 1;
    }

    public static int initExcelTopRow(HSSFSheet sht) {
        List<String> menu = new ArrayList<>();
        menu.add("groupId");
        for (int i = 0; i < Tests.testsDirName.length; i++) {
            menu.add("Test" + i);
        }
        menu.add("Text");
        return writeLineToExcel(menu, sht, 0);
    }

}
