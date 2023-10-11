/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dongp
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int getInt(String msg, int min, int max) {
        while (true) {
            System.out.print(msg);
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (min <= n && n <= max)
                    return n;
                System.out.println("Must in range: " + min + " -> " + max);
            } catch (NumberFormatException ex) {
                System.out.println("Please input a number");
            }
        }
    }
    
    public static int [] getRandomArray(int  n, int max){
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            a[i] = random.nextInt(max) + 1;
        }
        
        return a;
    }
    
    public static void displayArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    }
    
    public static int linearSearch(int [] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]  == x) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    public static void main(String[] args) {
        int n = getInt("Enter number of Array ", 1, Integer.MAX_VALUE);
        int x = getInt("Enter search value ", 1, Integer.MAX_VALUE);
        int[] a = getRandomArray(n, n);
        
        displayArray(a);
        
        int index = linearSearch(a, x);
        if (index == -1) {
            System.out.println("Not found value in array");
        } else {
            System.out.println("Found " + x + " at index " + index);
        }
    }
    
}
