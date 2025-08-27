package ex_27082025;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {

        //user input as character and tyell the user it is the vowel
        //vowels-->a,i,e,o,u
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give me character i will tell it vowel or not");
        char user_input=Sc.next().charAt(0);
        System.out.println(user_input);
        switch (user_input){
            case 'a':
                System.out.println("It is vowel");
                break;
            case 'e':
                System.out.println("It is Vowel");
                break;
            case 'i':
                System.out.println("It is Vowel");
                break;
            case 'o':
                System.out.println("It is vowel");
                break;
            case 'u':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is not a vowel it is consonant");
        }
Sc.close();
    }
}
