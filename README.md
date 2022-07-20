# DSA-in-Java

# BoilerPlate for OJ in Java

import java.util.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main
{
    public static void main(String[] arg)throws IOException{
        
        BufferedReader bf= new BufferedReader(new   InputStreamReader(System.in));
        //int q = Integer.parseInt(bf.readLine().trim());
        String[] str = bf.readLine().trim().split(" ");

    	  int[] iniArr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
      
    
        
}
