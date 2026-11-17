package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
            System.out.println(i);
            for(int z = 0; z < 5; z++){
                System.out.print(z);
            }
            System.out.println();
        }
        // 삼중 for문까지는 가지 말자

        System.out.println("================================");
        for(int i = 2; i < 10; i++){
            System.out.println("** " + i + "단 **");
            for(int j = 1; j < 10; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("================================");
        }
    }
}
