package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            //step1 - create new node
            Node newNode = new Node(data);
            size++;

            if(head == null){
            head = tail = newNode;
            return;
            }
            //step2
            newNode.next = head;
            //step3
            head = newNode;
        }

        public void addLast(int data){
            //step1 create new Node
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }
            //step2
            tail.next = newNode;
            tail = newNode;
        }

        public void addMiddle(int idx, int data){
            if(idx == 0){
                addFirst(data);
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            
            //while loop finding previous of idx node
            while(i < idx-1){
                temp = temp.next;
                i++;
            }
            
            //step assigning refrences
            newNode.next = temp.next;  
            temp.next = newNode; 
        }

        public void print(){
            if(head == null){
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addLast(1);
        ll.addFirst(3);
        ll.addMiddle(2, 4);
        ll.print();
        System.out.println(LinkedList.size);
        

    }
}
