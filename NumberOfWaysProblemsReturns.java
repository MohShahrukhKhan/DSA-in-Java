package com.masai;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class NumberOfWaysProblemsReturns {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long dp[]=new long[n+1];
          dp[0]=1;
          dp[1]=1;
          dp[2]=2;
         for(int i=3;i<n+1;i++) dp[i]=-1;
        System.out.println(problemWays(n,dp));
        
        
    }
    
    public static long problemWays(int n,long dp[]){
      
        if(dp[n]!=-1)return dp[n];
        
       dp[n]= problemWays((n-1),dp)+problemWays((n-2),dp)+problemWays((n-3),dp);
       return dp[n];
    }
}
