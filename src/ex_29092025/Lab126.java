package ex_29092025;

import java.util.Arrays;

public class Lab126 {
   public static void main(String[] args) {
       //final Keyword--->We can't reassigned the value once u have assigned the value
       final int []num=new int[4]; //in this case final length is there we can't modified the length
       num[3]=78;
       num[3]=70;
       System.out.println(num[3]);
    }
}
