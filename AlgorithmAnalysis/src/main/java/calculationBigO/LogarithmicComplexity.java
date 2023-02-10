package calculationBigO;

public class LogarithmicComplexity {
    public static void main(String[] args) {

        int n=1000000;
        // int numberOfOperations=0;
        long numberOfOperations=0;

        long startTime;
        long endTime;
        System.out.println("Input size n is= " +n);
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i*=2) {//O(log n)
            numberOfOperations +=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println("NumberOfOperations with logarithmic: "+numberOfOperations+" in "+(endTime-startTime)+" miliseconds");



    }
}