package ex_04102025;

import ex_03102025.Person;

public class Lab168 {
  public   static void main(String[] args) {

        ATBPerson DetailsStudent=new ATBPerson();
        ATBPerson DetailsStudent1=new ATBPerson();
        DetailsStudent.course_name="Java_AutomationBatch";
      System.out.println(DetailsStudent.course_name);
      ATBPerson Details=new ATBPerson("ATBPYTHONBATCH");
      System.out.println(Details.course_name);

    }
}
