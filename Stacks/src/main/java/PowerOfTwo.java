public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(32));

    }


    public static boolean isPowerOfTwo(int n) {
        if (n==1) return true; // Base Condition
        if (n%2!=0 || n<=0) return false;
        return isPowerOfTwo(n/2);
    }
}
/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false

if (n <= 0)
            return false;

        if (n == 1)
            return true;//base condition

        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        return false;

 */