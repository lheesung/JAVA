package ch01;

public class ArrayExam02 {
    public static void main(String[] args) {
        String[] str = new String[3]; // 참조형 자료형(Class)
        str[0] = "Hello";
        str[1] = "JAVA";
        str[2] = "World";
        for (String s : str) { // 단축어: iter
            System.out.println(s);
        }
    }
}
