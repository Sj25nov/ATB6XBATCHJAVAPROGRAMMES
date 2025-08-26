package ex_21082025;

public class Lab050 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //Part A-->A-->++a--->Exp1--->11,a-->11
        //Part B--->B-->a++-->Exp2--->11,a-->12
        //Part C---->C--->a++-->Exp3--->12,a-->13
    }
}
