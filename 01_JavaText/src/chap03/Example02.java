package chap03;

public class Example02 {

    public static void main(String[] args) {
        int i = 1;
        int j = i + 1;
        System.out.println(j);

        j = j + 1;
        System.out.println(j);

        System.out.println(j += 1); //短縮表記の例１

        System.out.println(++j); //短縮表記の例２

        System.out.println(j++);

        System.out.println(j);
    }
}