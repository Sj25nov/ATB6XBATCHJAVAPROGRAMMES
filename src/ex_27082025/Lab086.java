package ex_27082025;

public class Lab086 {
    public static void main(String[] args) {
        //jdk>13
        int item_code=001;
        switch (item_code){
            case 001-> System.out.println("It is the laptop"); //Arrow not need to use the break
            case 002-> System.out.println("It is Mobile");
            case 003-> System.out.println("It is the bike");
            default -> System.out.println("none");
        }
        char ch='c';
        switch (ch){
            case 'a','e','i','o','u'-> System.out.println("It is the vowel");
            default -> System.out.println("It is consonant");
        }
        System.out.println();
    }
}
