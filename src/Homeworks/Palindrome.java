package Homeworks;

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {

       //Palindrome---->121 Reverse ---->121

       //Malyalam---
       //121
       //naman
       Scanner sc=new Scanner(System.in);
       System.out.println("Give me a name or number i will tell u itis palindrome or not");
       String s1=sc.nextLine();

       StringBuilder sb=new StringBuilder(s1);
       String rev_user_input= sb.reverse().toString();
       if(s1.equalsIgnoreCase(rev_user_input)){
           System.out.println("Palindrome");
       }else
        System.out.println("Nope.....!!!!");
    }
}
