package org.example.e10collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        // Map : 상위 개념(UpCasting), 다형성을 이용하기 쉬움
        Map<String, Integer> hashMap = new HashMap<>();

        // hashMap.put(key, value);
        hashMap.put("age", 20);
        hashMap.put("price", 10000);
        hashMap.put("price", 20000);
        // 같은 키 -> 값 덮어씌움

        System.out.println(hashMap.get("price"));
    }
}
