package InterviewCode;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int fact =1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial ="+fact);

    }
}
//The factorial of a number is the multiplication of all positive integers from 1 to that number.
//
//It is represented by the symbol !.