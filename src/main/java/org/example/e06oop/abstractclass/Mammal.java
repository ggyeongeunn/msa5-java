package org.example.e06oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;

    public String breath() {
        return String.format("%s is breath", this.name);
    };
    // 추상 메서드(Abstract Method)
    // 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현하도록 강제하는 메서드

    // 구현부{}가 없음
    // method 바로 위에서 /** + enter -> 메세지 출력 가능
    /**
     * 해당 메서드는 반드시 사는 곳을 출력하기 위해 문자열을 반환하는 작업을 해라.
     * @return
     */
    public abstract String living();
}
