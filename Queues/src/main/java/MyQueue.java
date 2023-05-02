import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue<T> {
    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T value) {
        QNode<T> node = new QNode<>(value);
        if (isEmpty()) front = back = node;
        else {
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue() {

        QNode<T> frontNode;
        if (isEmpty()) throw new NoSuchElementException();
        if (front == back) {//if we have one node//item
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    T peek() {
        return front.value;//peek first element
    }

    int size() {
        return size;
    }

    void printQueue() {
        if (isEmpty()) return;
        QNode<T> current = front;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println();
    }

   static MyQueue<Integer> reverseKElements(MyQueue<Integer> mq, int k) {

       Stack<Integer> stack = new Stack<>();
       for (int i = 1; i <= k ; i++) {
           stack.push(mq.dequeue());
       }

        System.out.println(stack);//[10, 20, 30, 40]

        while (!stack.isEmpty()) {
            mq.enqueue(stack.pop());

        }
       for (int i = 0; i < mq.size()-k ; i++) {
           mq.enqueue(mq.dequeue());
       }
        mq.printQueue();
        return mq;
    }


}
