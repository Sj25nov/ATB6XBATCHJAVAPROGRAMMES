package ex_29092025;

public class Lab127 {
   public static void main(String[] args) {
       // (==)check the reeferneces from JVM
       //(.equals) Compares the values from both
       int[] num1={1,2,3,4,5};
       int[] num2={1,2,3,4,5};
        System.out.println(num1==num2);
        System.out.println(num1); //There location place different
        System.out.println(num2);
        System.out.println(num1.equals(num2)); // incase if array it refers object.class and check the reference
       String s1="Saurabh";
       String s2="Saurabh";

       System.out.println(s1.equals(s2)); //It Goes on the string.class and generally do the comparisons

       //For string only .equals method check the compares the values for other it check the reference from JVM
    }
}
