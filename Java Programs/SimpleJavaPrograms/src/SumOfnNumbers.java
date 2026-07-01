package Loop;

import java.util.Scanner;

public class SumOfnNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int sum = 0;


        for (int i = 0; i <= n; i++) {
//            sum = sum + i;
            sum +=i;
        }
        System.out.println("sum " + sum);
    }
}
