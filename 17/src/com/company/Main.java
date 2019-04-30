package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n, i = 1, b, j, k=0;
	Scanner in = new Scanner(System.in);
	System.out.println();
    n = in.nextInt();
	int[] mas = new int[n];

	for (j=0; j<n; j++){
		mas[j] = (int)( 1 + Math.random()*10);
		System.out.print(mas[j] + "\t");
	}

		System.out.println();

	for (k=0; k<n; k++){
		for (j=0; j<n-1; j++){
			if (mas[j]> mas[j+1]){
				b = mas[j];
				mas[j] = mas[j+1];
				mas[j+1] = b;
			}
		}
	}

		for (j=0; j<n; j++){
			if (i==mas[j]) {
				i++;
			}
		}
		System.out.println(i);
    }
}
