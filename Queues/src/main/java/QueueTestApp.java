public class QueueTestApp {
    public static void main(String[] args) {
        /*
        MyQueue<Integer> mq=new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
      //  mq.enqueue(4);
        mq.printQueue();//1,2,3
        System.out.println("Size of queue is: "+mq.size());//3
        System.out.println("Size of queue is: "+mq.size);//3
        System.out.println("Front is: "+mq.peek());//1
        System.out.println("First remove from queue: "+mq.dequeue());//1
        System.out.println("Front is: "+mq.peek());//2
        mq.printQueue();//2,3

         */
    MyQueue<Integer> mq=new MyQueue<>();
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);
        mq.enqueue(50);
        System.out.println(MyQueue.reverseKElements(mq,4));


    }
}
/*
Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]
 */