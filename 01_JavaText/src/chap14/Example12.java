package chap14;

public class Example12 {

    public static void main(String[] args) {
        Player4 p4 = new Player4();
        try {
            p4.withdraw(-200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
