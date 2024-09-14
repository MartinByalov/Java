class DNode {

    int data;
    DNode next;
    DNode prev;

    public DNode(int data){

        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{

   private DNode head;

    public void addFirst(int data){

        DNode newNode = new DNode(data);

        if(head != null){

            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){

        DNode newNode = new DNode(data);

            if(head == null){

                head = newNode;

            } else {
                DNode current = head;
                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
                newNode.prev = current;

            }
        }

        public void removeFirst(){

            if(head != null){

                head = head.next;
                if(head != null){
                    head.prev = null;

                }
            }
        }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        DNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
    }

    public void printList(){

        DNode current = head;

        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");

    }
    }

