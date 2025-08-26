package ex_20082025;

public class IQ002 {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int result=a+b;

        System.out.println(result);

        String name="Saurabh";
        System.out.println(a+name);//The code started executed from left to right only
        System.out.println(name+a);//ode started executed from left to right only
        System.out.println(a+b+name);
        System.out.println(name+a+b);  //Concatination refers tothe process of joining two or more strings together to form a single, new string
}}
