import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        * 1.Write a program that prints the numbers from 1 to 100 such that:
            If the number is a multiple of 3, you need to print "Fizz" instead of that
            number.
        * */
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

        /*
        *2.Write a Java program to reverse a string.
            Test Data: Input a string: The quick brown fox Expected Output: Reverse
            string: xof nworb kciuq ehT
        * */

//        System.out.println("Please enter string");
//        String orginal_string = input.nextLine();
//        String reverse_string = "";
//
//        for (int i = orginal_string.length()-1; i >= 0  ; i--) {
//
//            reverse_string = reverse_string + orginal_string.charAt(i);
//
//        }
//        System.out.println(reverse_string);


        /*
        * 3.Write a program to find the factorial value of any number entered
            through the keyboard.
        * */
//        boolean exit = false ;
//        int num ;
//        do {
//            System.out.print("Please enter number or 0 to exit: ");
//            num = input.nextInt();
//            if(num == 0 )
//                break;
//            int factorial = num ;
//            for (int i = num-1; i >=1 ; i--)
//                factorial*=i;
//            System.out.println(factorial);
//        }while (!exit);

        /*
        * 4.Two numbers are entered through the keyboard. Write a program to find
            the value of one number raised to the power of another. (Do not use Java
            built-in method)
        * */
//            System.out.print("Please enter any number: ");
//            int number = input.nextInt();
//            System.out.print("Please enter the power : ");
//            int power = input.nextInt();
//
//            int x = 1;
//            for (int i = power; i >=1 ; i--)
//                x*=number;
//            System.out.println(x);

        /*
        * 5.Write a program that reads a set of integers, and then prints the sum of
            the even and odd integers.
        * */

//            int even=0,odd=0;
//            int x;
//            do {
//                System.out.println("please enter num or 0 to exit: ");
//                x=input.nextInt();
//                if(x%2==0)
//                    even+=x;
//                else
//                    odd+=x;
//
//            }while (x!=0);
//            System.out.println("even "+ even);
//            System.out.println("odd "+ odd);

        /*6.Write a program that prompts the user to input a positive integer. It
            should then output a message indicating whether the number is a prime
            number. */

//            int x;
//            System.out.print("please enter positive integer : ");
//            x=input.nextInt();
//            if (x<=0)
//                System.out.println("Not positive integer ");
//            else if (x==1)
//                System.out.println(x+ " not a prime ");
//
//            else if (x>=2) {
//                boolean prime = true ;
//                for (int i = 2; i < x; i++)
//                    if (x % i == 0) {
//                        System.out.println(x+" 9not a prime ");
//                        prime = false;
//                        break;
//                    }
//                if (prime)
//                    System.out.println(x+" is prime number");
//            }

        /*
        * 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
            another for loop to print the days (Days 1 -7) for each week.
        * */

//        for (int i = 1; i <=7 ; i++) {
//            System.out.println("Week " + i);
//            {
//                for (int j = 1; j <= 7; j++)
//                    System.out.println("Day " + j);
//            }
//        }

        /*
        *
        *8.Write a program thats check if the word is a palindrome or not. hint: A
           string is said to be a palindrome if it is the same if we start reading it from
            left to right or right to left.
        * */


//            System.out.print("Please enter palindrome word: ");
//            String orginal_string = input.nextLine();
//            String reverse_string = "";
//
//            for (int i = orginal_string.length()-1; i >= 0  ; i--)
//                reverse_string = reverse_string + orginal_string.charAt(i);
//
//
//            System.out.println(reverse_string.equals(orginal_string) ?
//                             orginal_string + " is a palindrome" : orginal_string + " is not a palindrome");


    }
}