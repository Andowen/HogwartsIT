/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author ellin
 */
public class Validering {
    
    //Kollar om textfältet har ett värde.
    public static boolean textfaltHarVarde(JTextField tf) {
        
        boolean harVarde = true;
        
        if(tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            tf.requestFocus();
            return false;
        } 
        return harVarde;
    }  
    
    //Kollar om textfältet är ett heltal.
    public static boolean textfaltTal(JTextField tf) {
   
        boolean ettTal = true; 
        
        try{
            String instring = tf.getText();
            Integer.parseInt(instring);        
            tf.requestFocus();  
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ange ett heltal!");
            ettTal = false;    
        }    
        return ettTal;
    }
}
    

//Lösenord vid inloggning
    
//Elevhem

//Datum

// Betygen T,D,E,A,O,P
    
    
