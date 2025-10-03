package ex_01102025;

public class Lab153 {
    public static void main(String[] args) {
//There are four types of functions
        //No return with no parameters
        SaySomethingPlease();
        //No Retrun with Parameters
        SayHelloToYou("Saurabh");
        //Return with No Parameters
        SayBad(4, 19);
        //Return with Parameters
        int num1=sayGood(19,10);
        System.out.println(num1);
    }

     static int sayGood(int a, int b) {
        return (a+b);
    }

     static void SayBad(int a , int b) {
        System.out.println(a + b);

    }
    static void SayHelloToYou(String name) {
        System.out.println("hello"+name);

    }
    static void SaySomethingPlease() {
        System.out.println("No return with no parameters");
    }
}
