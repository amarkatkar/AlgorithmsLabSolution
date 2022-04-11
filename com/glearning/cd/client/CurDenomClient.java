package com.glearning.cd.client;

import com.glearning.cd.service.CurDenomService;

import java.util.Scanner;

public class CurDenomClient {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations ");
        int size_of_curdenominations = sc.nextInt();

        int[] arr = new int[size_of_curdenominations];

        System.out.println("Enter the currency denominations value");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the amount you want to pay");
        int amt = sc.nextInt();

        CurDenomService obj = new CurDenomService();
        obj.descOrder(arr);
        obj.countnotes(arr,amt);
        sc.close();
    }
}
