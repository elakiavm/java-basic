import java.util.Scanner;

public class linkedlist {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } 
        else {
            tail.next = nn;
            tail = nn;
        }

    }
    public void begin(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }
    public void position(int data,int n,int pos){
        Node nn = new Node(data);
        Node temp,current;
        int i;
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
            temp = head;
            current = null;
            for(i=1;i<pos;i++){
                current = temp;
                temp = temp.next; 
            }
            current.next = nn;
            nn.next = temp;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int data;
        for (i = 0; i < n; i++) {
            l.addNode(data = sc.nextInt());
        }
        System.out.println("--------------------------------");
        l.display();
        // System.out.println("Insert in the element");
        // data=sc.nextInt();
        // l.begin(data);
        // System.out.println("--------------------------------");
        // l.display();
        System.out.println("Insert the position ");
        int pos=sc.nextInt();
        System.out.println("Insert the elements");
        data=sc.nextInt();
        l.position(data,n,pos);
        l.display();

    }

}
