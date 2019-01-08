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
    private ClosableTabbedPane paneHuvudfonsterFlikar;
    private FrmLoggaIn frmLoggaIn;
    private FrmElevElevhemLista frmElevElevhemslista;
    private FrmElevElevhemsPokal frmElevElevhemsPokal;
    private FrmElevHittaPrefekt frmElevHittaPrefekt;
    private FrmElevKursSokElev frmElevKurser;
    private FrmElevKursSokLarare frmElevLarare;
    private FrmElevSokBetyg frmElevBetyg;
    private FrmLarareAndraKursbetyg frmLarareAndraKursbetyg;
    private FrmLarareBytLosenord frmLarareBytLosenord;
    private FrmLarareDraAvHuspoang frmLarareDraAvHuspoang;
    private FrmLarareElevinfoNyregistreraElev frmLarareNyregElev;
    private FrmLarareRedigeraElev frmLarareRedigeraElev;
    private FrmLarareRegistreraHuspoang frmLarareRegistreraHuspoang;
    private FrmLarareRegistreraKursbetyg frmLarareRegistreraKursbetyg;
<<<<<<< HEAD
    private FrmAdminGeLarareAdminStatus frmAdminGeLarareAdminStatus;
=======
    private FrmAdminNyregistreraKurs frmAdminNyregistreraKurs;
    private FrmAdminNyregistreraLarare frmAdminNyregistreraLarare;
    private FrmAdminRedigeraElevhem frmAdminRedigeraElevhem;
    private FrmAdminRedigeraKurs frmAdminRedigeraKurs;
    private FrmAdminRedigeraLarare frmAdminRedigeraLarare;
    private FrmAdminTaBortElev frmAdminTaBortElev;
    private FrmAdminTaBortKurs frmAdminTaBortKurs;
    private FrmAdminTaBortLarare frmAdminTaBortLarare;
    
>>>>>>> d42e2135c19372bd7ad2419dcf8b3d4c78b58298
    
    /**
     * Creates new form TestFönster
     */
    public HuvudFonster(InfDB idb) {
        initComponents();
        this.setSize(800, 600);
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

        jMenu2 = new javax.swing.JMenu();
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
        mnuItmLarareBetyg = new javax.swing.JMenu();
        mnuItmLarareRegistreraKursbetyg = new javax.swing.JMenuItem();
        mnuItmLarareAndraKursbetyg = new javax.swing.JMenuItem();
        mnuItmLarareElevhem = new javax.swing.JMenu();
        mnuItmLarareRegistreraHuspoang = new javax.swing.JMenuItem();
        mnuItmLarareDraAvHuspoang = new javax.swing.JMenuItem();
        mnuItmLarareBytLosenord = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
<<<<<<< HEAD
        mnuItmAdminGeAdminStatus = new javax.swing.JMenuItem();
=======
        jMenu1 = new javax.swing.JMenu();
        mnuItmNyregLarare = new javax.swing.JMenuItem();
        mnuItmTaBortLarare = new javax.swing.JMenuItem();
        mnuItmRedigeraLarare = new javax.swing.JMenuItem();
        mnuItemGorAdmin = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuItmRedigeraElevhem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuItmTaBortElev = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuItmTaBortKurs = new javax.swing.JMenuItem();
        mnuItmRedigeraKurs = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");
>>>>>>> d42e2135c19372bd7ad2419dcf8b3d4c78b58298

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
        mnuItmLarareRedigeraElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareRedigeraElevActionPerformed(evt);
            }
        });
        mnuItmLarareElevinfo.add(mnuItmLarareRedigeraElev);

        mnuLarare.add(mnuItmLarareElevinfo);
        mnuItmLarareElevinfo.getAccessibleContext().setAccessibleDescription("");

        mnuItmLarareBetyg.setText("Kursbetyg");

        mnuItmLarareRegistreraKursbetyg.setText("Registrera kursbetyg");
        mnuItmLarareRegistreraKursbetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareRegistreraKursbetygActionPerformed(evt);
            }
        });
        mnuItmLarareBetyg.add(mnuItmLarareRegistreraKursbetyg);

        mnuItmLarareAndraKursbetyg.setText("Ändra kursbetyg");
        mnuItmLarareAndraKursbetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareAndraKursbetygActionPerformed(evt);
            }
        });
        mnuItmLarareBetyg.add(mnuItmLarareAndraKursbetyg);

        mnuLarare.add(mnuItmLarareBetyg);

        mnuItmLarareElevhem.setText("Elevhemspoäng");

        mnuItmLarareRegistreraHuspoang.setText("Registrera huspoäng");
        mnuItmLarareRegistreraHuspoang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareRegistreraHuspoangActionPerformed(evt);
            }
        });
        mnuItmLarareElevhem.add(mnuItmLarareRegistreraHuspoang);

        mnuItmLarareDraAvHuspoang.setText("Dra av huspoäng");
        mnuItmLarareDraAvHuspoang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareDraAvHuspoangActionPerformed(evt);
            }
        });
        mnuItmLarareElevhem.add(mnuItmLarareDraAvHuspoang);

        mnuLarare.add(mnuItmLarareElevhem);

        mnuItmLarareBytLosenord.setText("Byt lösenord");
        mnuItmLarareBytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmLarareBytLosenordActionPerformed(evt);
            }
        });
        mnuLarare.add(mnuItmLarareBytLosenord);

        mnuHuvudMeny.add(mnuLarare);

        mnuAdmin.setText("Administratör");
        mnuAdmin.setEnabled(false);

