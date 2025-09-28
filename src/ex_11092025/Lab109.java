package ex_11092025;

public class Lab109 {
    //Continue ---->It is an keyword in java that tells if this is true then continue
    //if this is true then continue

    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After");
        }

    }
}
