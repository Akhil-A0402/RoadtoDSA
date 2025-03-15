package Queue.ScratchImpl;

/*
 * Queue: FIFO
 * Impl: Array based
 * Time Complexity:
 * Add(Enqueue) : O(1)
 * Remove(Dequeue) : O(n)
 * Peek : O(1)
 */

public class QueueArrayBasic {
     static class Queue {
         int arr[];
         int size;
         int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public  boolean isEmpty(){
            return rear == -1;
        }

        public  void add(int num) {
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = num;
        }

        public  int remove() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public  int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];
        }

        
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); // prints 1
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());
    }
}
