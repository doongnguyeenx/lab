
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dongp
 */
public class Main {
    
    public static void execute() {
        System.out.println("====== SHOPPING PROGRAM ======");
        int n = Validation.getInt("Input number of bills: ", 1, Integer.MAX_VALUE);
        int totalBill = 0;
        for (int i = 0; i < n; i++) {
        int bill = Validation.getInt("Input the value of bill " + (i + 1) + ": " , 1, Integer.MAX_VALUE);
        totalBill += bill;
    }
        
        int balance = Validation.getInt("Input value of wallet: ", 0, Integer.MAX_VALUE);
        
        System.out.println("This is total bill: " + totalBill);
        Person Person = new Person(new Wallet(balance));
        if (Person.canBuy(totalBill)) {
            
            System.out.println("You can buy it");
        } else {
            System.out.println("You can't buy it");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        execute(); 
    }
    
}
