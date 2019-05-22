public class Tests {

    private static  String[] outTest1 = ("0.4\n" +
            "15\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.8939_0.8815\n" +
            "111111_1,123456_0,donald_1,login_0,hellow_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    private static String[] outTest2 = ("0.4\n" +
            "15\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.8939_0.8815\n" +
            "111111_1,123456_0,donald_1,login_0,hellow_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    public static String testsLoc = "C:\\DSchecking\\Tests";

    public static String[] testsDirName = {"Tst0", "Tst1"};

    public static String[][] tests = {outTest1, outTest2};
}
