package org.example.e14record;

// record 이전
// public class EduRecord {
//     private final String name;
//     private final int age;
//
//     public EduRecord(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//
//     // alt + insert -> getter
//     // 관습적으로 get + field명으로 네이밍 (setter는 set + field)
//     public String getName() {
//         return name;
//     }
//
//     public int getAge() {
//         return age;
//     }
// }

// record
public record EduRecord(
    String name,
    int age
) {}
