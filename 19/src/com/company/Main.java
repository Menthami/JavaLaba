package com.company;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n, i=0, j=0;

            System.out.print("Введите количество билетиков: ");

            n = in.nextInt();

            String[] tickets = new String[n];

            for (i = 0; i < n; i++)
                tickets[i] = Integer.toString((int) (100000 + Math.random() * 900000));

            System.out.print("Количество всех билетов: ");
            for (i = 0; i < n; i++)
                System.out.print(tickets[i] + " ");

            int sum1 = 0, sum2 = 0;
            int kl = 0;

            System.out.println();

            System.out.print("\"Счастливые\" билетики:");
            for (i = 0; i < n; i++) {
                for (j = 0; j < 3; j++)
                    sum1 += tickets[i].charAt(j);
                for (j = 3; j < 6; j++)
                    sum2 += tickets[i].charAt(j);
                if (sum1 == sum2) {
                    kl++;
                    System.out.print("\n" + tickets[i]);
                }
                sum1 = 0;
                sum2 = 0;
            }
            if (kl == 0){
                System.out.println(" Счастливых билетиков нет");
            }

        }
    }

