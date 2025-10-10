package ex_09102025;

public class Lab177SBI {
  public   static void main(String[] args) {

      BankAccountSBI sbi_ref = new BankAccountSBI();
      sbi_ref.printDetails();

      BankAccountSBI hdfc_ref = new BankAccountSBI(10,"HDFC001","HDFC");
      hdfc_ref.printDetails();

      BankAccountSBI icici_ref = new BankAccountSBI(20,"icici003","ICIC");
      icici_ref.printDetails();

      BankAccountSBI yesbank_ref = new BankAccountSBI("YES bANK","YES005");
      yesbank_ref.printDetails();
    }
}
