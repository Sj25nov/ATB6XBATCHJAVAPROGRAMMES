package ex_26082025;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        //grade calculator programme

        //Grade A--->90-100
        //Grade B--->89-80
        //Grade C--->79-70
        //Grade D--->69-60
        //Grade F--->59-0

        //Step1
        // Find the input from the use
        //Score data type is integer
        //Return---grade (Character)
        //Step2
        //Basic Login
        //If(score>=90&&score<=100)--->Grade A
        //else if(Score<=89 && Score<=80)--->Grade B
        //else --->Grade F
        System.out.println("Enter your score");

        Scanner Sc=new Scanner(System.in);
        int score= Sc.nextInt();
        char grade='F';
        if(score>=90 && score<=100){
            grade='A';
        } else if (score >= 80 && score<=89) {
            grade='B';

        } else if (score >= 70 && score<=79) {
            grade='C';

        }else if (score >= 60 && score<=69) {
            grade = 'D';
        }else if(score<0 && score>100){
            System.out.println("LOL...!! Are you God");
        }
        else {
            grade='F';
        }
        System.out.println("Your grade is-->"+grade);
        Sc.close();
    }
}
