package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i, j=0, max, l=0;
        n = in.nextInt();
        int[] mas = new int[n];
        int[] k = new int[n];
        int [][] matr = new int[n][n];

        for (i=0; i<n; i++){
            mas[i] = (int)(1 + Math.random()*100);
            System.out.print(mas[i] + "\t");
            k[i] = 0;
        }
        System.out.println();

        for (i=0; i<n-1; i++){
            if (mas[i]%mas[i+1]==0){
                k[j]++;
                matr[j][l]=mas[i];
                matr[j][l+1]=mas[i+1];
                l++;
            }
            else{
                j++;
                l=0;
            }
        }

        max = k[0];

        for (i=1; i<n; i++){
            if (max<k[i]) {
                max = k[i];
                j = i;
            }
        }

        for (i=0; i<=max; i++){
            System.out.print(matr[j][i]+"\t");
        }
    }
}
