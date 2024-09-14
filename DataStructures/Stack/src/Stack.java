class Stack {

   private Node top;
   private int size;

   public Stack(int size){

       this.top = null;
       this.size = 0;

   }

   public boolean isEmpty(){

       return top == null;

   }

   // Добавяне на елемент в стека

    public void push(int data){

       Node newNode = new Node(data);

       newNode.next = top;
       top = newNode;
       size += 1;

    }

    // Премахване на елемент от стека
    public int pop(){

       if(isEmpty()){
           throw new RuntimeException("Стекът е празен!");
       }

       int data = top.data;

       top = top.next;
       size -= 1;
       return data;

    }

    // Връща последно добавения елемент без да го премахва

    public int peek(){

       if(isEmpty()){
           throw new RuntimeException("Стекът е празен!");
       }

       return top.data;
    }

    public int getSize(){
       return size;
    }

}

