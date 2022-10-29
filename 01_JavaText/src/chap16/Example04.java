package chap16;

import java.time.LocalDate;
import java.time.Month;

public class Example04 {

    public static void main(String[] args) {

        LocalDate birhtday = null;
        try {
            birhtday = LocalDate.of(1995, Month.APRIL, 31);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(birhtday);
    }
}
