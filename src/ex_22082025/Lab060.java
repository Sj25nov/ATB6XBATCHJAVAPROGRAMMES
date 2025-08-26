package ex_22082025;

public class Lab060 {
    public static void main(String[] args) {
        String s1="Saurabh Jadhav"; //SCP
        String s2="Saurabh Jadhav";//SCP
        String s3=new String("Saurabh Jadhav"); //Heap Area


        System.out.println(s1==s2); //Check the references from SCP
        System.out.println(s1.equals(s2)); // Check the vlaues are equal or not
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

}

}