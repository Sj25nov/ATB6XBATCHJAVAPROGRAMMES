package ex_04102025;

public class Lab166 {

 public    static void main(String[] args) {

     ATBPerson DetailsStudent=new ATBPerson();
     DetailsStudent.name="Saurabh";
     DetailsStudent.course_name="Java_AutomationBatch";
     DetailsStudent.email="saurabhj1414@gmail.com";
     DetailsStudent.is_married=false;
     DetailsStudent.Phone=9545801414l;

     //Class name-->Object Ref= new keyword classname();
     //object --->New ATBPerson
     //ObjectRef-->DeatilsStudent
     //class--->ATBPerson
//     ATBPerson DetailsStudent=ATBPerson;---->Normal Calling Of Function



     System.out.println(DetailsStudent.name);

    }
    //Class-->It is the blueprint to creating the objects

  //  there are two parameters that can be considered
      //      1)Attributes & Behaviour
 //   Methods--->Functions Present in the class
    //Object---->It is the realtime entity



}
