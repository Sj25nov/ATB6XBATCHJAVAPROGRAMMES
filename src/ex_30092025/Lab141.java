package ex_30092025;

public class Lab141 {
   public static void main(String[] args) {
        int []num={33,34,68};
       for (int i = 0; i <num.length; i++) {
           System.out.println("The result is--->"+num[i]);

       }

        System.out.println("The Skipp----->");
       for (int item:num) {
           System.out.println(item);

       }
    }

}
