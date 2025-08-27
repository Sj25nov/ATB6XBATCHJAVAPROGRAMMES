package ex_27082025;

public class Lab087 {
    public static void main(String[] args) {

        char code = 'B';
        int val = switch (code) { //removes all the code and print statement int val=67
            case 'A':
                yield 66;
            case 'B':
                yield 67; //yield is used to return something
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");
        };
    }
}
