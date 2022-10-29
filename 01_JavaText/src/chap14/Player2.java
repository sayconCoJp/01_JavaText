package chap14;

import chap11.Player;

public class Player2 extends Player {
    
    private int balance = 1000;

    @Override
    public void withdraw(int amount) {
        if ((balance - amount) < 0) {
            OriginalException e = new OriginalException("残高不足です");
            throw e;
        } else {
            balance -= amount;
            System.out.println("現在の残高です：" + balance);
        }
    }
}
