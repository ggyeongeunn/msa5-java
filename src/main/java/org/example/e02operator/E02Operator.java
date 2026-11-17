package org.example.e02operator;

public class E02Operator {
    public static void main(String[] args) {
        // 대입 연산자
        int num1 = 2;
        int num2 = 5;

        // 산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);
        System.out.println(num1 % num2);

        // 산술 대입 연산자
        int num3 = 1;
        num3 += 3;
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;
//        System.out.println(num3);

        // 증감 연산자
        int num5 = 0;
        System.out.println("======");
        ++num5;
        System.out.println(num5++);
        System.out.println(++num5);
//        System.out.println(num5);

        // 비교 연산자
        System.out.println("===========");
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열 비교
        String str1 = "str1";
        String str2 = "str1";
        String str3 = new String("str1");
        System.out.println("=======");
        System.out.println(str1 == str2);
        System.out.println(str1 == "str1");
        System.out.println(str1.equals(str2));  // 권장
        System.out.println(str1.equals(str3));  // 권장
        System.out.println(str1 == str3);   // false 비교 연산자 사용 금지
        // 레퍼런스 타입은 저장하는 값이 주소값이어서 str3은 새로운 객체로 지정해줘서 주소값이 각각 달라 false를 반환

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println("===========");
        System.out.println(num10 > 0 && num11 <= 11);
        System.out.println(num10 > 0 || num11 <= 11);
        System.out.println(!(num10 > 0));

        // 삼항연산자
        String result = num1 > num2 ? "num1이 크다" : "num1이 작다";
        System.out.println(result);
    }
}
