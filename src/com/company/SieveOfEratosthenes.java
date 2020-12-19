package com.company;
import java.util.Scanner;

public class SieveOfEratosthenes {
    static void soe(int n) {
        boolean arr[] = new boolean[n+1];
        for(int i=0;i<n;i++) {
            arr[i] = true;
        }
        for(int i=2;i*i<=n;i++) {
            if(arr[i]==true) {
                for(int j=2*i;j<=n;j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();
        System.out.println("Primes number till: "+n+" are: ");
        soe(n);
    }
}
