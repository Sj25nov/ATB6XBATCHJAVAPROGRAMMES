package ex_11092025;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Your Sec Number");
        int num2=sc.nextInt();
        System.out.println("Enter The Operation that you want to perform +,-,*,%,/");
        char operation=sc.next().charAt(0);
        switch (operation){
            case '+':
            System.out.println("The Result is "+(num1+num2));
            break;
            case '-':
                System.out.println("The Result is"+(num1-num2));
                break;
            case'*':
                System.out.println("The Result is"+(num1*num2));
                break;
            case'%':
                System.out.println("The Result is"+(num1%num2));
                break;
            default:
                System.out.println("Not in scope");
                break;
        }
sc.close();
    }
}
