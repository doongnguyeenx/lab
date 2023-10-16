/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p006;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dongp
 */
public class P006 {

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
    
    public static int binarySearch(int [] a, int x, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            }
            
            if (a[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    } 
    
    public static int binarySeachRecursion(int [] a, int x, int left, int right) {
        if(left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            }
            if(a[mid] > x) {
                return binarySeachRecursion(a, x, left, mid - 1);
            }
            return binarySeachRecursion(a, x, mid + 1, right);
        }
    return -1;
    }
    
    
    public static void main(String[] args) {
        int n = getInt("Enter number of Array ", 1, Integer.MAX_VALUE);
        int x = getInt("Enter search value ", 1, Integer.MAX_VALUE);
        int[] a = getRandomArray(n, n);

        Arrays.sort(a);
        
        displayArray(a);
        
        int index = binarySeachRecursion(a, x, 0, n - 1);
        if (index == -1) {
            System.out.println("Not found value in array");
        } else {
            System.out.println("Found " + x + " at index " + index);
        }
    }
    
}


