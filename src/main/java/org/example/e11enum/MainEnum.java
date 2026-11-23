package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
        // Weeks weeks = new Weeks();
        // System.out.println(Weeks.MONDAY);
        // System.out.println(Weeks.TUESDAY);
        // System.out.println(Weeks.MONDAY == Weeks.TUESDAY);
        Weeks monday = Weeks.MONDAY;
        Weeks tuesday = Weeks.TUESDAY;
        System.out.println(monday);
        System.out.println(monday.name());
        System.out.println(monday.getKrDay());
        System.out.println(monday.getDayNum());
        System.out.println(Weeks.MONDAY);
        System.out.println(Weeks.FRIDAY.ordinal());
        // ordinal -> 순서성이 보장되지 않음 -> 직접적인 연산에 사용하지 않음

        // 상수 만들어야하면 enum 객체 쓰기
        System.out.println(tuesday.getKrDay());

    }
}
