package com.company;

public class PE1 {

           public static void main(String[] args) {
               int sum = 0;
               for (int c = 1; c < 1000;c++)
                   if (((c%3) == 0) || ((c%5) == 0)) {
                   sum = sum + c;
               }

               System.out.println("answer is: " + sum);

       }
}
