package Homeworks;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int []numbers={-1,1,3,2,4,0};
        System.out.println(Arrays.toString(numbers));
//new is basically operator
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
