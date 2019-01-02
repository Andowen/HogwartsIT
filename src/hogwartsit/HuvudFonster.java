/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyVetoException;
import oru.inf.InfDB;
import oru.inf.InfException;
import org.seamless.swing.ClosableTabbedPane;

/**
 *
 * @author Anna Svensson och Ellinor Danielsson
 */
public class HuvudFonster extends javax.swing.JFrame {

    private static InfDB idb;
    private FrmLoggaIn frmLoggaIn;
    private FrmElevElevhemLista frmElevElevhemslista;
    private FrmElevElevhemsPokal frmElevElevhemsPokal;
    private FrmElevKursSokElev frmElevKurser;
    private FrmElevSokBetyg frmElevBetyg;
    private FrmElevKursSokLarare frmElevLarare;
    private FrmElevHittaPrefekt frmElevHittaPrefekt;
    private ClosableTabbedPane paneHuvudfonsterFlikar;
    private FrmLarareElevinfoNyregistreraElev frmLarareNyregElev;
    

    
    /**
     * Creates new form TestFönster
     */
    public HuvudFonster(InfDB idb) {
        initComponents();
        this.setSize(600, 400);
        this.idb = idb;
        paneHuvudfonsterFlikar = new ClosableTabbedPane() ;
        getContentPane().add(paneHuvudfonsterFlikar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuHuvudMeny = new javax.swing.JMenuBar();
        mnuMeny = new javax.swing.JMenu();
        mnuItmLoggaIn = new javax.swing.JMenuItem();
        mnuItmFonster = new javax.swing.JMenu();
        mnuItmStangAktuelltFonster = new javax.swing.JMenuItem();
        mnuItmStangAllaFonster = new javax.swing.JMenuItem();
        mnuItmAvsluta = new javax.swing.JMenuItem();
        mnuElev = new javax.swing.JMenu();
        mnuItmElevhem = new javax.swing.JMenu();
        mnuItmListaElever = new javax.swing.JMenuItem();
        mnuItmElevhemsPokal = new javax.swing.JMenuItem();
        mnuItmHittaPrefekt = new javax.swing.JMenuItem();
        mnuItmElevKurser = new javax.swing.JMenu();
        mnuItmKursSokElev = new javax.swing.JMenuItem();
        mnuItmKursSokLarare = new javax.swing.JMenuItem();
        mnuItmElevSokBetyg = new javax.swing.JMenuItem();
        mnuLarare = new javax.swing.JMenu();
        mnuItmLarareElevinfo = new javax.swing.JMenu();
        mnuItmLarareNyregElev = new javax.swing.JMenuItem();
        mnuItmLarareRedigeraElev = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuItmLarareBetyg = new javax.swing.JMenu();
        mnuItmLarareRegistreraKursbetyg = new javax.swing.JMenuItem();
        mnuItmLarareAndraKursbetyg = new javax.swing.JMenuItem();
        mnuItmLarareElevhem = new javax.swing.JMenu();
        mnuItmLarareRegistreraHuspoang = new javax.swing.JMenuItem();
        mnuItmLarareDraAvHuspoang = new javax.swing.JMenuItem();
        mnuItmLarareBytLosenord = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HogwartsIT");
        setName(""); // NOI18N

        mnuMeny.setText("Meny");

        mnuItmLoggaIn.setText("Logga in");
        mnuItmLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLoggaInActionPerformed(evt);
            }
        });
        mnuMeny.add(mnuItmLoggaIn);

        mnuItmFonster.setText("Fönster");

        mnuItmStangAktuelltFonster.setText("Stäng aktuellt fönster");
        mnuItmStangAktuelltFonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmStangAktuelltFonsterActionPerformed(evt);
            }
        });
        mnuItmFonster.add(mnuItmStangAktuelltFonster);

        mnuItmStangAllaFonster.setText("Stäng alla fönster");
        mnuItmStangAllaFonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmStangAllaFonsterActionPerformed(evt);
            }
        });
        mnuItmFonster.add(mnuItmStangAllaFonster);

        mnuMeny.add(mnuItmFonster);

        mnuItmAvsluta.setText("Avsluta");
        mnuItmAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmAvslutaActionPerformed(evt);
            }
        });
        mnuMeny.add(mnuItmAvsluta);

        mnuHuvudMeny.add(mnuMeny);

        mnuElev.setText("Elev");

        mnuItmElevhem.setText("Elevhem");

        mnuItmListaElever.setText("Lista elever");
        mnuItmListaElever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmListaEleverActionPerformed(evt);
            }
        });
        mnuItmElevhem.add(mnuItmListaElever);

        mnuItmElevhemsPokal.setText("Elevhemspokalen");
        mnuItmElevhemsPokal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmElevhemsPokalActionPerformed(evt);
            }
        });
        mnuItmElevhem.add(mnuItmElevhemsPokal);

        mnuItmHittaPrefekt.setText("Hitta prefekt");
        mnuItmHittaPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmHittaPrefektActionPerformed(evt);
            }
        });
        mnuItmElevhem.add(mnuItmHittaPrefekt);

        mnuElev.add(mnuItmElevhem);

        mnuItmElevKurser.setText("Kurser");

        mnuItmKursSokElev.setText("Sök elev");
        mnuItmKursSokElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmKursSokElevActionPerformed(evt);
            }
        });
        mnuItmElevKurser.add(mnuItmKursSokElev);

        mnuItmKursSokLarare.setText("Sök lärare");
        mnuItmKursSokLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmKursSokLarareActionPerformed(evt);
            }
        });
        mnuItmElevKurser.add(mnuItmKursSokLarare);

        mnuElev.add(mnuItmElevKurser);

        mnuItmElevSokBetyg.setText("Sök betyg");
        mnuItmElevSokBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmElevSokBetygActionPerformed(evt);
            }
        });
        mnuElev.add(mnuItmElevSokBetyg);

        mnuHuvudMeny.add(mnuElev);

        mnuLarare.setText("Lärare");
        mnuLarare.setEnabled(false);

        mnuItmLarareElevinfo.setText("Elevinformation");

        mnuItmLarareNyregElev.setText("Nyregistrera elev");
        mnuItmLarareNyregElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareNyregElevActionPerformed(evt);
            }
        });
        mnuItmLarareElevinfo.add(mnuItmLarareNyregElev);

        mnuItmLarareRedigeraElev.setText("Redigera elev");
        mnuItmLarareElevinfo.add(mnuItmLarareRedigeraElev);

        jMenuItem1.setText("Ta bort elev");
        jMenuItem1.setEnabled(false);
        mnuItmLarareElevinfo.add(jMenuItem1);

        mnuLarare.add(mnuItmLarareElevinfo);
        mnuItmLarareElevinfo.getAccessibleContext().setAccessibleDescription("");

        mnuItmLarareBetyg.setText("Kursbetyg");

        mnuItmLarareRegistreraKursbetyg.setText("Registrera kursbetyg");
        mnuItmLarareBetyg.add(mnuItmLarareRegistreraKursbetyg);

        mnuItmLarareAndraKursbetyg.setText("Ändra kursbetyg");
        mnuItmLarareBetyg.add(mnuItmLarareAndraKursbetyg);

        mnuLarare.add(mnuItmLarareBetyg);

        mnuItmLarareElevhem.setText("Elevhemspoäng");

        mnuItmLarareRegistreraHuspoang.setText("Registrera huspoäng");
        mnuItmLarareElevhem.add(mnuItmLarareRegistreraHuspoang);

        mnuItmLarareDraAvHuspoang.setText("Dra av huspoäng");
        mnuItmLarareElevhem.add(mnuItmLarareDraAvHuspoang);

        mnuLarare.add(mnuItmLarareElevhem);

        mnuItmLarareBytLosenord.setText("Byt lösenord");
        mnuLarare.add(mnuItmLarareBytLosenord);

        mnuHuvudMeny.add(mnuLarare);

        mnuAdmin.setText("Administratör");
        mnuAdmin.setEnabled(false);
        mnuHuvudMeny.add(mnuAdmin);

        setJMenuBar(mnuHuvudMeny);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void oppnaFlik(javax.swing.JInternalFrame enFlik, String flikTitel) {
        // Metoden hjälper till att öppna en flik och kan göra detta utifrån basklassen.       
        paneHuvudfonsterFlikar.addTab(flikTitel, enFlik);
        paneHuvudfonsterFlikar.setSelectedIndex(paneHuvudfonsterFlikar.getTabCount()-1);
            // Maximerar fliken.
            try { 
                enFlik.setMaximum(true);
            }catch (PropertyVetoException ettUndantag) {
                System.out.println(ettUndantag.getMessage());
            }
            
            // Tar bort ramen och huvudet från fönstret.
            enFlik.setBorder(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)enFlik.getUI()).setNorthPane(null); 
        }
    
    private void flyttaFokusTillFlik(String flikTitel) {
        //Flyttar fokus till fliken
        int tabCount = paneHuvudfonsterFlikar.getTabCount();
        for (int i=0; i < tabCount; i++) 
        {
            String tabTitle = paneHuvudfonsterFlikar.getTitleAt(i);
            if (tabTitle.equals(flikTitel)){ 
                paneHuvudfonsterFlikar.setSelectedIndex(i);
            }
        }
    }

    private void mnuItmLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLoggaInActionPerformed
        //Instansierar ett inloggningsfönster om ett sådant inte redan finns.
        if(frmLoggaIn == null || !frmLoggaIn.isShowing()) {
            frmLoggaIn = new FrmLoggaIn(idb);
            //Lägger till en Window Listener som observerar fönstrets aktuella tillstånd.
            frmLoggaIn.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {
                    //Används ej.
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    //Används ej.
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    //Om fönstret stängs sker följande.
                    if (frmLoggaIn.getArInloggad()) {
                    //Kontrollerar att användaren är inloggad, ändrar menytexten och ger tillgång till tidigare inaktiverade menyval.
                        mnuItmLoggaIn.setText("Logga ut");    
                        mnuLarare.setEnabled(true);
                        if(frmLoggaIn.getArAdmin()) {
                           mnuAdmin.setEnabled(true); 
                        }                  
                    }
                }

                @Override
                public void windowIconified(WindowEvent e) {
                    //Används ej.
                }

                @Override
                public void windowDeiconified(WindowEvent e) {
                    //Används ej.
                }

                @Override
                public void windowActivated(WindowEvent e) {
                    //Används ej.
                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                    //Används ej.
                }
            });
            
            // Om texten i menyn visar "Logga in" öppnas ett inloggningsfönster och placeras i mitten
            if (mnuItmLoggaIn.getText().equals("Logga in")) {
                frmLoggaIn.setVisible(true);
                frmLoggaIn.setLocation(this.getWidth()/2 - frmLoggaIn.getWidth()/2, this.getHeight()/2 - frmLoggaIn.getHeight()/2);
            }
            else {
                // Annars ändras texten till logga in, och vissa menyobjekt blir inaktiverade
                mnuItmLoggaIn.setText("Logga in");
                mnuAdmin.setEnabled(false);
                mnuLarare.setEnabled(false);
                //Stänger alla öppna flikar vid utloggning.
                paneHuvudfonsterFlikar.removeAll();
            }              
        }       
    }//GEN-LAST:event_mnuItmLoggaInActionPerformed
    
    private void mnuItmAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmAvslutaActionPerformed
        //Avslutar applikationen
        System.exit(1);
    }//GEN-LAST:event_mnuItmAvslutaActionPerformed

    private void mnuItmElevSokBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmElevSokBetygActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevBetyg == null || !frmElevBetyg.isShowing()) {
           frmElevBetyg = new FrmElevSokBetyg(idb);
            oppnaFlik(frmElevBetyg, "Sök betyg");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Sök betyg");
        }
    }//GEN-LAST:event_mnuItmElevSokBetygActionPerformed

    private void mnuItmStangAktuelltFonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmStangAktuelltFonsterActionPerformed
        int enFlik = paneHuvudfonsterFlikar.getSelectedIndex();
        paneHuvudfonsterFlikar.remove(enFlik);      
    }//GEN-LAST:event_mnuItmStangAktuelltFonsterActionPerformed

    private void mnuItmStangAllaFonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmStangAllaFonsterActionPerformed
        paneHuvudfonsterFlikar.removeAll();
    }//GEN-LAST:event_mnuItmStangAllaFonsterActionPerformed

    private void mnuItmListaEleverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmListaEleverActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevElevhemslista == null || !frmElevElevhemslista.isShowing()) {
           frmElevElevhemslista = new FrmElevElevhemLista(idb);
            oppnaFlik(frmElevElevhemslista, "Elevhemslista");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Elevhemslista");
        }
    }//GEN-LAST:event_mnuItmListaEleverActionPerformed

    private void mnuItmElevhemsPokalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmElevhemsPokalActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevElevhemsPokal == null || !frmElevElevhemsPokal.isShowing()) {
           frmElevElevhemsPokal = new FrmElevElevhemsPokal(idb);
            oppnaFlik(frmElevElevhemsPokal, "Ställning elevhemspokalen");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Ställning elevhemspokalen");
        }
    }//GEN-LAST:event_mnuItmElevhemsPokalActionPerformed

    private void mnuItmHittaPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmHittaPrefektActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevHittaPrefekt == null || !frmElevHittaPrefekt.isShowing()) {
           frmElevHittaPrefekt = new FrmElevHittaPrefekt(idb);
            oppnaFlik(frmElevHittaPrefekt, "Hitta prefekt");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Hitta prefekt");
        }
    }//GEN-LAST:event_mnuItmHittaPrefektActionPerformed

    private void mnuItmKursSokElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmKursSokElevActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevKurser == null || !frmElevKurser.isShowing()) {
           frmElevKurser = new FrmElevKursSokElev(idb);
            oppnaFlik(frmElevKurser, "Sök kurs för elev");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Sök kurs för elev");
        }
    }//GEN-LAST:event_mnuItmKursSokElevActionPerformed

    private void mnuItmKursSokLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmKursSokLarareActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmElevLarare == null || !frmElevLarare.isShowing()) {
           frmElevLarare = new FrmElevKursSokLarare(idb);
            oppnaFlik(frmElevLarare, "Sök lärare för kurs");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Sök lärare för kurs");
        }
    }//GEN-LAST:event_mnuItmKursSokLarareActionPerformed

    private void mnuItmLarareNyregElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareNyregElevActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmLarareNyregElev == null || !frmLarareNyregElev.isShowing()) {
           frmLarareNyregElev = new FrmLarareElevinfoNyregistreraElev(idb);
            oppnaFlik(frmLarareNyregElev, "Nyregistrera en elev");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Nyregistrera en elev");
        }
    }//GEN-LAST:event_mnuItmLarareNyregElevActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuElev;
    private javax.swing.JMenuBar mnuHuvudMeny;
    private javax.swing.JMenuItem mnuItmAvsluta;
    private javax.swing.JMenu mnuItmElevKurser;
    private javax.swing.JMenuItem mnuItmElevSokBetyg;
    private javax.swing.JMenu mnuItmElevhem;
    private javax.swing.JMenuItem mnuItmElevhemsPokal;
    private javax.swing.JMenu mnuItmFonster;
    private javax.swing.JMenuItem mnuItmHittaPrefekt;
    private javax.swing.JMenuItem mnuItmKursSokElev;
    private javax.swing.JMenuItem mnuItmKursSokLarare;
    private javax.swing.JMenuItem mnuItmLarareAndraKursbetyg;
    private javax.swing.JMenu mnuItmLarareBetyg;
    private javax.swing.JMenuItem mnuItmLarareBytLosenord;
    private javax.swing.JMenuItem mnuItmLarareDraAvHuspoang;
    private javax.swing.JMenu mnuItmLarareElevhem;
    private javax.swing.JMenu mnuItmLarareElevinfo;
    private javax.swing.JMenuItem mnuItmLarareNyregElev;
    private javax.swing.JMenuItem mnuItmLarareRedigeraElev;
    private javax.swing.JMenuItem mnuItmLarareRegistreraHuspoang;
    private javax.swing.JMenuItem mnuItmLarareRegistreraKursbetyg;
    private javax.swing.JMenuItem mnuItmListaElever;
    private javax.swing.JMenuItem mnuItmLoggaIn;
    private javax.swing.JMenuItem mnuItmStangAktuelltFonster;
    private javax.swing.JMenuItem mnuItmStangAllaFonster;
    private javax.swing.JMenu mnuLarare;
    private javax.swing.JMenu mnuMeny;
    // End of variables declaration//GEN-END:variables
}

