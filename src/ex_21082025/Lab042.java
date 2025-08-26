package ex_21082025;

public class Lab042 {
    public static void main(String[] args) {
        int a=300;
        byte b1=(byte)a; // here we do explicit casting we are kept high level data into low level width

        System.out.println(b1);

        //generally it shoould be take value 300 but 300 is broken down into 32 bits and JVM analyzed only last 8 bits
        //Because of byte has 8 bits only so summasion of those values is 44
    }
}
