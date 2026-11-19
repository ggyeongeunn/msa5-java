package org.example.e06oop.interfaceedu;

abstract class Fish {
    protected String name;
    protected String residence;

    // Alt + insert -> generator (constructor)
    public Fish(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    abstract String residence();
    public String birth() {
        return String.format("%s가 알을 낳습니다", this.name);
    }


}
