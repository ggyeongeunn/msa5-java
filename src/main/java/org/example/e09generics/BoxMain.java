package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        int[] arr2;
        arr2 = new int[3];
        int[] arr5 = new int[2];        // 선언과 생성을 분리하는 방식
        Box<int[]> boxIntArr = new Box<>(new int[3]);       // 선언과 생성을 동시에 하는 방식
        Box<String[]> boxStringArr = new Box<>(new String[4]);

        // primitive 타입은 generics 를 사용할 수 없음
        // -> Integer
        Box<Integer> boxInt = new Box<>(2);

        Integer a = 1; // autoboxing : integer는 참조타입인데 자바가 자체적으로 int타입으로 변환
        // int b = a.intValue(); // unboxing : int에 들어가있는 데이터를 꺼내는 것

        // generic type 이 TV인 BoxRestrict
        // BoxRestrict<TV> boxRestrict1 = new BoxRestrict<>();
        BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict3 = new BoxRestrict<>();

        // <T>에 App 타입만 지정해줬을 경우 Book타입은 에러
        // interface로 지정해줬을 경우 해당 interface만 가능
    }
}
