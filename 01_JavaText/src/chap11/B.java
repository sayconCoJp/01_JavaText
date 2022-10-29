package chap11;

public class B {

    public void doSomething() {
        A a = new A();

        a.a = 10;
        a.b = 20;
        a.c = 30;
//        nc.d = 40;

        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);

    }

    public static void main(String[] args) {
        B b = new B();
        b.doSomething();
    }
}
