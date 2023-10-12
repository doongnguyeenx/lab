
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dongp
 */
public class Validation {
    
     public static Scanner sc = new Scanner(System.in);  
    
    public static int getInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        
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
    
}
