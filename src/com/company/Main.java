package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double massivx [];
        massivx = new double[n];
        double massivy [];
        massivy = new double[n];
        double massivc [];
        massivc = new double[n];


        for (int i=0;i<n;i++){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            massivx [i] = x;
            massivy [i] = y;
            massivc [i] = sqrt(x*x+y*y);

        }

        boolean changes;
        do {
            changes = false;
            for (int i = 0; i < n-1; i++) {
                if (massivc[i] > massivc[i + 1]) {
                    double current = massivc[i];
                    massivc[i] = massivc[i + 1];
                    massivc[i + 1] = current;
                    current = massivx[i];
                    massivx[i] = massivx[i + 1];
                    massivx[i + 1] = current;
                    current = massivy[i];
                    massivy[i] = massivy[i + 1];
                    massivy[i + 1] = current;
                    changes = true;
                }
            }

        }
        while (changes);

        for (int i = 0; i < n; i++){
            System.out.println(massivx [i] + " " + massivy [i]);
        }

    }
}
