package ex_22082025;

public class Lab059 {
    public static void main(String[] args) {
        //scenario 1---->
        String s1="Saurabh";
        String s2="Jadhav";
        String s3="Saurabh Jadhav";
        // How many strings created in SCP-->Total 3

        //Scenario 2------>
        //when ever you perform the new operation it will always create new string
        String s4="Saurabh";
        String s5="Jadhav";
        String s6="Saurabh Jadhav";
        String s7= s4.concat(s5);
        System.out.println(s7);

        //String are immutable in nature
        //if you want to change value multiple times don't use string then you need to use StringBuffer & StringBuilder class
    }
}
