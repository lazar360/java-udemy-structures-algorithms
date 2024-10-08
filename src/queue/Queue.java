package queue;

public class Queue {

    Node first;
    Node last;

    int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void printQueue(){
        Node temp = first;
        while (temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println(first.value);
    }

    public void getLast(){
        System.out.println(last.value);
    }

    public void getHeight(){
        System.out.println(length);
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if (length == 1){
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
