package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        bool = false;
//        bool = 1;  선언할 때의 데이터 타입과 다를 경우, 타입 에러 발생
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("now consist bool is %s", bool);

        // 변수 선언
        int age;
        age = 1; // 값의 초기화 문자를 넣으면 아스키코드로 인식해서 숫자가 출력되긴 함
        char ch = 'a'; // ""사용시 에러, 딱 한 글자 문자 타입
        String str = "a";

        // 상수 (상수명은 대문자 + 언더바 사용)
        final String USER_NAME = "길동이";

        // Underscore 표기법
        int num = 123_456_789;

        // 두 변수의 값을 스와핑
        int swap1 = 1;
        int swap2 = 2;
        int tmp;

        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입
        boolean bool2 = true;
        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L;
        // Long 타입은 반드시 마지막에 L 입력(안 넣으면 int 타입으로 인식)

        double db = 3.141592;
        float ft = 3.141592F;
        // Float 타입은 반드시 마지막에 F 입력(안 넣으면 double 타입으로 인식)

        char ch1 = 'g'; // 딱 하나의 문자만 값으로 가짐 ''안에 작성해야 함

    }
}
