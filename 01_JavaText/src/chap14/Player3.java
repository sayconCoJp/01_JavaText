package chap14;

import chap11.Player;

public class Player3 extends Player {

    private int balance = 1000;

    @Override
    public void withdraw(int amount) {
        if ((balance - amount) < 0) {
            OriginalException2 e = new OriginalException2("残高不足です");
            try {
                throw e;
            } catch (OriginalException2 ex) {
                System.out.println(ex);;
            }
        } else {
            balance -= amount;
            System.out.println("現在の残高です：" + balance);
        }
    }
}