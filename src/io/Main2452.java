package io;

import java.util.Scanner;

public class Main2452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();

        int N = sc.nextInt();
        sc.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <N - i; j++)
                System.out.print(" ");
            for (int j = N-i; j < N; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= N-1; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = i; j <= N-1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
