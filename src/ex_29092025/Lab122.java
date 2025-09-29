package ex_29092025;

import java.util.Arrays;

public class Lab122 {
    public static void main(String[] args) {

        int []numbers=new int[5];
        numbers[0]=9;
        numbers[1]=-1;
        numbers[2]=-2;
        numbers[3]=-3;
        numbers[4]=1;
        Arrays.sort(numbers);
        System.out.println("Sorted Arrays are----->"+Arrays.toString(numbers));
    }
}