<<<<<<< HEAD
        mnuItmAdminGeAdminStatus.setText("Administratörsstatus");
        mnuItmAdminGeAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmAdminGeAdminStatusActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuItmAdminGeAdminStatus);
=======
        jMenu1.setText("Lärare");

        mnuItmNyregLarare.setText("Nyregistrera Lärare");
        mnuItmNyregLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmNyregLarareActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItmNyregLarare);

        mnuItmTaBortLarare.setText("Ta bort Lärare");
        mnuItmTaBortLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmTaBortLarareActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItmTaBortLarare);

        mnuItmRedigeraLarare.setText("Redigera Larare");
        mnuItmRedigeraLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmRedigeraLarareActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItmRedigeraLarare);

        mnuItemGorAdmin.setText("Gör admin");
        jMenu1.add(mnuItemGorAdmin);

        mnuAdmin.add(jMenu1);

        jMenu3.setText("Elevhem");

        mnuItmRedigeraElevhem.setText("Redigera Elevhem");
        mnuItmRedigeraElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmRedigeraElevhemActionPerformed(evt);
            }
        });
        jMenu3.add(mnuItmRedigeraElevhem);

        mnuAdmin.add(jMenu3);

        jMenu4.setText("Elev");

        mnuItmTaBortElev.setText("Ta bort Elev");
        mnuItmTaBortElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmTaBortElevActionPerformed(evt);
            }
        });
        jMenu4.add(mnuItmTaBortElev);

        mnuAdmin.add(jMenu4);

        jMenu5.setText("Kurs");

        mnuItmTaBortKurs.setText("Ta bort Kurs");
        mnuItmTaBortKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmTaBortKursActionPerformed(evt);
            }
        });
        jMenu5.add(mnuItmTaBortKurs);

        mnuItmRedigeraKurs.setText("Redigera Kurs");
        mnuItmRedigeraKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmRedigeraKursActionPerformed(evt);
            }
        });
        jMenu5.add(mnuItmRedigeraKurs);

        mnuAdmin.add(jMenu5);
