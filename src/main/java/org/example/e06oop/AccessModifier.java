package org.example.e06oop;

public class AccessModifier {
    // 접근 제어 지시자
    // class field method 앞에 붙일 수 있음
    // 공개 범위 지정

    // default : 같은 패키지에 소속된 클래스에서만 접근 가능(아무것도 안적으면 기본값)
    String strDefault = "Default";

    // public : 클래스 내/외부 어디에서나 접근 가능
    public String strPublic = "Public";

    // private : 클래스 내부에서만 접근 가능(오로지 나만 사용)
    private String strPrivate = "Private";

    // protected : 같은 패키지/클래스 내부/자식 클래스에서 접근 가능
    protected String strProtected = "Protected";

    // return값이 없어서 void?
    // default는 생략 -> 아예 키워드가 없음
    void fnDefault() {
        System.out.println("Default Function");
    }
    public void fnPublic() {
        System.out.println("Public Function");
    }
    private void fnPrivate() {
        System.out.println("Private Function");
    }
    protected void fnProtected() {
        System.out.println("Protected Function");
    }

    public String getStrPrivate() {
        return this.strPrivate;
    }

    public Whale getWhale() {
        return new Whale();
    }
}
