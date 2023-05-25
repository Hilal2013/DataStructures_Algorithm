package week19;

import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String s = "aabcbcbb";
        //String s = "bbb";

        System.out.println( lengthOfLongestSubstring(s));;


    }

    public static int lengthOfLongestSubstring1(String s) {
        //i didnt want to use set because abbc it will be abc but it is not substring//
        Map<Character, Integer> map = new HashMap<>();
        int longestLength = 0;
        List<List<StringBuilder>> list=new ArrayList<>();
StringBuilder str=new StringBuilder();
        int first=0;
        int second=first+1;
//        for (int i = 0; i <s.length() ; i++) {
//            char chF=s.charAt(first);
//            char chS=s.charAt(second);
//            if(chF!=chS){
//                list.add(Arrays.asList(str.append(chS)));
//            }
//        }
//        System.out.println(list);
     while(first<s.length()&&second<s.length()){
         if(s.charAt(first)!=s.charAt(second)){
            // list.add(Arrays.asList(str.append(s.charAt(first))));
             list.add(Arrays.asList(str.append(s.charAt(second))));
                     second++;

         } else if(s.charAt(first)==s.charAt(second)) {
             first++;
             second++;
         }
     }
        System.out.println(list);

        return 0;
    }
    public static int lengthOfLongestSubstring(String s){
//i didnt want to use set because abbc it will be abc but it is not substring//

        List<Character> list   = new ArrayList<>();
        int longestLength = 0;
        int first=0;
        int second=first;//they will start from same point index 0
        while(first<s.length() && second<s.length() ){
            if(!list.contains(s.charAt(second))){//a b
                list.add(s.charAt(second));//ab
                second++;//1 2
                longestLength=Math.max(longestLength,list.size());//1 2 3
            }else {
               list.clear();//if doesnt contain im gonna remove that i added before
                first++;//b
                second=first;
            }
        }
return longestLength;
    }

}
/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


first<s.length()&&second<s.length()
 */