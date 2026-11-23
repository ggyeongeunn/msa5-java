package org.example.e10collection;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        // List : generic타입
        // List : 상위 개념(UpCasting), 다형성을 이용하기 쉬움
        List<Integer> list1 = new ArrayList<>(10);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);

        System.out.println(list1.get(1));
        System.out.println(list1.size());
        System.out.println("-------------");
        list1.forEach((i) -> {
            System.out.println(i);
        });
    }
}
