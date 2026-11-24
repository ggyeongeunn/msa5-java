package org.example.e12stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        // Collection List
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);

        List<Integer> copyList = new ArrayList<>();
        list.forEach((i) -> {
            copyList.add(i+3);
        });
        System.out.println(copyList.toString());
        for(int idx = 0; idx < list.size(); idx++) {
            copyList.add(list.get(idx) + 3);
        }
        System.out.println("copyList");
        System.out.println(copyList.toString());

        // List<Whale> whaleList = new ArrayList<>();
        // whaleList.add(new Whale("pink whale","sea"));
        // whaleList.add(new Whale("mink whale","sea"));
        // whaleList.forEach((item) -> {
        //     System.out.println(item.living());
        // });

        List<Integer> result1 = list.stream()
            .map((i) -> i + 3)
            .toList();
        System.out.println("result1");
        System.out.println(result1.toString());

        // 짝수의 개수를 구하시오
        int cnt = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                cnt++;
            }
        }
        System.out.println("cnt");
        System.out.println(cnt);

        List<Integer> result2 = list.stream()
            .filter((i) -> i % 2 == 0)
            .toList();
        long result3 = list.stream()
            .filter((i) -> i % 2 == 0)
            .count();
        System.out.println("result2 & result3");
        System.out.println(result2);
        System.out.println(result3);
    }
}
