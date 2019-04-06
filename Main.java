package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan =  new Scanner (System.in);
        System.out.println("Input");
        int n = scan.nextInt();
        long fib[] = new long[n];

        fib[0] = 1;
        fib[1] = 1;

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
}
