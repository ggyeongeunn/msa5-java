package org.example.e03if;

public class E03If {
    public static void main(String[] args) {
        System.out.println("============================");
        int score;
        score = 101;
        if(score == 100) {
            System.out.printf("Your score is %d <A+>%n", score);
        } else if(score >= 90 && score < 100) {
            System.out.printf("Your score is %d <A>%n", score);
        } else if (score >= 80 && score < 90) {
            System.out.printf("Your score is %d <B>%n", score);
        } else if (score >= 70 && score < 80) {
            System.out.printf("Your score is %d <C>%n", score);
        } else if (score >= 60 && score < 70) {
            System.out.printf("Your score is %d <D>%n", score);
        } else if (score >= 0 && score < 60) {
            System.out.printf("Your score is %d <F>%n", score);
        } else {
            System.out.printf("Not score period%n");
        }
        System.out.println("============================");

        int score1 = 0;
        String grade = "";

        if(score1 == 100) {
            grade = "A+";
        } else if(score1 >= 90) {
            grade = "A";
        } else if(score1 < 90 && score1 >= 80) {
            grade = "B";
        } else if(score1 < 80 && score1 >= 70) {
            grade = "C";
        } else if(score1 < 70 && score1 >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // 89를 테스트한다고 했을 경우, 경계값을 같이 확인해봐야함
        // 88, 89, 90 ...
        // 전수조사 : 모든 케이스의 경우를 테스트 -> 시간이 너무 많이 소요됨

        if(score1 >= 0 && score1 <= 100) {
            System.out.printf("Your score is %d <%s> %n", score1, grade);
        } else {
            System.out.printf("Not score period %n");
        }

        // 위의 score 관련 if문을 if문으로 한 번 더 감싸는 방법도 있음
        if(score1 < 0 || score1 > 100) {
            // 조건문을 줄 때 정상 범주 외를 잡는게 보편적?
            // 조건문이 truthy or falsy 에 따라 내부 코드 순서가 바뀜
            System.out.printf("Not score period %n");
        }else {
            if(score1 == 100) {
                grade = "A+";
            } else if(score1 >= 90) {
                grade = "A";
            } else if(score1 < 90 && score1 >= 80) {
                grade = "B";
            } else if(score1 < 80 && score1 >= 70) {
                grade = "C";
            } else if(score1 < 70 && score1 >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf("Your score is %d <%s> %n", score1, grade);
        }
        // Switch Case
        int num = 10;
        switch(num) {
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }
    }
}