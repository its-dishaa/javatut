public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert at beginning
    public void insertAtHead(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) { // If first element
            tail = head;
        }

        size++;
    }

    // Insert at end
    public void insertAtTail(int value) {
        if (tail == null) {
            insertAtHead(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Get size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();

        System.out.println("Size of list: " + list.getSize());
    }
}
