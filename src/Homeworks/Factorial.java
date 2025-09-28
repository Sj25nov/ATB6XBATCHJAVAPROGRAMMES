package Homeworks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Factorial Programme
        //1!=1*1=1
        //2!=2*1=2
        //3!=3*2*1=6
        //4!=4*3*2*1=24
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Me the Number i will tell the factorial of that number");
        int number = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial For Given Number is---->"+fact);
        sc.close();
    }
}
