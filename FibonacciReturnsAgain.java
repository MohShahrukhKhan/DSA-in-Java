package com.masai.demo;

import java.util.*;
import java.io.*;
import java.lang.*;

public class FibonacciReturnsAgain {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=-1;
        }
        
        System.out.println(Fibonacci(n,dp));
       }
        public static long Fibonacci(int n,long dp[]){
            if(dp[n]!=-1)return dp[n];
            
            
            dp[n]=Fibonacci(n-1,dp)+Fibonacci(n-2,dp);
            return dp[n];
        }
}
