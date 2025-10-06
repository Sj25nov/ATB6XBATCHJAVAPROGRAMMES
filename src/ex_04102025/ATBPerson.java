package ex_04102025;

public class ATBPerson {

    // variables--->
    // local Variables--->Those variables present into main method
    String name;  //Instance variables(Because they are directly present inside the class)
    boolean is_married;
    String course_name;
    long Phone;
    String email;

    //Constructor
//Default Constructor

    ATBPerson(){
        System.out.println("Default--->Hello --->I will be called when you have created the object of class");
    }


   void ATBPerson(){
      System.out.println("Hello");
    }

    ATBPerson(String Given_name){
        System.out.println("Saurabh");
    }



}
