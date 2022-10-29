package chap16;

import java.time.LocalDate;
import java.time.Month;

public class Example03 {

    public static void main(String[] args) {

        LocalDate birhtday = LocalDate.of(1995, Month.APRIL, 19);
        System.out.println(birhtday);
    }
}
