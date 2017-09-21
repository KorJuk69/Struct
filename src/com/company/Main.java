package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double massiv [];
        massiv = new double[n];

        for (int i=0;i<n;i++){

            System.out.print("x: ");
            double x = scanner.nextInt();
            System.out.print("y: ");
            double y = scanner.nextInt();

           massiv [i] = (x+y)/2;

        }

        for (int i=0;i<n;i++) {

            System.out.print(massiv [i] + " ");

        }
    }
}
