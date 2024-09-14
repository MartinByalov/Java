public class QueueExample {

   private int[] queue;
   private int capacity, size;
   private int front, rear;


   public QueueExample(int capacity){

       this.capacity = capacity;
       queue = new int[capacity];
       this.size = 0;
       this.front = 0;
       this.rear = -1;

   }

   public boolean isEmpty(){

       return size == 0;
   }

   public boolean isFull(){

       return size == capacity;
       }

       // Добавяне на елемент

    public void enqueue(int value){

       if(isFull()){
           System.out.println("Опашката е пълна.");
       }

       rear = (rear + 1) % capacity;
       queue[rear] = value;

       size++;

   }

   // Премахване на елемент

    public int dequeue(){

       if(isEmpty()){
           throw new RuntimeException("Опашката е празна");
       }

       int value = queue[front];

       front = (front + 1) % capacity;

       size--;
       return value;
    }

    public int getSize(){
       return size;
    }

    public int peek(){

       if(isEmpty()) throw new RuntimeException("Опашката е празна");

       return queue[front];
    }

    // Отпечатване
    public void printQueue(){

       if(isEmpty()){
           throw new RuntimeException("Опашката е празна");
       }

       System.out.println("Опашка: ");

       int current = front;

       for(int i = 0; i < size; i++){
           System.out.print(queue[current] + " ");

           current = (current + 1) % capacity;
       }
       System.out.println();
    }

    public static void main(String[] args){

        QueueExample queue = new QueueExample(5);

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();

    }
}