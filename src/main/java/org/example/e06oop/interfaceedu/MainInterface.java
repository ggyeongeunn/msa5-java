package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        // Fish fish = new Fish(); // 추상 클래스는 인스턴스화 불가능
        System.out.println(flyingFish.flying());
        // Flight flight = new Flight(); // interface도 인스턴스화 불가능
        Whale whale = new Whale();
        System.out.println(whale.residence());

        Fish fish = new FlyingFish();
    }
}
