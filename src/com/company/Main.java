package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double max = 0;
        int maxx=0;
        int maxy=0;

        for (int i=0;i<n;i++){

            System.out.print("x: ");
            int x = scanner.nextInt();
            System.out.print("y: ");
            int y = scanner.nextInt();

            double c = sqrt(x*x+y*y);

            if (c > max) {
                max = c;
                maxx = x;
                maxy = y;
            }
        }

        System.out.print(maxx + " " + maxy);

    }
}
