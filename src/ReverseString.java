public class ReverseString {
    public static void main(String[] args) {

        String Original="Saurabh";
        String reverse="";

        for(int i=Original.length()-1;i>=0;i--){
            reverse=reverse+Original.charAt(i);
        }
        System.out.println("Your Original String is"+Original);


        System.out.println("Your New Reversed String is"+reverse);
    }
}
