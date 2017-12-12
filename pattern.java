/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njassignments;
/**
 *
 * @author ADMIN
 */

import java.io.*;
import java.util.*;
public class pattern
{
    public static void main(String args[])
    {
        System.out.println("Enter the size: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        if(size<=23)
            hashes(size);
        else
            System.out.println("Invalid range!");
    }
        public static void hashes(int n)
    {
        int i, j, k=2*n-2;
        for(i=0; i<n; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 2;
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}

