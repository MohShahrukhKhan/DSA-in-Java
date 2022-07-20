/*
Units Consumed

Electricity consumption is measured via slab rates for a particular wattage capacity, 
which is as follows

Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill.

You are given total amount of bill, N , you need to find total unit consumed.

 */



import java.util.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main { public static void main(String[] arg)throws IOException{

    BufferedReader bf= new BufferedReader(new   InputStreamReader(System.in));
    int rupees = Integer.parseInt(bf.readLine().trim());
    int fixedCharge=80;
     rupees=rupees-fixedCharge;
    int unit=0;
    if(rupees<=150){
        unit=(rupees/3);
       
    }else if(rupees<=650){
        rupees=rupees-150;
        unit=50+(rupees/5);
       
    }else if(rupees>650){
        rupees=rupees-650;
        unit=150+(rupees/10);
     
    }

   System.out.println(unit);


}
}