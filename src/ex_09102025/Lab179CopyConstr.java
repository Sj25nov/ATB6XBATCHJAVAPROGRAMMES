package ex_09102025;

public class Lab179CopyConstr {
    String name;
    int age;


    Lab179CopyConstr(String name,int age){
        System.out.println("The Details Of the person");
        this.age=age;
        this.name=name;
    }

public     static void main(String[] args) {
        Lab179CopyConstr ref1=new Lab179CopyConstr("SJ",26);
    System.out.println(ref1.name);
    System.out.println(ref1.age);
    System.out.println(ref1.name+"is"+ref1.age+"age is");
    }
}
