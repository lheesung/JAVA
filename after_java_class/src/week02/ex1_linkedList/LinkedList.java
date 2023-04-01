package week02.ex1_linkedList;

public class LinkedList implements List{
    private Node head;
    private int count;

    @Override
    public Node add(String data) {
        Node newNode = new Node(data);
        if (head==null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    @Override
    public Node remove(int position) {
        Node temp = head;
        if (position<0 || position > count){
            System.out.println("위치오류. 현재 노드의 개수는"+count+"개 입니다.");
            return null;
        }
        if (position == 0){
            head = head.next;
        } else {
            Node preNode = head;
            for (int i=0;i<position;i++){
                preNode = temp;
                temp = temp.next;
            }
            preNode.next = temp.next;
        }
        count--;
        return temp;
    }

    @Override
    public Node insert(String data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        if (position < 0 || position > count){
            System.out.println("위치 오류. 현재 노드 수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0){
            newNode.next = head;
            head = newNode;
        } else {
            for (int i=0;i<position;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    @Override
    public void printAll() {
        if (head == null)
            System.out.println("There is no node");
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.getData());
                temp = temp.next;
                if (temp != null){
                    System.out.print(" -> ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public Node getElement(int position) {
        if (position < 0 || position > count){
            System.out.println("위치 오류. 현재 노드 수는 " + count + "개 입니다.");
            return null;
        }
        if (head == null){
            System.out.println("노드가 비어있습니다.");
            return null;
        } else {
            Node temp = head;
            for (int i=0;i<position;i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (head == null){
            return true;
        }
        return head == null;
    }
}
