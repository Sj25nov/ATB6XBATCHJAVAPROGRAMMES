package ex_01102025;

public class Lab155 {
   public static void main(String[] args) {
       //Return vs Non Return

       // 1 Friend --->Money
       // 1 beggar---->Money
      int money= GiveMoneyFriend(1000);
       System.out.println(money);
      GiveMoneyBeggar();

    }

    static void GiveMoneyBeggar() {
        System.out.println("Blessings");
    }

    static int  GiveMoneyFriend(int i) {
       return i;
    }
}
