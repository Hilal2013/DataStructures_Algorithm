public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));//1
       System.out.println(fib(5));//5
       System.out.println(fib(6));//8 0112358

        System.out.println(fact(5));//120

    }
public static long fact(long n){
        if(n<=1) return 1;
        else
            return n*fact(n-1);//call method again

}
    public static int fib(int n){
        if (n==0) return 0;// termination
        if (n==1) return 1;// termination
        return fib(n-1)+fib(n-2);
    }



}