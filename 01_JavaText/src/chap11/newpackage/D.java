package chap11.newpackage;

import chap11.A;

public class D {

    public void doSomething() {

        A a = new A();

        a.a = 10;
//        a.b = 20;
//        a.c = 30;
//        a.d = 40;

        System.out.println(a.a);

    }

    public static void main(String[] args) {
        D d = new D();
        d.doSomething();

    }

}
