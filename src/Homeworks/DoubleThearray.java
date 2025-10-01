package Homeworks;

public class DoubleThearray {
  public   static void main(String[] args) {
      int arry[]={10,20,30};
      int arr1[]=new int[3];
      for (int i = 0; i < arry.length ; i++) {
          arr1[i]=arry[i]*2;
      }
        System.out.println("The Double Of Arrays are follow......!!");
      for (int i = 0; i <arry.length ; i++) {
          System.out.println("The double of array is----->"+arr1[i]);

      }
    }
}
