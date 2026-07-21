package InterviewCode;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 7;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
