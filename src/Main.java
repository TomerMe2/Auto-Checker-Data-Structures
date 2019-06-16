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

    private static String runnerLocWithDelete = "C:\\DSchecking\\RunnerWithDelete";
    private static String runnerLocWithoutDelete = "C:\\DSchecking\\RunnerWithoutDelete";
    private static String innerFolderNameWithoutSrc = "thiersDir";
    private static String innerFolderNameWithSrc = "thiersDir\\src";
    private static String fullPathForOutputTxt = "C:\\DSchecking\\Checking\\thiersDir\\src\\output.txt";
    private static String[] flNmsToDel = {"output.txt", "requested_passwords.txt", "hash_functions.txt",
            "bad_passwords.txt", "delete_keys.txt", "Runner.java"};

    public static void main(String[] args) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("ds_ass4_auto_check");
        int lastRow = 0;
        lastRow = initExcelTopRow(sheet);
        String testerAppDir = System.getProperty("user.dir");
        String workingDir = "C:\\DSchecking\\Checking";
        List<String> allZips = listOfAllZipsNames(workingDir);
        int cntGroups = 0;
        for (String zipName: allZips) {
            try {
                System.out.println("Started group " + cntGroups);
                cntGroups++;
                String groupId = zipName.substring(0, zipName.indexOf('A'));
                unZipGivenFile(workingDir + "\\" + zipName, workingDir + "\\" + innerFolderNameWithoutSrc, zipName);
                //unZipGivenFile(workingDir + "\\" + zipName, workingDir + "\\" + innerFolderName, zipName, workingDir);
                List<String> testsResult = new ArrayList<>();
                testsResult.add(groupId);
                for (int i = 0; i < Tests.testsDirName.length; i++) {
                    deleteFilesFromDir(workingDir + "\\" + innerFolderNameWithSrc, flNmsToDel);
                    deleteFilesFromDir(testerAppDir, flNmsToDel);
                    //loop over all the tests
                    String runnerLoc;
                    if (i == 1) {
                        runnerLoc = runnerLocWithDelete;
                    }
                    else {
                        runnerLoc = runnerLocWithoutDelete;
                    }
                  moveFileToGivenDir(runnerLoc + "\\Runner.java", workingDir + "\\" + innerFolderNameWithSrc + "\\Runner.java");
                        compile(workingDir);
                        if (runIthTest(i, workingDir, fullPathForOutputTxt, testerAppDir)) {
                            testsResult.add("1");
                        }
                        else {
                            testsResult.add("0");
                    }
                }
                deleteAllFilesFromDir(workingDir + "\\" + innerFolderNameWithoutSrc, workingDir);
                StringBuilder textDesc = new StringBuilder();
                int counter = 0;
                for (String tstRes: testsResult) {
                    if (tstRes.equals("0")) {
                        textDesc.append("failed test ").append(counter - 1).append("\n");
                    }
                    counter++;
                }
                testsResult.add(textDesc.toString());
                lastRow = writeLineToExcel(testsResult, sheet, lastRow);
            }
            catch (Exception e) {
                e.printStackTrace();
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
        File [] files = dir.listFiles((dir1, name) -> name.endsWith(".zip"));
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
    public static boolean runIthTest(int testNum, String workingDir, String fullPthToOutput, String testerRunningDir) throws IOException, InterruptedException {
        copyDirConetentToNewDir(Tests.testsLoc + "\\" + Tests.testsDirName[testNum], testerRunningDir);
        try {
            executeCommandLine("java -cp C:\\DSchecking\\Checking\\thiersDir\\src Runner " + Tests.params[testNum], 4000);
        }
        catch (TimeoutException e) {
            return false;
        }
        //Process pr = Runtime.getRuntime().exec("java -cp C:\\DSchecking\\Checking\\thiersDir Runner " + Tests.params[testNum]);
        //waitForCmnd(pr);
        return hasTestPassed(testNum, testerRunningDir + "\\output.txt");
    }

    private static void waitForCmnd(Process pr) throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
        String str;
        while (((str = reader.readLine()) != null)) {
            System.out.println(str);
        }
        reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while ((reader.readLine() != null)) {}
        pr.waitFor();
    }

    public static void compile(String workingDir) throws IOException, InterruptedException {
        Process cmndPr = Runtime.getRuntime().exec("javac " + workingDir + "\\" + innerFolderNameWithSrc + "\\*.java");
        waitForCmnd(cmndPr);
    }

    public static void deleteFilesFromDir(String dirPath, String[] filleNames) {
        for (String flNm : filleNames) {
            File fl = new File(dirPath + "\\" + flNm);
            fl.delete();
        }
    }

    public static void deleteAllFilesFromDir(String dirPath, String workingDir) throws IOException{
        FileUtils.deleteDirectory(new File(dirPath));
        new File(workingDir + "\\" + innerFolderNameWithoutSrc).mkdirs();
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
    public static boolean hasTestPassed(int testNum, String outputPath) throws IOException {
        BufferedReader theirsRdr = null;
        try {
            theirsRdr = new BufferedReader(new FileReader(outputPath));
            String line = theirsRdr.readLine();
            boolean hasPassed = true;
            int lineInd = 0;
            while (line != null && hasPassed) {
                if (lineInd > 4) {
                    hasPassed = false;
                }
                if (lineInd == 0 || lineInd == 1 || lineInd == 2) {
                    if (!(Tests.tests[testNum][lineInd].equals(line.replace("\n", "")))) {
                        //check for doubles and stuff
                        if (lineInd == 0 || lineInd == 1) {
                            try {
                                double theirs = Double.parseDouble(line.replace("\n", ""));
                                double ours = Double.parseDouble(Tests.tests[testNum][lineInd]);
                                if (theirs > ours + 0.001 || theirs < ours - 0.001) {
                                    hasPassed = false;
                                }
                            }
                            catch (Exception e) {
                                hasPassed = false;
                            }
                        }
                        else {
                            hasPassed = false;
                        }
                    }
                }
                else if (lineInd == 4 && (testNum == 0 || testNum == 7)) {
                    if (!(Tests.tests[testNum][lineInd].equals(line.replace("\n", "")))) {
                        //check if it equals to the test line with , at the end
                        if (!((Tests.tests[testNum][lineInd] + ",").equals(line.replace("\n", "")))) {
                            hasPassed = false;
                        }
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
            //output file not found
            return false;
        }
        finally {
            if (theirsRdr != null)
                theirsRdr.close();
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
            int tstNum = i + 1;
            menu.add("Test" + tstNum);
        }
        menu.add("Text");
        return writeLineToExcel(menu, sht, 0);
    }

}
