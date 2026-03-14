import java.util.Stack;

public class createLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtLast(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;

        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        return head;

    }

    public static Node insertAtBegining(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;

        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node reverseLinkedList(Node head) {
        Stack<Integer> st = new Stack<>();

        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;

        }
        Node temm = head;

        while (!st.isEmpty()) {
            temm.data = st.pop();
            temm = temm.next;

        }
        return head;
    }

    public static void printNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;

        }

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);

        head = insertAtBegining(5, head);

        head = insertAtLast(25, head);

        head = reverseLinkedList(head);

        printNode(head);

    }

}