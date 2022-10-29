package chap16;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example06 {

    public static void main(String[] args) {

        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println(DateTimeFormatter.ofPattern("G y年M月d日(E)", Locale.JAPANESE).format(japaneseDate));
    }
}
