package ch01;

public class ArrayExam03 {
    public static void main(String[] args) {
        int a[];
        int[] b;
        int[] c = {31,32,33};
        a = new int[4]; // initialize to 0
        b = new int[]{21,22,23,24};
        c = b; // 참조만 바뀜 / 가르키는 (화살표)
        System.out.println(a.length + " " + b.length + " " + c.length);
    }
}
