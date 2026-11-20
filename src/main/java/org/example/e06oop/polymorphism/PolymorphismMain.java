package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale(); // Whale이 Mammal을 상속받고 있기 때문

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Saba saba1 = new Saba();
        // Mammal saba2 = new Saba(); // type error

        //------------------------------------

        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();

        //------------------------------------

        // UpCasting : 자식 클래스가 부모 클래스 타입으로 캐스팅(형 변환) 되는 것
        //      - 부모 클래스로 캐스팅 되면 자식 클래스에 있는 멤버에는 접근 불가능

        Mammal upCasting1 = new Whale();
        // upCasting1.swimming(); // 자식 클래스의 swimming() 접근 안됨

        // DownCasting : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅 하는 것
        Whale downCasting1 = (Whale) upCasting1; // (Whale) : 데이터 타입 Whale을 캐스팅 하겠다는 문법
        downCasting1.swimming();

        // Mammal mammal1 = new Mammal();
        // Whale whale3 = (Whale) mammal1;
    }
}
