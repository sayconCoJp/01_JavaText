package chap14;

import chap11.Player;

public class Player4 extends Player {

    private int balance = 1000;

    @Override
    public void withdraw(int amount) throws IllegalArgumentException {
        if ((amount) < 0) {
            IllegalArgumentException e = new IllegalArgumentException("出金額は正の整数のみです");
            throw e;
        }
        if ((balance - amount) < 0) {
            IllegalStateException e = new IllegalStateException("残高不足です");
            throw e;
        }
        balance -= amount;
        System.out.println("現在の残高です：" + balance);
    }
}