// Find the sum of all the multiples of 3 or 5 below 1000

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
