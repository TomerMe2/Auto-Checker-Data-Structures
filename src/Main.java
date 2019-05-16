import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Main {

    private static String[] outTest1 = ("0.4\n" +
            "15\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.8939_0.8815\n" +
            "111111_1,123456_0,donald_1,login_0,hellow_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    public static void main(String[] args) {
        try {
            String workingDir = System.getProperty("user.dir");
            Process cmndPr = Runtime.getRuntime().exec("javac -d " + workingDir + " src\\*.java");
            cmndPr.waitFor();
            executeCommandLine("java Runner 32 32 2", false, false, 1000);
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
                        System.out.println("You have not passed the " + lineInd + " row");
                        hasPassed = false;
                    }
                }
                lineInd++;
                line = theirsRdr.readLine();
            }
            if (hasPassed) {
                System.out.println("You have passed! :)");
            }
            else {
                System.out.println("You have not passed :(");
            }
        } catch (Exception e) {
            System.out.println("something went wrong");
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
}
