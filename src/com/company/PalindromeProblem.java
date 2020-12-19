package com.company;

import java.util.Scanner;

public class PalindromeProblem {

    static boolean isPalindrome(int n){

        int rev_num = 0;

        int temp = n;
        while(temp>0) {
            rev_num = rev_num*10+temp%10;
            temp = temp/10;
        }
        return rev_num == n ? true : false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = in.nextInt();

        System.out.println(isPalindrome(n));
    }
}
