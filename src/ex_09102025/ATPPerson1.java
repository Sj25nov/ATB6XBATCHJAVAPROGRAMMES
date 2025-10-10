package ex_09102025;

public class ATPPerson1 {
    String name;
    String email_id;
    long Mobile_no;
    boolean is_married;

    public ATPPerson1(String name, String email_id, long mobile_no, boolean is_married) {
        this.name = name;
        this.email_id = email_id;
        Mobile_no = mobile_no;
        this.is_married = is_married;
    }

    public  ATPPerson1(String name,String email_id){
        this.name=name;
        this.email_id=email_id;   //Constructor overriding
    }

      void details(){
        System.out.println("The Details Of Students are below");
    }
ATPPerson1(){
    System.out.println("Default constructor");
    name="ATB6XJAVAPROGRAMME";
}
void defaultCO(){
    System.out.println("The name"); //It is not a constructor because it is not returning any value --->void It is the function

    }
    ATPPerson1(String given_name,long given_mobileNo){
        System.out.println("This is the Parameterized Constructor");
        this.name=given_name;
        this.Mobile_no=given_mobileNo;
    }
    ATPPerson1(long mymobileno){
        System.out.println("The Mobile Number is");
        this.Mobile_no=mymobileno;
    }
}
