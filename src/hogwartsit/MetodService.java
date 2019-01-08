/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andow
 */
public class MetodService {
    private static InfDB idb;
    
        public MetodService(InfDB idb) {
        this.idb = idb;
        }
      
    public void fyllComboboxKurserLarare(JComboBox<String> enCombobox) {
        //Kontrollerar om den inloggade läraren är admin
        if(FrmLoggaIn.getArAdmin()) {
            try {
                //Hämtar en lista på kursnamn på alla kurser i databasen
                ArrayList<HashMap<String, String>> kursLista = idb.fetchRows("SELECT kursnamn FROM kurs");
                //Loopar igenom listan och lägger till alla kursnamn till kurslistan i fönstret
                for (int i = 0; i < kursLista.size(); i++) {
                        String kursNamn = kursLista.get(i).get("KURSNAMN");
                            enCombobox.addItem(kursNamn);
            } 
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
            }
            catch (NullPointerException ettAnnatUndantag) {
                ettAnnatUndantag.getMessage();
            }   
        }
        else {
            try {
                //Hämtar lärar ID på den inloggade läraren
                String lararID = FrmLoggaIn.getArInloggadSom();
                //Hämtar en lista på kursnamn på lärarens kurser i databasen
                ArrayList<HashMap<String, String>> kursLista = idb.fetchRows("SELECT kursnamn FROM kurs WHERE kurslarare = " + lararID);
                //Kontrollerar om läraren har några kurser kopplade till sig, annars är listan null
                if (kursLista != null) {
                    //Loopar igenom listan och lägger till alla kursnamn till kurslistan i fönstret
                    for (int i = 0; i < kursLista.size(); i++) {
                        String kursNamn = kursLista.get(i).get("KURSNAMN");
                        enCombobox.addItem(kursNamn);  
                    }
                }
                else {
                    //Byter ut "Välj en kurs" och visar istället "Inga kurser att visa"
                    enCombobox.removeItemAt(0);
                    String meddelande = "Inga kurser att visa";
                    enCombobox.addItem(meddelande);
                }
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
            }
            catch (NullPointerException ettAnnatUndantag) {
                ettAnnatUndantag.getMessage();
            }  
        }
    }
}


