

public class LList implements LListInterface
{

    public class Node {
        private String data;
        private Node next;

        public Node(String input) {
            data = input;
        }

        public void setNext(Node node) {
            next = node;
        }

        public Node next() {
            return next;
        }

        public String getData() {
            return data;
        }
    }

    private Node head;
    private int size;

    public LList() {
        head = null;
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String input) {
        Node current = head;
        Node newNode = new Node(input);

        if (this.isEmpty()) {
            head = newNode;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public boolean remove(String input) {
        Node current = head;

        if  (head != null && input.equals(current.getData())) {
            if (current.next != null) {
                head = current.next;
            }
            else {
                head = null;
            }
            size--;
            return true;
        }

        while (size >= 2 && current.next != null) {
            if (input.equals(current.next.getData())) {
                if (current.next.next != null) {
                    current.setNext(current.next.next);
                }
                else {
                    current.next = null;
                }
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args)
    {
        //Receive string as outside input
        //Push it into linkedlist with push()
        //Pop string at top of list with pop()
        LList list = new LList();
        list.add("input");
        System.out.println(list.head.getData());
    }

}
