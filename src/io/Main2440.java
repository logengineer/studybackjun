package io;

import java.util.Scanner;

public class Main2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        for (int i = 1; i <=count; i++) {
            for (int j = i; j <=count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
