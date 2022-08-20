import java.lang.*;
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
         String s=sc.next();
//method 1
        String ans="";
         for(int i=0;i<s.length();i++){
         String sub="";
         for(int k=i;k<s.length();k++){
             sub+=s.charAt(k);
            
             if(palindromCheck(sub)){
                 if(ans.length()<sub.length()){
                     ans=sub;
                 }
             }
         }
         }
         System.out.println(ans.length()); 





// method 2
        /* 
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(s.substring(start, end + 1).length()); */
    }
     private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    
    public static boolean palindromCheck(String str){
        int start=0;
        int end=str.length()-1;
        
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}