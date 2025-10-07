package ex_04102025;

public class BankAccount {
    String Bank_Name;
    int balanace;
    String bank_code;

     BankAccount() {
        Bank_Name="HDFC";
        balanace=90;
        bank_code="HDFC1947";

    }
    void printdetails(){
        System.out.println("Bank Name"+Bank_Name);
        System.out.println("balace"+balanace);
        System.out.println("The Bank Code"+bank_code);
    }

}
