package ex_01102025;

public class Lab151 {
    public static void main(String[] args) {

        int num1 = MultiplyOfTw(9, 8);
        System.out.println(num1);
        int num2 = MultiplyOfTw(14, 14);
        System.out.println(num2);
        String s1=MultiplyOfTw("Pramod",19);
        System.out.println(s1);

    }
    static int MultiplyOfTw(int a, int b) {
        return a * b;
    }
    //Same Method Name but different in parameters/rule
    //Here we have two methods with same name but they behave likes diffrently method 1--->Addition Method 2---->Multipliaction
    static  String MultiplyOfTw(String a,int b){
        return(a);
    }
    }

