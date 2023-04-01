package week03.ex2_queue;

public class MyqueueExam {
    public static void main(String[] args) {
        // 1. Queue 생성
        Myqueue myqueue = new Myqueue();
        // 2. 값 추가
        myqueue.enQueue("A");
        myqueue.enQueue("B");
        myqueue.enQueue("C");
        // 3. 전체 출력
        myqueue.printAll();
        // 4. 삭제
        System.out.println(myqueue.deQueue());
    }
}
