package chap15;

import java.util.ArrayList;

public class Example04 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0) + list.get(1) + list.get(2));
    }
}
