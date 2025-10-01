package ex_30092025;

public class Lab145 {
    public static void main(String[] args) {
        String Original="Saurabh";
        String Reverse="";
        for(int i=Original.length()-1;i>=0;i--){
            Reverse+=Original.charAt(i);
        }
        System.out.println("Reverse String is ---->"+Reverse);
    }
}
