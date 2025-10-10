package ex_09102025;

public class BankAccountSBI {

    String bankName;
            int balance;
            String bankCode;


            BankAccountSBI(){
                bankName = "SBI";
                bankCode = "SBI001";
                balance= 0;
            }

            BankAccountSBI(int balance, String bankCode,String bankName) {
                this.bankName = bankName;
                this.balance = balance;
                this.bankCode = bankCode;
            }

            BankAccountSBI(String bankName, String bankCode) {
                this.bankName = bankName;
                this.bankCode = bankCode;
            }

          public   void printDetails() {
                System.out.println("Bank Name -> " + bankName);
                System.out.println("Bank Code -> " + bankCode);
                System.out.println("Bal ->" + balance);
            }

        }