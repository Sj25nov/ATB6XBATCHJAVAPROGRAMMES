package ex_27082025;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        //we can execute the multiple conditions using the if else but there was the limitations in that
        //with the help of switch statement we can execute the multiple conditions
        //If There was week and user want to know if user put 1 then what is the day
        //MTWTFSS-->1234567
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give me the number in between 1-7 i will tell you which is the day it is...!!");
        int day= Sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Only 1 to 7 numbers are allowed");
        }
        System.out.println("End of the programme");
    }
}
