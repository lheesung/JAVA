package week02.ex1_linkedList;
public class LinkedListTest {
    public static void main(String[] args) {
        // 1. linked list 생성
        LinkedList list = new LinkedList();
        // 2. 생성된 list에 값 추가
        list.add("A");
        list.add("B");
        list.add("C");
        // 3. list의 값 출력
        list.printAll();

        list.insert("D", 2);
        list.printAll();
        list.remove(1);
        list.printAll();

        System.out.println(list.getElement(1).getData());
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
