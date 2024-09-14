 class Node {

    int data;
    Node next;

    public Node(int data){

        this.data = data;
        this.next = null;

    }
}

class SinglyLinkedList{

    private Node head;

    public void addFirst(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){

            head = newNode;

        } else{

        Node current = head;

        while(current.next != null){

            current = current.next;
        }
        current.next = newNode;

        }
    }

    public void removeFirst(){

        if(head != null){
            head = head.next;
        }
    }

    public void removeLast(){

        if(head == null) return;

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;

        while(current.next.next != null){

            current = current.next;

        }

        current.next = null;
    }

    public void printList(){

        Node current = head;

        while (current != null){

        System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }
}
