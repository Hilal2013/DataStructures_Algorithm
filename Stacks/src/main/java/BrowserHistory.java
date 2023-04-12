import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BrowserHistory {
    // declare stacks and current
    private Deque<String> historyCurrent;
    String currentPage;
    private Deque<String> forwardStack;


    public BrowserHistory(String homepage) {
        // initialize stacks and current=homepage
        historyCurrent = new ArrayDeque<>();

        forwardStack = new ArrayDeque<>();
        currentPage = homepage;

    }

    public void visit(String url) {
        // Push 'current' in 'history' stack and mark 'url' as 'current'.
        historyCurrent.push(currentPage);
        currentPage = url;
        System.out.println(url+" is visited");
        //After a visit operation we need to delete all entries from 'forward' stack.//clear up all the forward history
        forwardStack = new ArrayDeque<>();//to clear
    }

    public String back(int steps) {
        int steps2=steps;
        // push current page to forword stack
        // Pop  from 'history' stack, assign it to current page

        while (steps > 0 && !historyCurrent.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = historyCurrent.pop();//mark it as currentpage
        }
        System.out.println("Back Operation of "+steps2+ " brings "+currentPage);
        return currentPage;
    }

    public String forward(int steps) {
        int steps2=steps;
        // Pop elements from 'forward' stack, and push elements in 'history' stack.
        while (steps > 0 && !forwardStack.isEmpty()) {
            currentPage = forwardStack.pop();
            historyCurrent.push(currentPage);

            steps--;
        }
        System.out.println("Forwar Operation of "+steps2+ " brings "+currentPage);

        return currentPage;
    }

}