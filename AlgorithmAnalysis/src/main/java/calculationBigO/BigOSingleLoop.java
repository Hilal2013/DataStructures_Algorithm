package calculationBigO;

public class BigOSingleLoop {
    public static void main(String[] args) {
        int n=1000000;
        int numberOfOperations=0;
        long startTime;
        long endTime;
        System.out.println("Input size n is= " +n);
        //---Task One singLoop---

        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {//O(n)
            numberOfOperations +=1;
        }
       endTime=System.currentTimeMillis();
        System.out.println("NumberOfOperations: "+numberOfOperations+" in "+(endTime-startTime)+" miliseconds");
//if n is 100 //NumberOfOperations: 100 in 0 miliseconds
        //if n=1000000//NumberOfOperations: 1000000 in 7 miliseconds

    }

}
