public class CoreJavaStringMethods {

    public static void main(String[] args) {

        //LESSON 27
        //one space in memory allocated for both vars
        String s = "This is a brand new string.";
        String s1 = "This is a brand new string.";

        //2 diff spaces in memory reserved
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String[] splitString = s.split(" ");

        System.out.println(splitString[5]);

        String s4 = "This is a brand new string.";

        String[] splitString2 = s.split(" is a brand new ");

        System.out.println(splitString2[1]);

    }

}
