package com.masai.demo;

import java.util.*;
import java.io.*;
import java.lang.*;

public class DifferentWaysAsASum {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;
        
        for(int i=4;i<=n;i++){
            dp[i]=-1;
        }
        
        System.out.println(Fibonacci(n,dp));
       }
        public static int Fibonacci(int n,int dp[]){
            if(dp[n]!=-1)return dp[n];
            
            
            dp[n]=Fibonacci(n-1,dp)+Fibonacci(n-3,dp)+Fibonacci(n-4,dp);
            return dp[n];
        }
}
