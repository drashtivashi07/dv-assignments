/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njassignments;
import java.io.*;
import java.util.*;

/**
 *
 * @author ADMIN
 */

public class kaprekar {
    public static void main(String args[]) throws Exception{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the lower range : ");
        long low_range=scan.nextInt();
        System.out.println("Enter the upper range : ");
        long high_range=scan.nextInt();
        long d,i,n,a,b,sqr;
        System.out.println("The Kaprekar numbers are : ");
        for(i=low_range;i<=high_range;i++)
        {
            n=i;
            d=0;
            while(n>0){
                d++;
                n/=10;
            }
            sqr=i*i;
            a=sqr%(long)Math.pow(10,d);
            b=sqr/(long)Math.pow(10,d);
            if(a+b==i){
                System.out.print(i+" ");
            }
        }
    }
}



