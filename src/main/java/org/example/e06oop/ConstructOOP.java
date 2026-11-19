package org.example.e06oop;

public class ConstructOOP {
    // field
    private String name;
    // private final String name; -> 어떠한 생성자에도 name 값이 없으면 에러뜸
    private int age;
    private final char gender;

    // Constructor(생성자) Method
    // 클래스를 인스턴스화 할 때 최초 1회만 실행
    // 주로 객체의 초기화 또는 인스턴스 생성 시, 실행되어야 할 작업을 위해 사용

    // 기본 생성자(default constructor)
    // 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    // method의 형태와 비슷한데 return 타입이 없음
    // 1번 생성자 메서드
    public ConstructOOP() {
        this("unknown", 20, 'M');
    }

    // custom constructor
    // overloading 과 유사(생성자 메서드도 overloading이 됨)
    // 2번 생성자 메서드
    public ConstructOOP(String name) {
        // this(); (파라미터가 없는 디폴트 생성자, 기본 생성자 호출)생략되어있음
        // -> 첫번째 생성자(1번) 메서드 호출
        // 내가 가진 필드에 접근
        // 나 자신(필드)의 name = 파라미터의 name
        // this(참조 변수) : 클래스 자기 자신을 가르킴
        // this.name = name;
        this(name, 20);
    }

    // 3번 생성자 메서드
    public ConstructOOP(String name, int age) {
        // 위에 있는 생성자 메서드(2번) 호출
        // this method가 제일 위에 있어야 함?
        this(name, age, 'M');
        // this에 접근하려면 this()(생성자)가 실행되어야 함
        // 우선 두 번째 생성자(2번 생성자 메서드)가 실행됨

        // this.age = age;
    }

    public ConstructOOP(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
