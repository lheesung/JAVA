package week03.ex2_queue;

import week02.ex1_linkedList.LinkedList;
import week02.ex1_linkedList.Node;

public class Myqueue extends LinkedList implements IQueue {
    private Node front;
    private Node rear;
    @Override
    public void enQueue(String data) {
        Node newNode;
        if (isEmpty()){
            newNode = add(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = add(data);
            rear = newNode;
        }
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        front = front.next;
        String data = remove(0).getData();
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
