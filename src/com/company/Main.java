package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double srmat = 0;
        double srfiz = 0;
        double srinf = 0;

        for (int i = 0;i<n;i++){

            String Fam = scanner.nextLine();
            String Im = scanner.nextLine();
            int mat = scanner.nextInt();
            int fiz = scanner.nextInt();
            int inf = scanner.nextInt();

            srmat += mat;
            srfiz += fiz;
            srinf += inf;

        }

        System.out.print(srmat/n + " " + srfiz/n + " " + srinf/n);

    }
}
