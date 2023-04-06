import java.util.Arrays;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());//4
        stack.push(10);
        System.out.println(stack.peek());//10
        System.out.println(stack.pop());//10 removing showing last

        for (int i = 0; i <5 ; i++) {//0 1 2 3 4
            System.out.println(stack.pop());//4 3 2 1 0 all of them removed
        }
        System.out.println(stack.peek());//exception
    }
}
