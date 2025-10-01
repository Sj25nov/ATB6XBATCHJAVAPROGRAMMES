package ex_30092025;

public class Lab143 {
   public static void main(String[] args) {

       String s1="Saurabh";        //---->        SCP-String Constant Pool
       String s2=new String("Jadhav"); //--------->Qbject Area
//Strings are immutable in nature once created it can't be changed

       StringBuffer s3=new StringBuffer("Saurabh");
       s3.append("Jadhav");
       System.out.println(s3);

       StringBuilder s4=new StringBuilder("Saurabh Bhimrao");
      // s4.append("Jadhav");
       s4.reverse();
      // System.out.println(s4);
       System.out.println(s4);
    }
}
