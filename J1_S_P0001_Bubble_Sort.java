package j1_s_p0001_bubble_sort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bravee06
 */
public class J1_S_P0001_Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size = inputInt("Enter number of array:",0,Integer.MAX_VALUE);
        
      
        int array[] = getRandomIntegerArray(size);
        
        
        display(array,"Unsorted array:  ");
        
       
        sortAscendingBubbbleSort(array);
        
        
        display(array,"Sorted array:  ");
        
        
        
    }

  
   
    public static int inputInt(String msg, int min, int max) {
        
        
        while (true) {
            
            
            try {
                
                System.out.println(msg);

                Scanner sc = new Scanner(System.in);
                String result_raw = sc.next();
                
                int result = Integer.parseInt(result_raw);

                if (result < min || result > max) {
                    System.out.println("You must enter number have range from " + min + " to " + max + " ! Again !");
                    continue;
                }
                
                return result;

            } catch (NumberFormatException e) {
                
                System.out.println("You must enter number format !");
                
                continue;
                
            }

        }
    }
    
   
    public static int[] getRandomIntegerArray(int size){
        int array[] = new int[size];
        
        for(int i = 0; i < size; i++){
            
            int number_range = size;
            
            Random random = new Random();
            int random_number = random.nextInt(number_range);
            
            array[i] = random_number;
           
        }
        return array;
    }
    
    
    public static void display(int array[],String msg){
        
        System.out.print(msg);
        
        int size = array.length;
        
        int end_bracket_index = size - 1;
        
        System.out.print("[");
        
        for(int i = 0; i < size; i++){
            
            System.out.print( array[i] );
            
            if(i != end_bracket_index)
            {
                System.out.print(", ");
            }
        }
        
        System.out.print("]");
        
        
        if(msg.equals("Unsorted array:  ")){
            System.out.println();
        }
    }
    
    
    public static int[] sortAscendingBubbbleSort(int array[]){
        
        int size = array.length;
        for(int i = 0; i < size; i++){
          
            for(int j = 0; j < size - (i+1); j++){
                
                if(array[j] > array[j+1]){  
                     
                    int temp = array[j];
                    
                    array[j] = array[j+1];
                    
                    array[j+1] = temp;
                }
            }
        }
        
        return array;
    }
    
        
    
    
    

}


