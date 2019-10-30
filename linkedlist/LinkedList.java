
/**
 * LinkedList
 */
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) { 
            data = d; 
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();    
        llist.head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(20);
        llist.head.next = second;
        second.next = third;
        System.out.println("Initial Linked List at begining");
        llist.printLinkedList();
        System.out.println("After insertion '105' next to second node");
        llist.insertAfter(second, 105);
        llist.printLinkedList();
        llist.insertAtBegining(55);
        System.out.println("After insertion '55' at begining");
        llist.printLinkedList();
        System.out.println("After insertion '38' at end");
        llist.insertAtEnd(38);
        llist.printLinkedList();
        System.out.println("After deleting the key '55'");
        llist.deleteAtKey(55);
        llist.printLinkedList();
        
        System.out.println("After deleting At position 3");
        llist.deleteAtPosition(3);
        llist.printLinkedList();

        System.out.println("After Empty Linked List");
        llist.emptyLinkedList();
        llist.printLinkedList();

    }


    public void printLinkedList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void emptyLinkedList(){
        head = null;
    }
    public void deleteAtPosition(int position){
        Node temp = head;
        
        if(position == 0){
            head = temp.next;
            return;
        }

        for (int i = 0;temp !=null && i < position - 1; i++) {
            temp = temp.next;        }

            Node next = temp.next.next;
            temp.next  = next; 

    }

    public void deleteAtKey(int key){
            Node temp = head, prev = null;
           
            if(temp != null && temp.data == key){
                    head = temp.next;
                    return;
            }
           
            while(temp.next != null && temp.data != key){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
    }

    public void insertAtEnd(int data){

        Node new_node = new Node(data);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new_node;
        return;

    }

    public void insertAfter(Node prev_node, int data){
        
        if(prev_node == null) return;
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }
    
    public void insertAtBegining(int data){
        // new_node = [data | null]  & head -> [...]->[....]->[...]
        Node new_node = new Node(data);
        // new_node = [data | -]--> head -> [....]->[...]->[....]
        new_node.next = head;
        // head -> [new_node]->[....]->[.....]->[...]
        head = new_node;
    }

}