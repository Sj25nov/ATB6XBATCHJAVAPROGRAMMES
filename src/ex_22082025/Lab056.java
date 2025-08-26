package ex_22082025;

public class Lab056 {
    public static void main(String[] args) {
        String s1="SAURABH JADHAV";
        String s2=s1;

        System.out.println(s2);
        String s3="THE SAURABH JADHAV";
        s3.toLowerCase();
        System.out.println(s3); //The name SAURABH JADHAV Should be in small letter's only but we have not
        //assigned the value then new string is created in The SCP and the string is floating on SCP
        //both lin no 9 and 11 pointed towards the first created string
        String s4="THE SAURABH JADHAV";
       s4= s4.toLowerCase();
        System.out.println(s4);

        //In above scenario we have assigned the new string that's wht the string converted int LWCS


    }
}
