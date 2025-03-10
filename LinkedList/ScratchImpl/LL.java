package LinkedList.ScratchImpl;

public class LL {

    Node head;
    private int size;

    public LL(){
        size = 0;
    }

    class Node {
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    } 

    // addLast
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }

        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    // print list
    public void printList(){
        Node currNode = head;

        while(head!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.print("NULL \n");
    }

    // removeFirst
    public void removeFirst(){
        if(head == null ){
            System.out.println("Empty List. Can't remove.");
            return;
        }
        head = this.head.next;
        size--;
    }

    // removeLast
    public void removeLast(){
        if(head == null) {
            System.out.println("Empty List. Can't remove.");
            return;
        }
        Node currNode = head, secondLastNode=null;
        while(currNode.next!=null) {
            secondLastNode = currNode;
            currNode = currNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterative(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead; 
    }

    public static void main(String []args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("this");
        list.addLast("linked");
        list.addLast("list");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        list.reverseIterative();
        list.reverseRecursive(list.head);
        
    }
}