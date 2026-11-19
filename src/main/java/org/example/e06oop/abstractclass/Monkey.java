package org.example.e06oop.abstractclass;

public class Monkey extends Mammal {
    @Override
    // 부모클래스가 추상화가 됐을 때,
    // 자식 클래스에서 구현하지 않으면 강제적으로 작성하게끔 에러가 뜸(코드 에러)

    // 부모에서 선언해준 데이터 타입이랑 일치해야함
    public String living() {
        return "";
    }


}
