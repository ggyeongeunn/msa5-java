package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

public class MainOOP {
    public static void main(String[] args) {

        // Whale whale = new Whale();  // 인스턴스화
        //
        // // 데이터 타입 변수명 = 생성자 메서드(Construct Method) 호출
        // // Whale이란 객체 타입을 저장(생성한 클래스가 새로운 데이터 타입이 됨)
        //
        // FlyingFish flyingFish = new FlyingFish();
        // System.out.println(whale.name);
        // whale.swimming();
        // whale.name = "돌고래";
        // System.out.println(whale.name);
        // System.out.println(Whale.age);

        // 캡슐화
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.strDefault);
        System.out.println(accessModifier.strProtected);
        System.out.println(accessModifier.strPublic);

        accessModifier.fnDefault();
        accessModifier.fnProtected();
        accessModifier.fnPublic();

        System.out.println(accessModifier.getStrPrivate());

        // overloading
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        // ex) System.out.println();
        System.out.println();
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1, 5));

        // 객체 인스턴스화
        // 생성자 호출해야 메모리에 올리는 작업이 실행
        ConstructOOP constructOOP = new ConstructOOP();

        // =================================
        // 상속
        System.out.println("================================");
        FlyingFish flyingFish = new FlyingFish("FlyingFish","Sea");
        System.out.println(flyingFish.breath());
        System.out.println(flyingFish.flying());
        System.out.println(flyingFish.living());

        System.out.println("================================");
        Whale whale = new Whale("Whale", "Sea");
        System.out.println(whale.breath());
        System.out.println(whale.swimming());
        System.out.println(whale.living());
    }
}