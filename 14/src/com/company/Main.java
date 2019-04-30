package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n, i, j=1;
	Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
	n = in.nextInt();
	int [] a = new int[n];
	for (i=0; i<n; i++){
	    a[i] = (int)(0+Math.random()*10);
        System.out.print(a[i] + "\t");
    }

		System.out.println();

	for (i=0; i<n; i++){
		for(j=i; j<n; j++){
			if (a[i]<a[j]){
				a[i]=a[j];
				j=n-1;
			}
			else
				if (j==n-1 && a[i]>=a[j]){
					a[i]=0;
				}
		}
	}

	for (i=0; i<n; i++){
		System.out.print(a[i] + "\t");
	}
    }
}
