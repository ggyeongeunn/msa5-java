package org.example.e11enum;

public enum Weeks {
    // Enum : 상수의 집합을 편리하게 선언하고 사용하기 위해서 만든 객체
    MONDAY("월요일", 1),     // private Weeks MONDAY = new Weeks();
    TUESDAY("화요일",2),
    WEDNESDAY("수요일",3),
    THURSDAY("목요일",4),
    FRIDAY("금요일",5),
    SATURDAY("토요일",6),
    SUNDAY("일요일",0);

    private final String krDay;
    private final int dayNum;


    Weeks(String krDay, int dayNum) {
        this.krDay = krDay;
        this.dayNum = dayNum;
    }
    // Getter
    public String getKrDay() {
        return this.krDay;
    }

    public int getDayNum() {
        return dayNum;
    }
}

// public class Weeks {
//
//     // enum -> class 변경
//     // public static final String MONDAY = "월요일";
//     // private Weeks MONDAY = new Weeks("월요일");
//     // private Weeks TUESDAY = new Weeks("화요일");
//     // public final static Weeks MONDAY = new Weeks();
//     // public final static Weeks TUESDAY = new Weeks();
//
//     public final static String MONDAY = "월요일";
//     public final static String TUESDAY = "화요일";
//
//     // private final String day;
//     // public Weeks(String day) {
//     //     this.day = day;
//     // }
//     //
//     // public String getDay() {
//     //     return this.day;
//     // }
//
//     public static String convertKrToEn(String day) {
//         switch (day) {
//             case Weeks.MONDAY:
//                 return "MONDAY";
//             case Weeks.TUESDAY:
//                 return "TUESDAY";
//             default:
//                 return "";
//         }
//     }
//
// }
