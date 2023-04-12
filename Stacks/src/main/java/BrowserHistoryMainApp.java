import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistoryMainApp {
    public static void main(String[] args) {

        BrowserHistory bh=new BrowserHistory("leetcode.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Forward 1 step: "+bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println("Forward 2 steps: "+ bh.forward(2));
        System.out.println("Back 2 steps: "+bh.back(2));
        System.out.println("Back 7 steps: "+bh.back(7));

    }
}
//google.com is visited
//facebook.com is visited
//youtube.com is visited
//Back Operation of 1 brings leetcode.com
//Back 1 step: leetcode.com
//Back Operation of 1 brings leetcode.com
//Back 1 step: leetcode.com
//Forwar Operation of 1 brings google.com
//Forward 1 step: google.com
//linkedin.com is visited
//Forwar Operation of 2 brings linkedin.com
//Forward 2 steps: linkedin.com
//Back Operation of 2 brings leetcode.com
//Back 2 steps: leetcode.com
//Back Operation of 7 brings leetcode.com
//Back 7 steps: leetcode.com