/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hogwartsit;
import java.nio.file.*;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author andow
 */
public class Main {
    
    private static InfDB hogwartsDatabaskoppling;
 
    public static void main(String[] args){
        System.out.println("Applikationen startar.");
        
        try {
            Path dbPath = FileSystems.getDefault().getPath("HOGDB.FDB").toAbsolutePath();
            System.out.println(dbPath);
            hogwartsDatabaskoppling = new InfDB(dbPath.toString());
            new HuvudFonster(hogwartsDatabaskoppling).setVisible(true);
                    
         } catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick visst fel!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }
}


