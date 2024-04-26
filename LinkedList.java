import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;

    void add(int data) {
        if (head == null) {
            Node n1 = new Node(data);
            head = n1;
            tail = n1;
        } else {
            Node n2 = new Node(data);
            tail.next = n2;
            tail = n2;
        }
    }

    void display() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        int data = sc.nextInt();

        l1.add(data);
        l1.add(2);
        l1.add(3);
        l1.display();
        sc.close();
    }

}
