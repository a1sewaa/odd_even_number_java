package com.company;
    import java.util.*;
    public class Main {

        public static void main(String[] args) {
        // write your code here
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your number here: ");
            number = sc.nextInt();
    
            if (number % 2 == 0 && number > 0) {
                System.out.println(number + " is an even number");
            } else if (number % 2 != 0 && number > 0) {
                System.out.println(number + " is an odd number");
            } else {
                System.out.println("Please enter a valid whole number");
            }



        }
    }
