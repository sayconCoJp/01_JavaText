package chap16;

import java.time.LocalTime;

public class Example08 {

    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(10, 0);
        LocalTime localTime2 = LocalTime.of(15, 0);
        System.out.println(localTime1.isBefore(localTime2));
        System.out.println(localTime1.isAfter(localTime2));
    }
}
