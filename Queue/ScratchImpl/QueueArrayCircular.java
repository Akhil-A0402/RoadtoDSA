package Queue.ScratchImpl;

/*
 * Queue: FIFO
 * Impl: Array based, circular
 * Time Complexity:
 * Add(Enqueue) : O(1)
 * Remove(Dequeue) : O(1)
 * Peek : O(1)
 */

public class QueueArrayCircular {
    static class Queue {
        int arr[];
        int size;
        int front = -1, rear = -1;
        
        public Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty(){
            if(front==-1 &&  rear==-1) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            return (rear+1)%size==front;
        }

        public void add(int num){
            if(isFull()){
                System.out.println("The queue is full");
                return;
            }

            if(front == -1 ){
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = num;
        }

        public int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
            }

            int res = arr[front];

            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front+1)%size;
            }
            return res;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("removed: " + q.remove());
        q.add(7);
        System.out.println("removed: " + q.remove());
        q.add(8);
        
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }

}
