package Loop;

import java.util.Scanner;

public class PrintNto1{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the n: ");

        for(int i=n; i>=0; i--){
            System.out.println(i);
        }
    }
}