package ch05;

public class Student {
    String name;
    static String group = "SW"; // static: 공통적 속성 (생성 전 사용)
    final static String school = "Busan Software Meister Highshool"; // final : 상수화
    void showInfo(){
        System.out.println("이름은 " + name + "이고 학과는 " + group + "입니다.");

    }
}
