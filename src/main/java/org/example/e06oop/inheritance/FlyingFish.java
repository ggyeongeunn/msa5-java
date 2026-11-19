package org.example.e06oop.inheritance;

public class FlyingFish extends Animal {
    // 상속하는 이유 : 추상화 -> 코드 중복의 제거 -> 재사용성 증가
    // 재사용을 위해 상속하진 말기
    // private String name;
    // private String residence;

    public FlyingFish(String name, String residence) {
        // this.name = name;
        // this.residence = residence;
        // 자식쪽에서 부모 호출
        super(name, residence);
        System.out.println("Flying fish constructor");
    }

    // breath method 생성
    // ! 생성자 : 클래스명이랑 동일, 리턴타입 없음 !
    // public String breath() {
    //     return String.format("%s이/가 숨을 쉽니다", this.name);
    // }

    public String flying() {
        // super error -> 부모의 필드에 private -> protected로 변경
        return String.format("%s is flying", super.name);
    }

    // public String living() {
    //     return String.format("%s이/가 %s에서 삽니다", this.name, this.residence);
    // }

    // class diagram
    // class / attributes / method

    // overriding : 부모한테서 상속받은 메서드를 자식쪽에서 재정의 하여 사용
    // annotation?
    @Override
    // 부모한테서 final 빼세요
    // field에 final -> 상수됨
    // class에 final -> 상속이 안 됨 : 더이상 상속되지 않는다는 코드성 경고
    public String living() {
        return "edited";
    }
}
