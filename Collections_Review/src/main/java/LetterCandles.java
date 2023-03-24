import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.toList;

public class LetterCandles {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // Read inputs here!

        System.out.println("Enter letter count: ");
        int letterCount = Integer.parseInt(reader.readLine());

        System.out.println("Enter number candles that can be removed : ");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("Enter number candles that can be removed : ");
        String letters = reader.readLine();

        System.out.println(letterCandlesCost1(letterCount, m, letters));
    }

    public static int letterCandlesCost(int letterCount, int m, String str) {
        int cost=0;
        // create a hashmap

        // O(n<26)
        Map<Character,Integer> map=new HashMap<>();
        int count;
        // calculate freqs
        // O(n)
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)){
                count=map.get(ch);//update frequency
                map.put(ch,count+1);
            } else map.put(ch,1);
        }
        //nlogn nis not greater than 26
        System.out.println(map);////abccbc for this example=>{a=1, b=2, c=3}
        List<Integer> letterFreq=map.values().stream().sorted((o1,o2)->o2.compareTo(o1)).collect(toList());//descending
        System.out.println(letterFreq);//abccbc for this example=>[3, 2, 1]
        int index=0;
        // minimize cost
        // O(n) n is not greater than 26 in fact it is constant
        while(m>0 && index<=letterFreq.size()-1){
            if (m>0 && letterFreq.size()==1) {
                letterFreq.set(0,letterFreq.get(0)-1);
                m--;
            }else if (letterFreq.get(index)>=letterFreq.get(index+1)) {
                letterFreq.set(index,letterFreq.get(index)-1);
                m--;
            } else if (index>0 && letterFreq.get(index)<letterFreq.get(index-1)) index--;
            else index++;
        } // O(m=26 at most) O(1)


        // calculate min cost
        // O(n) n is not > 26
        for (Integer num : letterFreq) {
            cost+=num*num;
        }
        // return result O(n)
        return cost;
    }
    public static int letterCandlesCost1(int letterCount, int m, String str) {
        int cost = 0;
        Map<Character, Integer> map = new HashMap<>();
        int count;
        // calculate freq
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);//update frequency
                map.put(ch, count + 1);
            } else map.put(ch, 1);
        }
        System.out.println(map);////abccbc for this example=>{a=1, b=2, c=3}
        List<Integer> letterFreq = map.values().stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(toList());//descending
        System.out.println(letterFreq);//abccbc for this example=>[3, 2, 1]
        int index=0;
        while(m>0 && index<letterFreq.size()){
            if ( letterFreq.size()==1) {
                letterFreq.set(0,letterFreq.get(0)-1);
                m--;
            }else if (letterFreq.get(index)>=letterFreq.get(index+1)) {
                letterFreq.set(index,letterFreq.get(index)-1);
                m--;
            } else if (letterFreq.get(index)<letterFreq.get(index+1)) {
                letterFreq.set(index+1,letterFreq.get(index+1)-1);
                m--;
            }
            else index++;
        }
        for (Integer each : letterFreq) {
            cost+=Math.pow(each,2);
        }

      return cost;
    }

}
/*
Your friend Alice has a box with N letter candles in it. The cost of the box is determined as
follows - Find the number of occurrences of each characters in the box and sum up the
squares of these numbers.
Alice wants to reduce the cost of the box by removing some candles from it. However, she
is allowed to remove at most M candles from the box. Can you help Alice determine the
minimum cost of the box?
Input
The first line of the input contains the integer N, representing the number of letter
candles. The second line of the input contains the integer M, representing the number of
candles Alice can
remove.
The third line of the input contains an N-lettered string S, which contains lowercase English
letters, representing the letter candles in the box
Output
Print the minimum possible cost of the box.
Example #1
Input:
6
2
bacacc
Output:
6
Explanation: There are two As, one B, and three Cs in the box. Current cost of the box is 22
+ 12 + 32 = 14. The best way to minimize the cost of the box is to remove two C-shaped
candles from it. The new minimal cost will be 22 + 12 + 12 = 6. The answer is 6


  int cost = 0;
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int frequency = 0;
            char each = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (each == str.charAt(j)) {
                    frequency++;
                }
            }
            if(frequency==letterCount){
                cost= (int) Math.pow(letterCount-m,2);
            }else {

                while(m!=0) {

                    cost += Math.pow(frequency-1, 2);
                    m--;

                }
            }
        }

 */