package org.example.e06oop;

public class Whale {
    // Field
    public String name = "고래"; // instance variable
//    public static int age = 20; // class variable
    // static : 인스턴스(객체)를 생성하지 않고도 곧바로 사용
    // 설정값?(외부 서버 주소값?) 제한적인 상황에서 사용

    // 생성자 메서드
    Whale() {}

    // Method
    public void swimming() {
        System.out.println("swimming whale");
    }
}
