package org.example.e06oop.inheritance;

public class Whale extends Animal {
//     // Field
//     public String name = "고래"; // instance variable
// //    public static int age = 20; // class variable
//     // static : 인스턴스(객체)를 생성하지 않고도 곧바로 사용
//     // 설정값?(외부 서버 주소값?) 제한적인 상황에서 사용
//
//     // 생성자 메서드
//     // Whale() {}
//
//     // Method
//     public void swimming() {
//         System.out.println("swimming whale");
//     }

    // private String name;
    // private String residence;

    public Whale(String name, String residence) {
        // this.name = name;
        // this.residence = residence;
        super(name, residence);
        System.out.println("Whale constructor");
    }

    // breath method 생성
    // ! 생성자 : 클래스명이랑 동일, 리턴타입 없음 !
    // public String breath() {
    //     return String.format("%s이/가 숨을 쉽니다", this.name);
    // }

    public String swimming() {
        // extends upperClass 해주면 super, this 둘 다 사용 가능
        return String.format("%s is swimming", super.name);
    }

    // public String living() {
    //     return String.format("%s이/가 %s에서 삽니다", this.name, this.residence);
    // }
}
