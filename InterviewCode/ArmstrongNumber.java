package InterviewCode;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (original == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        sc.close();
    }
}
