package Homeworks;

import java.util.Scanner;

public class LargestNoFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number 1");
        int num1 = sc.nextInt();
        System.out.println("Give Number 2");
        int num2 = sc.nextInt();
        System.out.println("Give Number 3");
        int num3 = sc.nextInt();
        if (num1 >=num2 && num1>=num3){
            System.out.println("Number 1 is greater-->"+num1);
        } else if (num2 >=num1 && num2 >=num3) {
            System.out.println("Number 2 is greater--->"+num2);
        } else {

            System.out.println("Number 3 is greater--->"+num3);
        }

    }
}

