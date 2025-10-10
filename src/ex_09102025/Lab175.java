package ex_09102025;

public class Lab175 {
    public static void main(String[] args) {
        //Parameterized constructor
ATPPerson1 Reference1=new ATPPerson1();
Reference1.name="Manisha";
System.out.println(Reference1.name);
ATPPerson1 SaurabhRef=new ATPPerson1("Saurabh",9545801414l);
System.out.println(SaurabhRef.name);
System.out.println(SaurabhRef.Mobile_no);
ATPPerson1 RatulRef1=new ATPPerson1("Ratul",9623141483l);
System.out.println(RatulRef1.name);
System.out.println(RatulRef1.Mobile_no);
//called 2 times
        //created 1 times object in SC

    }
}
