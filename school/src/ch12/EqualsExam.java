package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        Student s1 = new Student(1, "lee");
        Student s2 = new Student(1, "lee");
        System.out.println(s1.equals(s2));

        String str1 = "busan";
        String str2 = "busan";
        System.out.println(str2.equals(str2));

        String str3 = new String("software");
        String str4 = new String("software");
        System.out.println(str3.equals(str4)); // 내용비교
    }
}
