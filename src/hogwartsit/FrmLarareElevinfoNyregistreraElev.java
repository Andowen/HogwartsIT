/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class FrmLarareElevinfoNyregistreraElev extends javax.swing.JInternalFrame {
    
    private static InfDB idb;
    private String elevID = null;
    private DefaultListModel valdaKurser;
    private javax.swing.JList lstValdaKurser;



    /**
     * Creates new form FrmLarareElevinfoNyregistreraElev
     */
    public FrmLarareElevinfoNyregistreraElev(InfDB idb) {
        valdaKurser = new DefaultListModel();
        initComponents();
        this.idb = idb;
        fyllSovsalsLista();
        fyllKursLista();
        lblElevenRegistrerad.setVisible(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNyRegElev = new javax.swing.JLabel();
        pnlElevInformation = new javax.swing.JTabbedPane();
        pnlNyregistreraElevInfo = new javax.swing.JPanel();
        tfFornamn = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblFyllElevInfo = new javax.swing.JLabel();
        btnSparaGaTillKurs = new javax.swing.JButton();
        lblGenerellElevInfo = new javax.swing.JLabel();
        lblSovsal = new javax.swing.JLabel();
        cbSovsal = new javax.swing.JComboBox<>();
        pnlLaggTillElevKurs = new javax.swing.JPanel();
        lblRedigeraKurs = new javax.swing.JLabel();
        lblAktuellKurs = new javax.swing.JLabel();
        lblLaggTillTaBortKurs = new javax.swing.JLabel();
        btnSlutforRegistrering = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JList<String> lstValdaKurser = new javax.swing.JList(valdaKurser);
        btnLaggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lblElevenRegistrerad = new javax.swing.JLabel();
        cbKursLista = new javax.swing.JComboBox<>();

        lblNyRegElev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNyRegElev.setText("Nyregistrera en elev:");

        pnlNyregistreraElevInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfEfternamn.setColumns(5);

        lblFornamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblFyllElevInfo.setText("Fyll i den generella elevinformationen");

        btnSparaGaTillKurs.setText("Nästa: Lägg till kurser");
        btnSparaGaTillKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaGaTillKursActionPerformed(evt);
            }
        });

        lblGenerellElevInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGenerellElevInfo.setText("Generell elevinfomation");

        lblSovsal.setText("Sovsal:");

        cbSovsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj sovsal" }));

        javax.swing.GroupLayout pnlNyregistreraElevInfoLayout = new javax.swing.GroupLayout(pnlNyregistreraElevInfo);
        pnlNyregistreraElevInfo.setLayout(pnlNyregistreraElevInfoLayout);
        pnlNyregistreraElevInfoLayout.setHorizontalGroup(
            pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                        .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenerellElevInfo)
                            .addComponent(lblFyllElevInfo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                        .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                                .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNyregistreraElevInfoLayout.createSequentialGroup()
                                .addComponent(lblFornamn)
                                .addGap(90, 90, 90)))
                        .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEfternamn)
                            .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSovsal))
                            .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 108, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNyregistreraElevInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSparaGaTillKurs)
                .addContainerGap())
        );
        pnlNyregistreraElevInfoLayout.setVerticalGroup(
            pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNyregistreraElevInfoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblGenerellElevInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFyllElevInfo)
                .addGap(24, 24, 24)
                .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfternamn)
                    .addComponent(lblFornamn)
                    .addComponent(lblSovsal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNyregistreraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btnSparaGaTillKurs)
                .addContainerGap())
        );

        pnlElevInformation.addTab("Generell elevinformation", pnlNyregistreraElevInfo);

        pnlLaggTillElevKurs.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRedigeraKurs.setText("Lägg till kurser för eleven");

        lblAktuellKurs.setText("Aktuellt kursutbud:");

        lblLaggTillTaBortKurs.setText("Valda kurser:");

        btnSlutforRegistrering.setText("Slutför registrering");
        btnSlutforRegistrering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlutforRegistreringActionPerformed(evt);
            }
        });

        lstValdaKurser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstValdaKurser);

        btnLaggTill.setText("Lägg till >");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnTaBort.setText(" < Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        lblElevenRegistrerad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblElevenRegistrerad.setText("Eleven har registrerats!");

        cbKursLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kurs" }));

        javax.swing.GroupLayout pnlLaggTillElevKursLayout = new javax.swing.GroupLayout(pnlLaggTillElevKurs);
        pnlLaggTillElevKurs.setLayout(pnlLaggTillElevKursLayout);
        pnlLaggTillElevKursLayout.setHorizontalGroup(
            pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                        .addComponent(lblElevenRegistrerad, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnSlutforRegistrering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                        .addComponent(lblRedigeraKurs)
                        .addContainerGap())
                    .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                        .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                                .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAktuellKurs)
                                    .addComponent(cbKursLista, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLaggTillElevKursLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLaggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)))
                        .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLaggTillTaBortKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );
        pnlLaggTillElevKursLayout.setVerticalGroup(
            pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblRedigeraKurs)
                .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAktuellKurs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKursLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnLaggTill)
                        .addGap(18, 18, 18)
                        .addComponent(btnTaBort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlLaggTillElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSlutforRegistrering)
                            .addComponent(btnAvbryt)
                            .addComponent(lblElevenRegistrerad)))
                    .addGroup(pnlLaggTillElevKursLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblLaggTillTaBortKurs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlElevInformation.addTab("Elevens kurser", pnlLaggTillElevKurs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlElevInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyRegElev))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNyRegElev)
                .addGap(18, 18, 18)
                .addComponent(pnlElevInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void fyllSovsalsLista() {
            try {
                //Hämtar en lista på elevhemsnamn på alla elevhem i databasen
                ArrayList<HashMap<String, String>> elevhemsLista = idb.fetchRows("SELECT elevhemsnamn, vaning FROM elevhem \n" +
                                            "JOIN sovsal ON elevhem = elevhem_id");
                //Loopar igenom listan och lägger till alla kursnamn till kurslistan i fönstret
                for (int i = 0; i < elevhemsLista.size(); i++) {
                        String elevhemsNamn = elevhemsLista.get(i).get("ELEVHEMSNAMN");
                        String sovsalVaning = elevhemsLista.get(i).get("VANING");
                        String elevhemSovsal = elevhemsNamn + " våning: " + sovsalVaning;
                        cbSovsal.addItem(elevhemSovsal);
                } 
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
            }
            catch (NullPointerException ettAnnatUndantag) {
                ettAnnatUndantag.getMessage();
            }    
    }
        
    private void fyllKursLista() {
        try {
            //Hämtar en lista på kursnamn på alla kurser i databasen
            ArrayList<HashMap<String, String>> kursLista = idb.fetchRows("SELECT kursnamn FROM kurs");
            //Loopar igenom listan och lägger till alla kursnamn till kurslistan i fönstret
            for (int i = 0; i < kursLista.size(); i++) {
                    String kursNamn = kursLista.get(i).get("KURSNAMN");
                    cbKursLista.addItem(kursNamn);
            } 
        }
        catch (InfException ettUndantag) {
            ettUndantag.getMessage();
        }
        catch (NullPointerException ettAnnatUndantag) {
            ettAnnatUndantag.getMessage();
        }    
    }
    
    private void aterstallFalt() {
        tfFornamn.setText("");
        tfEfternamn.setText("");
        cbSovsal.setSelectedIndex(0);
        cbKursLista.setSelectedIndex(0);
        valdaKurser.clear();
        fyllKursLista();
    }
        
     private void setElementRedigerbara(boolean enBoolean) {
         tfFornamn.setEditable(enBoolean);
         tfEfternamn.setEditable(enBoolean);
         cbSovsal.setEnabled(enBoolean);
         cbKursLista.setEnabled(enBoolean);
         btnLaggTill.setEnabled(enBoolean);
         btnTaBort.setEnabled(enBoolean);
         btnSlutforRegistrering.setEnabled(enBoolean); 
         btnSparaGaTillKurs.setEnabled(enBoolean);
     }
        
    private void btnSparaGaTillKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaGaTillKursActionPerformed
        //Kontrollerar att inget fält saknar värde
        if (Validering.textfaltHarVarde(tfFornamn) && Validering.textfaltHarVarde(tfEfternamn) && Validering.elementHarValtsICombobox(cbSovsal, "Välj en sovsal")) {
            //Flyttar fokus till fliken "Elevens kurser"
            pnlElevInformation.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnSparaGaTillKursActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        //Internt metodanrop som återställer alla fält, så ny input kan läggas in
        aterstallFalt();
        //Flyttar fokus till fliken "Genereall elevinformation"
        pnlElevInformation.setSelectedIndex(0);
        //Gör alla element redigerbara
        setElementRedigerbara(true);
        
        
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnSlutforRegistreringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlutforRegistreringActionPerformed
        //Kontrollerar att användasren har fyllt i alla fält
        if (Validering.textfaltHarVarde(tfFornamn) && Validering.textfaltHarVarde(tfEfternamn) && Validering.elementHarValtsICombobox(cbSovsal, "Välj en sovsal") && Validering.listaHarVarde(valdaKurser, lstValdaKurser, "Lägg till minst en kurs")) {
            //Lokala variabler somtilldelas innehållet av textfälten.
            String fornamn = tfFornamn.getText();
            String efternamn = tfEfternamn.getText();
            //En array av strängar som består av delar av det valda objektet i sovsalslistan.
            String[] sovsalElevhem = cbSovsal.getSelectedItem().toString().trim().split("\\s+");
            //Lokala variabler som ges värden av två av strängarna i arrayen, den tredje strängen används ej.
            String elevhem = sovsalElevhem[0];
            String sovsalVaning = sovsalElevhem[2];
            
            try {
            //Hämtar id från den valda sovsalen
            String sovsalID = idb.fetchSingle("SELECT sovsal_id FROM sovsal \n" +
                "JOIN elevhem ON sovsal.elevhem = elevhem.elevhem_id \n" +
                "WHERE elevhemsnamn = \'" + elevhem + "\' AND vaning = " + sovsalVaning);

            //Hämtar ett nytt oanvänt elevID
            elevID = idb.getAutoIncrement("elev", "elev_id");

            //Lägger till eleven i elevtabellen med de valda värdena
            idb.insert("INSERT INTO elev (elev_id, fornamn, efternamn, sovsal) \n" +
                "VALUES (" + elevID + ", \'" + fornamn + "\', \'" + efternamn + "\', " + sovsalID + ")");

            for(int i = 0; i< valdaKurser.getSize(); i++){
            String kursNamn = valdaKurser.getElementAt(i).toString();

                try {
                    String kursID = idb.fetchSingle("SELECT kurs_id FROM kurs WHERE kursnamn = \'" + kursNamn + "\'");
                    idb.insert("INSERT INTO registrerad_pa(elev_id, kurs_id) \n" +
                        "VALUES (" + elevID + ", " + kursID + ")");

                    //Visar ett litet meddelande för användaren
                    lblElevenRegistrerad.setVisible(true);
                    //Ändrar texten på knappen avbryt
                    btnAvbryt.setText("Registrera ny elev");
                    //Gör så elementen inte längre går att redigera
                    setElementRedigerbara(false);


                }
                catch (InfException ettUndantag) {
                    ettUndantag.getMessage();
                }
                catch (NullPointerException ettAnnatUndantag) {
                    ettAnnatUndantag.getMessage();
                }  
            }      
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            }    
            catch (NullPointerException ettAnnatUndantag) {
                ettAnnatUndantag.getMessage();
            }  
        }
    }//GEN-LAST:event_btnSlutforRegistreringActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        if (Validering.elementHarValtsICombobox(cbKursLista, "Välj en kurs!")) {
            String kursNamn = cbKursLista.getSelectedItem().toString();
            if (!valdaKurser.contains(kursNamn)) {
                valdaKurser.addElement(kursNamn); 
           }                  
        }    
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        if (Validering.elementHarValtsICombobox(cbKursLista, "Välj en kurs!")) {
            String kursNamn = cbKursLista.getSelectedItem().toString();
            if (valdaKurser.contains(kursNamn)) {
                valdaKurser.removeElement(kursNamn);
           }
        }
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnSlutforRegistrering;
    private javax.swing.JButton btnSparaGaTillKurs;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JComboBox<String> cbKursLista;
    private javax.swing.JComboBox<String> cbSovsal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAktuellKurs;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblElevenRegistrerad;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblFyllElevInfo;
    private javax.swing.JLabel lblGenerellElevInfo;
    private javax.swing.JLabel lblLaggTillTaBortKurs;
    private javax.swing.JLabel lblNyRegElev;
    private javax.swing.JLabel lblRedigeraKurs;
    private javax.swing.JLabel lblSovsal;
    private javax.swing.JTabbedPane pnlElevInformation;
    private javax.swing.JPanel pnlLaggTillElevKurs;
    private javax.swing.JPanel pnlNyregistreraElevInfo;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    // End of variables declaration//GEN-END:variables
}
