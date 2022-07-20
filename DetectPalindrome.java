/*
Detect Palindrome;

 Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)

You must write a recursive function to achieve this

You must not use the reverse() function. Using that would lead to disqualification

Detailed Explanation:
A palindrome is a word, number, phrase, or other sequence of characters which reads
 the same backward as forward, such as madam, racecar. In this question, 
 we have to check if the number is palindrome or not. A number can be said to be a palindrome, 
 if it is the same if the order of its digits is reversed. Therefore, 
 a number with digits reversed must be generated. To do that,
 a number must be divided by 10 until it becomes zero. At each iteration, 
 the modulo must be added to the number, by multiplying the number with 10,
 as 10 is the order for decimal number systems.
  If the number generated with digits reversed is equal to the original number,
   then we can say that the number is a palindrome, otherwise not.

*/







import java.util.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;


public class DetectPalindrome {
    public static void main(String[] arg)throws IOException{

        BufferedReader bf= new BufferedReader(new   InputStreamReader(System.in));
        String str=bf.readLine().trim();
        
        
        int num = Integer.parseInt(str);
        
       
        
        String result="No";
        if(num==detectPalindrome(num))result="Yes";
    
        System.out.println(result);
    
    
        }
    
       //this method for String 
        public static String detectPalindrome(String str){
           String ans="Yes";
           
           for(int i=0;i<str.length();i++){
               if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                   ans="No";
                   break;
               }
           }
           
           return ans;
        }
       
        //This Method for Integer
        public static int detectPalindrome(int num){
          int rev=0;
           while(num!=0){
              int remainder=num%10;
               rev=rev*10+remainder;
               num=num/10;
           }
           
           return rev;
           
        }
    
}
