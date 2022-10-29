package chap14;

public class Example13 {

    public static void main(String[] args) {
        Player4 p4 = new Player4();
        try {
            p4.withdraw(1200);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
