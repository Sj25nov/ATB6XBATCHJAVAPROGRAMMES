package ex_20082025;

public class Lab019 {
    public static void main(String[] args) {

        //constant--->also called as the final (It indicates that the value can't be changed during code executions
        final float pi=3.14f;
        // pi=9.99;  (This scenario should not work)
        System.out.println(pi);

        //If we use scenario 2
        float pi1=3.14f;
        pi1=9.11f;

        System.out.println(pi1);


    }
}
