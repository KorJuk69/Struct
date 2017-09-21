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
        double maxdiametr = 0;

        for (int i=0;i<n;i++){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            massivx [i] = x;
            massivy [i] = y;

            if (i>0){

                double dx = massivx [i] -  massivx [i-1];
                double dy = massivy [i] -  massivy [i-1];
                double diametr = sqrt(dx*dx+dy*dy);

                if (diametr>maxdiametr) maxdiametr = diametr;

            }
        }

        System.out.print(maxdiametr);
    }
}
