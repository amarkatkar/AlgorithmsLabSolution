package com.glearning.pm.client;

import com.glearning.pm.service.Transactions;

import java.util.Scanner;

public class PayMoneyclient {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array ");
        int size = sc.nextInt();

        System.out.println("Enter the values of array ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved ");
        int num = sc.nextInt();

        int[] tar = new int[num];
        Transactions obj1 = new Transactions();

        for (int j = 0; j < num; j++) {
            System.out.println("Enter the value of target ");
            tar[j] = sc.nextInt();
            int iterations = obj1.targetCheck(arr, tar[j]);
            if (iterations != -1) {
                System.out.println("Target " + tar[j] + " Achieved after " + iterations + " iterations");
            } else {
                System.out.println("Target " + tar[j] + " not achieved");
            }
        }
      sc.close();
    }

}
