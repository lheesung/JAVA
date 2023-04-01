package week03.ex1_stack;

public class MyStackExam {
    public static void main(String[] args) {
        // 1. Stack 생성
        MyStack myStack = new MyStack();
        // 2. 값 추가 : A, B, C
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        // 3. 전체 출력
        myStack.printAll();
        // 4. 삭제
        System.out.println(myStack.pop());
    }
}
