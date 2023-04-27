package week15;

import java.util.HashMap;

public class ClimbingStairsTriple {

    public static void main(String[] args) {
        System.out.println(iteration(8));//81
        System.out.println(climbStairsTripleArray(7));
        System.out.println(climbStairsTripleMap(7));
    }

    public static long  iteration(int n){
// 1 stair  how many ways 1
// 2 stair  how many ways 2
// 3 stair  how many ways 4
// 4 stair  how many ways 7//-13-24-44
      //n stairs how many ways (n-1)+(n-2)+(n-3)
        if(n<=2){
            return n;
        }else if(n==3){
            return 4;
        }
        int n1=1,n2=2,n3=4,result=0;
        for (int i = 4; i <=n ; i++) {
            result=n1+n2+n3;//7//2+4+7=13
            n1=n2; //2 //4
            n2=n3;   //4 //7
            n3=result; //7//13
        }
        return result;
    }
    public static int climbStairsTripleArray(int n) {

        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;
        for (int i = 4; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            //arr[7]=arr[7-1]+arr[7-2]+arr[7-3]=24+13+7=44
        }
        return  arr[n];
    }
    public static int climbStairsTripleMap(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        //key=n value= how many ways to climb
        map.put(1,1);
        map.put(2,2);
        map.put(2,4);
        return climb(map,n);

    }
    public static int climb(HashMap<Integer,Integer> map,int n){
        if(n<=2){
            return n;
        }else if(n==3){
            return 4;
        }

        if(map.containsKey(n)) //checking if n is already present
        return map.get(n);
        else // add it to the HashMap
        {
            int ways = climb(map, n - 1) + climb(map, n - 2) + climb(map, n - 3);
            map.put(n, ways);
            return map.get(n);
        }
    }



}
