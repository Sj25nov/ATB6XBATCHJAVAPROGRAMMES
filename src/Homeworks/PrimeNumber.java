package Homeworks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        String original="Saurabh";
        String reverse="";

        for(int i=original.length()-1;i>=0;i--) {
            reverse = reverse + original.charAt(i);
        }
            {
                System.out.println("Actual String"+original);
                System.out.println("Reversed String"+reverse);
            }

        }
    }
