public class doublyLinkedList {

    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 10};
        Node hNode = Node.converToLinkedList(arr);
        Node.printNode(hNode);
    }

    static class Node {
        int data;
        Node pre;
        Node next;

        Node(int data) {
            this.data = data;
            this.pre = null;
            this.next = null;
        }

        public static Node converToLinkedList(int arr[]) {
            Node heaNode = new Node(arr[0]);
            Node pre = heaNode;
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                pre.next = newNode;
                newNode.pre = pre;
                pre = newNode;
            }
            return heaNode;
        }

        public static void printNode(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "->");
                temp = temp.next;
            }
        }
    }
}