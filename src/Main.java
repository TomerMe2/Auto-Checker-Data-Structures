import net.lingala.zip4j.core.ZipFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        try {
            String workingDir = System.getProperty("user.dir");
            Process cmndPr = Runtime.getRuntime().exec("javac -d " + workingDir + " src\\*.java");
            cmndPr.waitFor();
            executeCommandLine("java Runner 32 32 2", false, false, 1000);
            //TODO: continue here
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int executeCommandLine(final String commandLine, final boolean printOutput, final boolean printError,
                                         final long timeout)
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
                return;
            }
        }
    }

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

    public static void delteAllFilesFromDir(String dirPath) {
        try {
            Process cmndPr = Runtime.getRuntime().exec("del /S " + dirPath + "*");
            cmndPr.waitFor();
        }
        catch (Exception e) {
            e.printStackTrace();
            exit(0);
        }
    }

    public static void unZipGivenFile(String zipFilePath, String dest) {
        try {
            ZipFile zp = new ZipFile(zipFilePath);
            zp.extractAll(dest);
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

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
                    if (!(OutTests.tests[testNum][lineInd].equals(line.replace("\n", "")))) {
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
    public static void writeLineToExcel(String[] line, String excelFilePath) {

    }


}
