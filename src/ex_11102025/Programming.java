package ex_11102025;

public class Programming {
    int version;
    String autor_name;

    //default constructor
    Programming() {
        System.out.println("DC");
    }

    //Parameterized constructor
    public Programming(int version, String autor_name) {
        this.version = version;
        this.autor_name = autor_name;
    }

    //Normal Function
    void printinfo() {
        System.out.println("Prgramme Infor---->" + this.version + "Authorname---->" + this.autor_name);

    }

    void BHK() {
        System.out.println("3bhk");
    }
}