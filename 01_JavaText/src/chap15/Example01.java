package chap15;

import java.util.ArrayList;

public class Example01 {
     public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
          list.add("abc");
          list.add("def");
          list.add("ghi");
          System.out.println(list.get(0));
     }
}