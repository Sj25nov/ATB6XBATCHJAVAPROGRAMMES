package ex_29092025;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter The first subject marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter The Second Subject marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter The Third Subject marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter The forth Subject marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter The fifth Subject marks");
        marks[4] = sc.nextFloat();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                System.out.println("Failed in subject" + marks[i]);
            }
            System.out.println(+marks[i]);
        }
        int j = 0;
        while (j < marks.length) {
            System.out.println(marks[j]);
            j++;

        }
        sc.close();
    }
}