>>>>>>> d42e2135c19372bd7ad2419dcf8b3d4c78b58298

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
        //Lokal variabel som håller antalet flikar i huvudfönstret
        int tabCount = paneHuvudfonsterFlikar.getTabCount();
        //Loopar igenom alla flikar
        for (int i=0; i < tabCount; i++) {
            //Hämtar titeln på fliken för varje iteration
            String tabTitle = paneHuvudfonsterFlikar.getTitleAt(i);
            //Kontrollerar om inparamatern fliktitel matchar titeln på fliken som itereras
            if (tabTitle.equals(flikTitel)){ 
                //Om match hittas flyttas fokus till fliken
                paneHuvudfonsterFlikar.setSelectedIndex(i);
            }
        }
    }
    
    private boolean flikFinns(String flikTitel) {
        //Lokal variabel som returneras i metoden
        boolean flikFinns = false;
        //Lokal variabel som hämtar antalet flikar i fönstret
        int tabCount = paneHuvudfonsterFlikar.getTabCount();
        //Loopar igenom alla flikar
        for (int i=0; i < tabCount; i++) {
            //Hämtar titeln på fliken för varje iteration
            String tabTitle = paneHuvudfonsterFlikar.getTitleAt(i);
            //Kontrollerar om inparamatern fliktitel matchar titeln på fliken som itereras
            if (tabTitle.equals(flikTitel)){ 
                //Om match hittas ändras "flikFinns2 till true
                flikFinns = true;
            }
        }
        //Returnerar värdet på "flikFinns"
        return flikFinns;
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
        if(!flikFinns("Sök betyg")) {
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
        if(!flikFinns("Elevhemslista")) {
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
        if(!flikFinns("Ställning elevhemspokalen")) {
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
        if(!flikFinns("Hitta prefekt")) {
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
        if(!flikFinns("Sök kurs för elev")) {
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
        if(!flikFinns("Sök lärare för kurs")) {
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
        if(!flikFinns("Nyregistrera en elev")) {
            frmLarareNyregElev = new FrmLarareElevinfoNyregistreraElev(idb);
            oppnaFlik(frmLarareNyregElev, "Nyregistrera en elev");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Nyregistrera en elev");
        }
    }//GEN-LAST:event_mnuItmLarareNyregElevActionPerformed

    private void mnuItmLarareRedigeraElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareRedigeraElevActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.             
        if(!flikFinns("Redigera en elev")) {
            frmLarareRedigeraElev = new FrmLarareRedigeraElev(idb);
            oppnaFlik(frmLarareRedigeraElev, "Redigera en elev");
        }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Redigera en elev");
        }
    }//GEN-LAST:event_mnuItmLarareRedigeraElevActionPerformed

    private void mnuItmLarareRegistreraKursbetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareRegistreraKursbetygActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Registrera kursbetyg")) {
            frmLarareRegistreraKursbetyg = new FrmLarareRegistreraKursbetyg(idb);
            oppnaFlik(frmLarareRegistreraKursbetyg, "Registrera kursbetyg");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Registrera kursbetyg");
        }
    }//GEN-LAST:event_mnuItmLarareRegistreraKursbetygActionPerformed

    private void mnuItmLarareAndraKursbetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareAndraKursbetygActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Ändra kursbetyg")) {
            frmLarareAndraKursbetyg = new FrmLarareAndraKursbetyg(idb);
            oppnaFlik(frmLarareAndraKursbetyg, "Ändra kursbetyg");
        }         
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Ändra kursbetyg");
        }
    }//GEN-LAST:event_mnuItmLarareAndraKursbetygActionPerformed

    private void mnuItmLarareRegistreraHuspoangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareRegistreraHuspoangActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Registrera huspoäng")) {
            frmLarareRegistreraHuspoang = new FrmLarareRegistreraHuspoang(idb);
            oppnaFlik(frmLarareRegistreraHuspoang, "Registrera huspoäng");
        }  
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Registrera huspoäng");
        }
    }//GEN-LAST:event_mnuItmLarareRegistreraHuspoangActionPerformed

    private void mnuItmLarareDraAvHuspoangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareDraAvHuspoangActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Dra av huspoäng")) {
            frmLarareDraAvHuspoang = new FrmLarareDraAvHuspoang(idb);
            oppnaFlik(frmLarareDraAvHuspoang, "Dra av huspoäng");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Dra av huspoäng");
        }
    }//GEN-LAST:event_mnuItmLarareDraAvHuspoangActionPerformed

    private void mnuItmLarareBytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLarareBytLosenordActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Lösenordsbyte")) {
            frmLarareBytLosenord = new FrmLarareBytLosenord(idb);
            oppnaFlik(frmLarareBytLosenord, "Lösenordsbyte");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Lösenordsbyte");
        }
    }//GEN-LAST:event_mnuItmLarareBytLosenordActionPerformed

