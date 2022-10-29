package chap16;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example05 {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, Month.APRIL, 19);

        System.out.println(DateTimeFormatter.ofPattern("uuuu/M/d(E)", Locale.JAPANESE).format(birthday));
    }
}
