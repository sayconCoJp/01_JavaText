package chap16;

import java.time.LocalTime;

public class Example07 {

    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalTime localTime2 = LocalTime.of(23, 59);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }
}
