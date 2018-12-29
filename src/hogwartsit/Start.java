/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hogwartsit;
import java.nio.file.FileSystems;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Anna Svensson och Ellinor Danielsson
 */
public class Start {
    
    private static InfDB hogwartsDatabaskoppling;
    
    // mainmetoden startar applikationen 
    public static void main(String[] args){
        System.out.println("Applikationen startar.");
          
        nimbusStil();
        try {
            // Söker efter filmappen som applikationen körs från och letar specifikt upp databasfilen
            String databasSokvag = FileSystems.getDefault().getPath("HOGDB.FDB").toAbsolutePath().toString();
            System.out.println(databasSokvag);
            
            // Instansierar ett nytt objekt av typen InfDB, med databasens sökväg som inparameter
            hogwartsDatabaskoppling = new InfDB(databasSokvag);
            
            // Instansierar och öppnar ett nytt Huvudfönster med ett objekt av typen InfDB som inparameter
            new HuvudFonster(hogwartsDatabaskoppling).setVisible(true);
                    
         } catch(InfException ettUndantag){
            //Visar ett felmeddelande om ett undantag upptäcks vid körning av metoden.
            JOptionPane.showMessageDialog(null, "Något gick visst fel!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
        
    }
    
    private static void nimbusStil() {
        // Innehåller designelement för Huvudfönstret
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HuvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}


