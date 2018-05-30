/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author noahkiefer
 */
public class Model {
    int creditCounter = 0;
    Credits[] credits = new Credits[100];
    PasswordHelper helper = new PasswordHelper();
    
    Model() {
        //Constructor
        
        String lines[] = helper.readLogins();
        creditCounter = lines.length;
        System.out.println(creditCounter);
        // loop through each line and create a new task out of it 
        for(int i = 0; i < lines.length; i++) {
            // Create the ith new tsask
            credits[i] = new Credits();
            // split the line where the # is
            String creditLine[] = lines[i].split("#");
            // use the first part to set new title and the second part to set new description  
            credits[i].setCardNumber(creditLine[0]);
            credits[i].setCardHash(creditLine[1]);  
        }
    
    }
    
     void add(String cardNumber, String Hash){
        // add a new Task      
        Credits credit = new Credits();
        credit.setCardNumber(cardNumber);
        credit.setCardHash(Hash);
        
        // add new task to the tasks array
        credits[creditCounter] = credit;
        creditCounter++;
        
        // Need to save tasks to file
        helper.writeLogins(getCredits());
        
//        System.out.println(Arrays.deepToString(getCredits()));
    } 
     
    String[] getCredits() {
        // Create a new, better array with all the entered credits but take out all the empty spots from the original 100 long array
        String[] tmpCredits = new String[creditCounter];
        for (int i = 0; i < creditCounter; i++) {
            tmpCredits[i] = credits[i].toString();
        }
        return tmpCredits;
    }
}
