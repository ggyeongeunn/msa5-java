package org.example.e09generics;

public class Box<T> {
    // 필드
    public T arr;

    // 생성자 메서드 : 외부로부터 받은 파라미터를 내부 배열에 초기화 하는 작업
    public Box(T arr) {
        // 필드에 접근
        // 내가 가진 멤버들에 접근
        this.arr = arr;
        this.test();
    }
    public void test() {
        System.out.println("test");
    }
}
