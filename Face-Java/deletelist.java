import java.util.*;
public class deletelist {
   
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
    public void delete(){
        // Node current = head;
        if(head == null){
            System.out.println("Empty");
        }
        else{
            if(head!=tail){
                head = head.next;
            }
            else{
                head = tail = null;
            }
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
    public static void main(String[] args){
        deletelist d = new deletelist();
        Scanner sc = new Scanner(System.in);
        int data;
        do{
            data = sc.nextInt();
            if(data>0){
                d.addNode(data);
            }
        }while(data>0);
        d.display();
        d.delete();
        d.display();
    }

}
