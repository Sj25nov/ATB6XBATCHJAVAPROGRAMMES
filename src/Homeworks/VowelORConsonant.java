package Homeworks;

import java.util.Scanner;

public class VowelORConsonant {
    public static void main(String[] args) {

       Scanner Sc = new Scanner(System.in);
        System.out.println("Give the charcater ");
        char ch= Sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch== 'I' || ch== 'O' || ch == 'U')
        {
            System.out.println("It's Vowel");
        } else {
            System.out.println("Its Consonant");
        }
    }
}


       /* Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||

                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }


    }
}*/
