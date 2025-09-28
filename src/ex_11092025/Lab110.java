package ex_11092025;

public class Lab110 {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            if (i % 2 == 0) {
                System.out.println("It is Even Number"+i);
                continue;
            }
            System.out.println("It is odd number"+i);
        }
    }
}
