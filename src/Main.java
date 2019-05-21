import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Main {

    private static String[] outTest1 = ("0.3\n" +
            "14\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.4654_0.5026\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    //TO RUN THIS CHECKER, javac -version and java -version MUST SHOW VALUES IN CMD
    public static void main(String[] args) {
        try {
            String workingDir = System.getProperty("user.dir");
            Process cmndPr = Runtime.getRuntime().exec("javac -d " + workingDir + " src\\*.java");
            cmndPr.waitFor();
            executeCommandLine("java Runner 32 32 2", 4000);
            BufferedReader theirsRdr = new BufferedReader(new FileReader("output.txt"));
            String line = theirsRdr.readLine();
            boolean hasPassed = true;
            int lineInd = 0;
            while (line != null && hasPassed) {
                if (lineInd > 4) {
                    hasPassed = false;
                }
                if (lineInd != 3) {
                    if (!(outTest1[lineInd].equals(line.replace("\n", "")))) {
                        hasPassed = false;
                    }
                }
                lineInd++;
                line = theirsRdr.readLine();
            }
            if (lineInd < 5) {
                hasPassed = false;
            }
            String toPrint;
            toPrint = hasPassed ? "You have passed! :)" : "You have not passed";
            System.out.println(toPrint);
        } catch (Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }

    private static void executeCommandLine(final String commandLine, final long timeout)
            throws IOException, InterruptedException, TimeoutException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commandLine);
        Worker worker = new Worker(process);
        worker.start();
        try {
            worker.join(timeout);
            if (worker.exit == null) {
                throw new TimeoutException();
            }
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
}
