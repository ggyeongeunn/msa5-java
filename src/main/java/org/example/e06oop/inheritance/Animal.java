package org.example.e06oop.inheritance;

public class Animal {
    protected String name;
    protected String residence;

    public Animal(String name, String residence) {
        this.name = name;
        this.residence = residence;
        System.out.println("Animal constructor");
    }

    // breath method 생성
    // ! 생성자 : 클래스명이랑 동일, 리턴타입 없음 !
    public String breath() {
        return String.format("%s is breath", this.name);
    }

    public String living() {
        return String.format("%s is living on the %s", this.name, this.residence);
    }
}
