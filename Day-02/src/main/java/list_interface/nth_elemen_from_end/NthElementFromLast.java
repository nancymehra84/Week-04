package list_interface.nth_elemen_from_end;

class NthElementFromLast {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public String findNthFromEnd(int n) {
        Node first = head;
        Node second = head;

        // Move first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (first == null) return "N is larger than the list size";
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second != null ? second.data : "List is too short";
    }

    public static void main(String[] args) {
        NthElementFromLast list = new NthElementFromLast();//Linked List
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        list.append("E");

        int N = 2;
        System.out.println("Nth element from end: " + list.findNthFromEnd(N)); // Output: D
    }
}
