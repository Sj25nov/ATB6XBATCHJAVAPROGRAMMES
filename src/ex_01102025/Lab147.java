package ex_01102025;

public class Lab147 {
 public    static void main(String[] args) {

        System.out.println("The Function calling");
        f1();
        f1();
        f2();
        f2();
        f1();
        f2();
    }
   static void f1 (){
       System.out.println("Execute The Function 1");
   }
   static void f2(){
       System.out.println("Execute The Function 2");
   }
}
