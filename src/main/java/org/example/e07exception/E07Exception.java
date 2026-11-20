package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    public static void main(String[] args) {
        try {
            System.out.println("start Try");
            throw new Exception("trigger");
            // double result = 10 / 0;
            // System.out.println("end Try");
        } catch (ArithmeticException e) {
            // Exception 에러가 ArithmeticException의 상위 개념
            // 자식 예외처리를 밑에 작성하면 무조건 상위 개념 예외처리부터 실행 됨
            // ArithmeticException 처리가 안 됨
            // 자식 exception부터 상위에 작성
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("start catch");
            System.out.println(e.getMessage());
            System.out.println("end catch");
        } finally {
            System.out.println("finally");
        }

        // Try with Resource
        FileWriter file = null;

        try {
            // 파일을 쓰기 모드로 불러오기 처리
            file = new FileWriter("text.txt");
            file.write("!Java!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try(FileWriter file1 = new FileWriter("text.txt")) {
            file1.write("hihi");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
