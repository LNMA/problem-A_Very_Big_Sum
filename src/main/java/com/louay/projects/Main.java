package com.louay.projects;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input length of array : ");
        int length = input.nextInt();

        BigInteger [] arr = new BigInteger[length];

        System.out.println("please input your integer number : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new BigInteger(input.next());
        }

        resultOfSum(arr);
    }

    public static void resultOfSum(BigInteger[] arr) {
        BigInteger result = BigInteger.ZERO;

        for (BigInteger num : arr) {
            result = result.add(num);
        }

        System.out.println("The result of the sum is : " + result);
    }
}
