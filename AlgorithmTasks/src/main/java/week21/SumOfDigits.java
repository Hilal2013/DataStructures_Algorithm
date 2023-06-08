package week21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 493193;
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
     while(true){
         sum=0;//make sum again 0 start from 0
         while (number > 0) {////493193//number=49319.....number 4 number =0
             sum += number % 10;//remainder=3 sum=3 //remainder=9 sum=12....sum=29
             number = number / 10;//49319//4931......

         }
         number=sum;//number will be 29//11//2
         if (sum <10) {
             break;
         }

     }
      return sum;
    }
    public static int sumOfDigitsRecursive(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;

        }
        if (sum <10) {
            return sum;
        }
      return sumOfDigitsRecursive(sum); //time complexity o(log n) space c.o(log n)
    }



    @Test
    public void testSumOfDigits(){
        Assertions.assertEquals(2,sumOfDigitsRecursive(493193));
        Assertions.assertEquals(6,sumOfDigitsRecursive(132189));
        Assertions.assertEquals(6,sumOfDigitsRecursive(942));
        Assertions.assertEquals(7,sumOfDigitsRecursive(16));


    }

}
/*
Given n, take the sum of the digits of n, if that value has more than one digit, continue reducing in this way until
a single-digit number is produced.
Examples:
16 à 1 + 6 = 7
942 à 9 + 4 + 2 = 15 à 1 + 5 à 6
132189 à 1 + 3 + 2 + 1 + 8 + 9 + 24 à 2 + 4 = 6
493193 à 4 + 9 + 3 + 1 + 9 + 3 = 29 à 2 + 9 = 11 à 1 + 1 = 2
Constraints: The input will be a non-negative integer.
Please, try to test your solution via JUnit.
 */