<<<<<<< HEAD
    private void mnuItmAdminGeAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmAdminGeAdminStatusActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(frmAdminGeLarareAdminStatus == null || !frmAdminGeLarareAdminStatus.isEnabled()) {
           frmAdminGeLarareAdminStatus = new FrmAdminGeLarareAdminStatus(idb);
            oppnaFlik(frmAdminGeLarareAdminStatus, "Administratörsstatus");
            }
        
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Administratörsstatus");
        }
    }//GEN-LAST:event_mnuItmAdminGeAdminStatusActionPerformed
=======
    private void mnuItmNyregLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmNyregLarareActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Nyregistrera lärare")) {
            frmAdminNyregistreraLarare = new FrmAdminNyregistreraLarare(idb);
            oppnaFlik(frmAdminNyregistreraLarare, "Nyregistrera lärare");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Nyregistrera lärare");
        }
    }//GEN-LAST:event_mnuItmNyregLarareActionPerformed

    private void mnuItmTaBortLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTaBortLarareActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Ta bort lärare")) {
            frmAdminTaBortLarare = new FrmAdminTaBortLarare(idb);
            oppnaFlik(frmAdminTaBortLarare, "Ta bort lärare");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Ta bort lärare");
        }
    }//GEN-LAST:event_mnuItmTaBortLarareActionPerformed

    private void mnuItmRedigeraLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmRedigeraLarareActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Redigera lärare")) {
            frmAdminRedigeraLarare = new FrmAdminRedigeraLarare(idb);
            oppnaFlik(frmAdminRedigeraLarare, "Redigera lärare");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Redigera lärare");
        }
    }//GEN-LAST:event_mnuItmRedigeraLarareActionPerformed

    private void mnuItmRedigeraElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmRedigeraElevhemActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Redigera elevhem")) {
            frmAdminRedigeraElevhem = new FrmAdminRedigeraElevhem(idb);
            oppnaFlik(frmAdminRedigeraElevhem, "Redigera elevhem");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Redigera elevhem");
        }
    }//GEN-LAST:event_mnuItmRedigeraElevhemActionPerformed

    private void mnuItmTaBortElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTaBortElevActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Ta bort elev")) {
            frmAdminTaBortElev = new FrmAdminTaBortElev(idb);
            oppnaFlik(frmAdminTaBortElev, "Ta bort elev");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Ta bort elev");
        }
    }//GEN-LAST:event_mnuItmTaBortElevActionPerformed

    private void mnuItmTaBortKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTaBortKursActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Ta bort kurs")) {
            frmAdminTaBortKurs = new FrmAdminTaBortKurs(idb);
            oppnaFlik(frmAdminTaBortKurs, "Ta bort kurs");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Ta bort kurs");
        }
    }//GEN-LAST:event_mnuItmTaBortKursActionPerformed

    private void mnuItmRedigeraKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmRedigeraKursActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!flikFinns("Redigera kurs")) {
            frmAdminRedigeraKurs = new FrmAdminRedigeraKurs(idb);
            oppnaFlik(frmAdminRedigeraKurs, "Redigera kurs");
        } 
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            flyttaFokusTillFlik("Redigera kurs");
        }
    }//GEN-LAST:event_mnuItmRedigeraKursActionPerformed
>>>>>>> d42e2135c19372bd7ad2419dcf8b3d4c78b58298



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuElev;
    private javax.swing.JMenuBar mnuHuvudMeny;
<<<<<<< HEAD
    private javax.swing.JMenuItem mnuItmAdminGeAdminStatus;
=======
    private javax.swing.JMenuItem mnuItemGorAdmin;
>>>>>>> d42e2135c19372bd7ad2419dcf8b3d4c78b58298
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
    private javax.swing.JMenuItem mnuItmNyregLarare;
    private javax.swing.JMenuItem mnuItmRedigeraElevhem;
    private javax.swing.JMenuItem mnuItmRedigeraKurs;
    private javax.swing.JMenuItem mnuItmRedigeraLarare;
    private javax.swing.JMenuItem mnuItmStangAktuelltFonster;
    private javax.swing.JMenuItem mnuItmStangAllaFonster;
    private javax.swing.JMenuItem mnuItmTaBortElev;
    private javax.swing.JMenuItem mnuItmTaBortKurs;
    private javax.swing.JMenuItem mnuItmTaBortLarare;
    private javax.swing.JMenu mnuLarare;
    private javax.swing.JMenu mnuMeny;
    // End of variables declaration//GEN-END:variables
}

