package ex_11102025;

public class Java extends Programming{

    //single inheritance-->is a
   // Java is a programming language
    // Python is a programming language

    String newFeatures;
//    int version;
//    String autor_name;  it means using extends both the attributes are avaialble from programming to java


    public Java()
    {
        System.out.println("DC");
    }

    public Java(String newFeatures){
        System.out.println("PC");
        this.newFeatures=newFeatures;

    }
    void printinfo () {
        System.out.println("The Programming Lang is" + newFeatures);
BHK();
    }
}
