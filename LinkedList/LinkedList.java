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

        //add in a first of ll..........................................................................
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
        //add in a last of ll...................................................................
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
        //add in a middle of a element...............................................................................
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
        //print function...........................................................................................................................
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
        
        //rermoving first element from ll..................................................................
        public int removeFirst(){
            if(size == 0){
                System.err.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        //rermoving last element from ll............................................................
        public int removeLast(){
            if(size == 0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addLast(1);
        ll.addFirst(3);
        ll.addMiddle(2, 4);
        System.out.println("Before deleted Node");
        ll.print();
        ll.removeFirst();
        System.out.println("After deleted Node");
        ll.print();
        System.out.print("Size of ll is: ");
        System.out.println(LinkedList.size);
        

    }
}
