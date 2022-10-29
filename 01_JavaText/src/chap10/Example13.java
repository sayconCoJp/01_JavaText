package chap10;

class First {

    public First() {
        System.out.println("Hello from First");
    }
}

class Second extends First {

    Second() {
        super();
        System.out.println("Hello from Second");
    }
}

class Third extends Second {

    Third() {
        super();
        System.out.println("Hello from Third");
    }
}

public class Example13 {

    public static void main(String[] args) {
        Third t = new Third();
    }
}
