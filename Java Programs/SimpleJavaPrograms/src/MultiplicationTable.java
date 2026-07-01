package Loop;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(n+ " x "+i+" "+"= "+( n*i));
        }
        sc.close();
    }
}
