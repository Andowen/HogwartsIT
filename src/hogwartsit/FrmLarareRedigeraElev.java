/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andow
 */
public class FrmLarareRedigeraElev extends javax.swing.JInternalFrame {

    private static InfDB idb;
    //Fält för att spara elevID för den aktuella eleven
    private String elevID = null;
    private String forNamn;
    private String efterNamn;
    private MetodService metodService;
    /**
     * Creates new form FrmLarareRedigeraElev
     */
    public FrmLarareRedigeraElev(InfDB idb) {
        initComponents();
        this.idb = idb;
        metodService = new MetodService(idb);
        //Döljer panelen för ändringar
        pnlElevInformation.setVisible(false);
        //Fyller listor för kurser och sovsalar
        metodService.fyllComboboxKurserLarare(cbKursLista);
        fyllSovsalsLista();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSokElev = new javax.swing.JLabel();
        tfNamnFalt = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        pnlElevInformation = new javax.swing.JTabbedPane();
        pnlAndraElevInfo = new javax.swing.JPanel();
        tfFornamn = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblGorAndringar = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        btnSparaAndring = new javax.swing.JButton();
        lblGenerellElevInfo = new javax.swing.JLabel();
        lblSovsal = new javax.swing.JLabel();
        cbSovsal = new javax.swing.JComboBox<>();
        lblAndringarSparats = new javax.swing.JLabel();
        pnlAndraElevKurs = new javax.swing.JPanel();
        lblElevKurs = new javax.swing.JLabel();
        lblRedigeraKurs = new javax.swing.JLabel();
        lblAktuellKurs = new javax.swing.JLabel();
        btnTaBortKurs = new javax.swing.JButton();
        spAktuellKurs = new javax.swing.JScrollPane();
        taAktuellKurs = new javax.swing.JTextArea();
        lblLaggTillTaBortKurs = new javax.swing.JLabel();
        btnLaggTillKurs = new javax.swing.JButton();
        cbKursLista = new javax.swing.JComboBox<>();

        lblSokElev.setText("Sök elev att redigera:");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        pnlAndraElevInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfEfternamn.setColumns(5);

        lblFornamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblGorAndringar.setText("Gör ändringar direkt i fälten nedan.");

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        btnSparaAndring.setText("Spara ändringar");
        btnSparaAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaAndringActionPerformed(evt);
            }
        });

        lblGenerellElevInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGenerellElevInfo.setText("Generell elevinfomation");

        lblSovsal.setText("Sovsal:");

        cbSovsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en sovsal" }));

        lblAndringarSparats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAndringarSparats.setText("Ändringarna har sparats!");

        javax.swing.GroupLayout pnlAndraElevInfoLayout = new javax.swing.GroupLayout(pnlAndraElevInfo);
        pnlAndraElevInfo.setLayout(pnlAndraElevInfoLayout);
        pnlAndraElevInfoLayout.setHorizontalGroup(
            pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAndraElevInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSparaAndring)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvbryt)
                .addContainerGap())
            .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                        .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenerellElevInfo)
                            .addComponent(lblGorAndringar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                        .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                                        .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAndraElevInfoLayout.createSequentialGroup()
                                        .addComponent(lblFornamn)
                                        .addGap(90, 90, 90)))
                                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEfternamn)
                                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblSovsal))
                                    .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblAndringarSparats, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 108, Short.MAX_VALUE))))
        );
        pnlAndraElevInfoLayout.setVerticalGroup(
            pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAndraElevInfoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblGenerellElevInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGorAndringar)
                .addGap(24, 24, 24)
                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfternamn)
                    .addComponent(lblFornamn)
                    .addComponent(lblSovsal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblAndringarSparats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(pnlAndraElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvbryt)
                    .addComponent(btnSparaAndring))
                .addContainerGap())
        );

        pnlElevInformation.addTab("Generell elevinformation", pnlAndraElevInfo);

        pnlAndraElevKurs.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblElevKurs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblElevKurs.setText("Elevens kurser");

        lblRedigeraKurs.setText("Redigera kurser eleven är registrerad på");

        lblAktuellKurs.setText("Aktuella kurser:");

        btnTaBortKurs.setText("Ta bort kurs");
        btnTaBortKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortKursActionPerformed(evt);
            }
        });

        taAktuellKurs.setEditable(false);
        taAktuellKurs.setColumns(20);
        taAktuellKurs.setRows(5);
        spAktuellKurs.setViewportView(taAktuellKurs);

        lblLaggTillTaBortKurs.setText("Lägg till eller ta bort kurs:");

        btnLaggTillKurs.setText("Lägg till kurs");
        btnLaggTillKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillKursActionPerformed(evt);
            }
        });

        cbKursLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en kurs" }));

        javax.swing.GroupLayout pnlAndraElevKursLayout = new javax.swing.GroupLayout(pnlAndraElevKurs);
        pnlAndraElevKurs.setLayout(pnlAndraElevKursLayout);
        pnlAndraElevKursLayout.setHorizontalGroup(
            pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAndraElevKursLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElevKurs)
                    .addComponent(lblRedigeraKurs)
                    .addGroup(pnlAndraElevKursLayout.createSequentialGroup()
                        .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAktuellKurs)
                            .addComponent(spAktuellKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLaggTillTaBortKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbKursLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAndraElevKursLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLaggTillKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortKurs)
                .addContainerGap())
        );
        pnlAndraElevKursLayout.setVerticalGroup(
            pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAndraElevKursLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblElevKurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRedigeraKurs)
                .addGap(24, 24, 24)
                .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAktuellKurs)
                    .addComponent(lblLaggTillTaBortKurs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spAktuellKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKursLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnlAndraElevKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortKurs)
                    .addComponent(btnLaggTillKurs))
                .addContainerGap())
        );

        pnlElevInformation.addTab("Elevens kurser", pnlAndraElevKurs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSokElev)
                            .addComponent(pnlElevInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNamnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnSok))
                    .addComponent(pnlElevInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSokElev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNamnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addGap(26, 26, 26)
                .addComponent(pnlElevInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllElevInfo() {
        try {
            //Hämtar elevID, förnman, efternamn och sovsal från elevtabellen i databsen
            HashMap<String, String> elevInfo = idb.fetchRow("SELECT elev_id, fornamn, efternamn, elevhemsnamn, vaning FROM elev \n" +
                                        "JOIN sovsal ON sovsal = sovsal_ID \n" +
                                        "JOIN elevhem ON elevhem = elevhem_ID \n" +
                                        "WHERE fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'");
            
            //Fyller i de hämtade värdena i textrutorna för elevinfomation
            tfFornamn.setText(elevInfo.get("FORNAMN"));
            tfEfternamn.setText(elevInfo.get("EFTERNAMN"));
            //Lokala variabler som slås samman till ett objekt, för att välja rätt objekt i sovsalslistan
            String elevhemVaning = elevInfo.get("ELEVHEMSNAMN") + " plan: " + elevInfo.get("VANING");
            Object aktuellSovsal = elevhemVaning;
//            for (int i = 0; i < cbSovsal.getItemCount(); i++) {
//                
//            }
            cbSovsal.getModel().setSelectedItem(aktuellSovsal);
            
            
            //Ger fältet elevID ett värde
            elevID = elevInfo.get("ELEV_ID"); 

        }
        catch (InfException ettUndantag) {
            ettUndantag.getMessage();
        }
        catch (NullPointerException ettAnnatUndantag) {
            ettAnnatUndantag.getMessage();
            JOptionPane.showMessageDialog(null, "Det finns ingen elev med det namnet.");
        }
                    
    }
    
    
    private void fyllAktuellaKurser() {
        try {   
            //Hämtar kursnamn på de kurser eleven är registrerad på
            ArrayList<HashMap<String, String>> kurser = idb.fetchRows("SELECT kursnamn FROM kurs \n" + 
                                        "JOIN registrerad_pa ON kurs.kurs_id = registrerad_pa.kurs_id \n" +
                                        "JOIN elev ON elev.elev_ID = registrerad_pa.elev_id \n" +
                                        "WHERE fornamn = \'" + forNamn + "\'AND efternamn = \'" + efterNamn + "\'");
            
            //Tömmer textrutan på eventuellt tidigare värden
            taAktuellKurs.setText("");
            //Loopar igenom ArrayListen och hämtar värdet för kursnamnet för varje kurs eleven är registrerad på.
                for (int i = 0; i < kurser.size(); i++) {
                    String kursNamn = kurser.get(i).get("KURSNAMN");
                    //Kontrollerar att variabeln kursnamn inte är null.
                    if (kursNamn != null) {
                    //Lägger till kursnamnen i textrutan.
                        taAktuellKurs.append(kursNamn + "\n");
                    }
                    else {
                        taAktuellKurs.setText("Det finns inga \n kurser att visa");
                    }
                }
        }
        catch(InfException ettUndantag) {
                ettUndantag.getMessage();
        }
        catch (NullPointerException ettAnnatUndantag) {
            ettAnnatUndantag.getMessage();
        }
    }
    
    private void fyllSovsalsLista() {
        try {
            //Hämtar en lista på elevhemsnamn på alla elevhem i databasen
            ArrayList<HashMap<String, String>> elevhemsLista = idb.fetchRows("SELECT elevhemsnamn, vaning FROM elevhem \n" +
                                        "JOIN sovsal ON elevhem = elevhem_id");
            //Loopar igenom listan och lägger till alla kursnamn till kurslistan i fönstret
            for (int i = 0; i < elevhemsLista.size(); i++) {
                    String elevhemsNamn = elevhemsLista.get(i).get("ELEVHEMSNAMN");
                    String sovsalVaning = elevhemsLista.get(i).get("VANING");
                    String elevhemSovsal = elevhemsNamn + " plan: " + sovsalVaning;
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
    
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        //Huvudmetoden för fönstret som fyller i all elev- och kursinformation för enklare redigering
        //Kontrollerar att namnfältet inte är tomt.
        if (Validering.textfaltHarVarde(tfNamnFalt)) {
            
            //Delar strängen som användaren skickar in i namnfältet i för- och efternamn.
            String[] elevNamnet = tfNamnFalt.getText().trim().split("\\s+");
            forNamn = elevNamnet[0];
            efterNamn = elevNamnet[1];
            //Interna metodanrop för att fylla i elementen i fönstret
            fyllElevInfo();
            fyllAktuellaKurser();
            lblAndringarSparats.setVisible(false);
            
            //Kontrollerar att elevID inte är null
            if (elevID !=null) {
                //Visar panelen för ändringar, som nu har förifyllda värden med den nuvarande sparade datan.
                pnlElevInformation.setVisible(true);
                } 
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        //Fyller tillbaka värdena i elevinfo-fliken som är sparade för eleven i databasen 
        fyllElevInfo();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnSparaAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaAndringActionPerformed
        //Kontrollerar att inget textfält saknar värde
        if (Validering.textfaltHarVarde(tfFornamn) && Validering.textfaltHarVarde(tfEfternamn)) {
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
                //Uppdaterar eleven i elevtabellen med de valda värdena
                idb.update("UPDATE elev\n" + 
                        "SET FORNAMN = \'" + fornamn + "\', EFTERNAMN = \'" + efternamn + "\', SOVSAL = " + sovsalID + "\n" +
                        "WHERE elev_id = " + elevID);
                lblAndringarSparats.setVisible(true);
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Något gick fel.");
            }
        }
    }//GEN-LAST:event_btnSparaAndringActionPerformed

    private void btnTaBortKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortKursActionPerformed
        if (Validering.elementHarValtsICombobox(cbKursLista, "Välj en kurs")) {
            //Hämtar vilken kurs som valts i listan
            String kursNamn = cbKursLista.getSelectedItem().toString();
             try {
                 //Hämtar kursID på den valda kursen
                 String kursID = idb.fetchSingle("SELECT kurs_id FROM kurs WHERE kursnamn = \'" + kursNamn + "\'");            
                 //Tar bort kursID och elevID från tabelled "Registrerad_pa" i databasen
                 idb.delete("DELETE FROM registrerad_pa WHERE elev_id = \'" + elevID + "\' AND kurs_id = \'" + kursID + "\'");
                 //Tömmer listan på aktuella kurser
                 taAktuellKurs.setText("");
                 //Fyller listan igen med nuvaranade värden för att spegla ändringar
                 fyllAktuellaKurser();
             }
             catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Kan ej ta bort, eleven är inte registrerad på den kursen");
            }
        }
    }//GEN-LAST:event_btnTaBortKursActionPerformed

    private void btnLaggTillKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillKursActionPerformed
        if (Validering.elementHarValtsICombobox(cbKursLista, "Välj en kurs")) {
            //Hämtar vilken kurs som valts i listan
            String kursNamn = cbKursLista.getSelectedItem().toString();
            try {
                //Hämtar kursID på den vslda kursen
                String kursID = idb.fetchSingle("SELECT kurs_id FROM kurs WHERE kursnamn = \'" + kursNamn + "\'");            
                //Lägger till kursID och elevID i "Registrerad_pa"-tabellen
                idb.insert("INSERT INTO registrerad_pa(elev_id, kurs_id) \n" +
                     "VALUES (" + elevID +", " + kursID + ")");
                //Tömmer listan på aktuella kurser
                taAktuellKurs.setText("");
                //Fyller listan igen med nuvaranade värden för att spegla ändringar
                fyllAktuellaKurser();
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Kan ej lägga till, eleven är redan registrerad på kursen");
            }  
        }
    }//GEN-LAST:event_btnLaggTillKursActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaggTillKurs;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnSparaAndring;
    private javax.swing.JButton btnTaBortKurs;
    private javax.swing.JComboBox<String> cbKursLista;
    private javax.swing.JComboBox<String> cbSovsal;
    private javax.swing.JLabel lblAktuellKurs;
    private javax.swing.JLabel lblAndringarSparats;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblElevKurs;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblGenerellElevInfo;
    private javax.swing.JLabel lblGorAndringar;
    private javax.swing.JLabel lblLaggTillTaBortKurs;
    private javax.swing.JLabel lblRedigeraKurs;
    private javax.swing.JLabel lblSokElev;
    private javax.swing.JLabel lblSovsal;
    private javax.swing.JPanel pnlAndraElevInfo;
    private javax.swing.JPanel pnlAndraElevKurs;
    private javax.swing.JTabbedPane pnlElevInformation;
    private javax.swing.JScrollPane spAktuellKurs;
    private javax.swing.JTextArea taAktuellKurs;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    private javax.swing.JTextField tfNamnFalt;
    // End of variables declaration//GEN-END:variables
}
