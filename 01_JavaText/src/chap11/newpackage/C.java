package chap11.newpackage;

import chap11.A;

public class C extends A {

    public void doSomething() {

        a = 10;
        b = 20;
//        c = 30;
//        d = 40;

        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        C c = new C();
        c.doSomething();
              
    }

}
