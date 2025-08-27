package ex_27082025;

public class Lab085 {
    public static void main(String[] args) {
        //JDK>13
int item_code=9;
switch (item_code) {
    case 001, 002, 003:
        System.out.println("It is the Electronic Device");
        break;
    case 004, 005, 006:
        System.out.println("It is the Mechanical Device");
        break;
    default:
        System.out.println("None");
        break;
}

    }
}
