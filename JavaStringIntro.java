
package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int asc1=(int)A.charAt(0);
        int asc2=(int)B.charAt(0);
        if (asc1 > asc2) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String newA = A.toUpperCase().substring(0,1);
        newA  += A.substring(1);

        String newB = B.toUpperCase().substring(0,1);
        newB  += B.substring(1);

        System.out.println(newA+" "+newB);
    }

}


