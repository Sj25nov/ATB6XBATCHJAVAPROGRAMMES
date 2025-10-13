package ex_11102025;

public class Lab180 {
  public   static void main(String[] args) {

      //Inheritance
      //Basically it inherited the behaviur's and attributes from the parent , grandparent
      //superclass,parentclass,Baseclass
      //subclass,childclass,derivedclass
      //Parent--->child
      //child extend the parent{}
// extends--->Parent's attributes and behaviour to the child.

      //Single Inheritance
      //PArent--->Programming || child---->Java
      // java extends programming
      Programming P=new Programming(12,"SJ");
      Java j=new Java("lambdaexpression");
      P.printinfo();
      j.printinfo();

      Programming P1=new Programming(9,"SNJ");

        System.out.println();
    }
}
