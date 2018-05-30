/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author noahkiefer
 */
public class PasswordHelper {
    
    
    final String FILE_NAME = "Logins.sdv";
    BufferedReader reader;
    PrintWriter writer;
    
    public PasswordHelper() {
        
    }
    
    
    
    String[] readLogins() {
        String[] logins = new String[100];       
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line = reader.readLine();
            while(line != null) {
                logins[count] = line;
                count++;
                line = reader.readLine(); 
            }
        }
        catch(FileNotFoundException f) {
            System.out.println("Tasks file not found");
        }
        catch(IOException i){
            System.out.println("Cannot read from tasks file");
        }

        return Arrays.copyOfRange(logins, 0, count);
    }
    
    
    void writeLogins(String[] lines) {
        try {
            writer = new PrintWriter(new FileWriter(FILE_NAME));
            
            // print out all of the teasks i n the right format so that they will be correclty read the next time the program starts
            for(int i = 0; i < lines.length; i++) {
                writer.println(lines[i]);
            }
            writer.close();
            
        }
        catch(IOException i){
            System.out.println("Cannot open tasks file for output");
        }
    }
    
    
}
