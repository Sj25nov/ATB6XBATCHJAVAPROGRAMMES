package ex_22082025;

public class Lab052 {
    public static void main(String[] args) {
        int a=87;
        int b=91;
        String s1="SB";
        String s2="SBJ";
        System.out.println(s1+s2+a+b); //concatenation happen first and then assign the value
        System.out.println(s1+s2+(a+b)); //Because of bracket first Addition happen and the concatation

        //(BODMAS Rule--->Brackets of Divisions,Multiplication,Addition,)
    }
}
