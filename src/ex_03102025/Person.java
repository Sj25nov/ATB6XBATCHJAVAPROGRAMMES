package ex_03102025;

public class Person {
     //Attributes
       String Name;
       byte age;
       long phone_no;
       String[]address;
       double height;
       boolean ismale;
       float salary;
       String DOB;
       String eye_colour;

       //Functionality/Behaviour

       // Behav / Functionality
       void walk()
       {
           System.out.println("I can walk");
       }
       void talk(String msg){
           System.out.println("I will say ->"+ msg);
       }
       String sleep(){
           return "Sleeing";
       }
       String eat(String item){
           return item;

    }
}
