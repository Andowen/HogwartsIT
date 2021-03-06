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
 * @author Anna Svensson och Ellinor Danielsson
 */
public class FrmElevSokBetyg extends javax.swing.JInternalFrame {
    
    private static InfDB idb;
    
    /**
     * Creates new form FrmBetyg
     */
    public FrmElevSokBetyg(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfElev = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taElevensKursbetyg = new javax.swing.JTextArea();

        jLabel1.setText("Ange elev för att få fram hans/hennes kursbetyg.");

        jLabel2.setText("Elev:");

        tfElev.setColumns(10);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        taElevensKursbetyg.setColumns(20);
        taElevensKursbetyg.setRows(5);
        jScrollPane1.setViewportView(taElevensKursbetyg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnSok)
                            .addComponent(tfElev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfElev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnSok))
                    .addComponent(jScrollPane1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        try{
            //Kontrollerar att textfältet inte är tomt.
            if(Validering.textfaltHarVarde(tfElev)){
                // Hämtar texten i textfältet Elev, splittar strängen vid mellanslag och skapar en array av strängar.
                String[] elevNamnet = tfElev.getText().trim().split("\\s+");
                String forNamn = elevNamnet[0];
                String efterNamn = elevNamnet[1];
                // Hämtar elevens elev ID.
                String id = "SELECT elev_id FROM elev WHERE fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'";
                String elevID = idb.fetchSingle(id); 
                int idNr = Integer.parseInt(elevID); //Gör om IDnr till int.
                //Hämtar kursbetyg och kursnamn.
                ArrayList<HashMap<String, String>> resultat = idb.fetchRows("SELECT kursbetyg, kursnamn FROM har_betyg_i, kurs WHERE har_betyg_i.kurs_id = kurs.kurs_id and elev_id =" + idNr);
                //Kontrollerar att resultatet inte är null.
                if(resultat != null){
                    //Loopar genom ArrayListen och hämtar kursnamnen och kursbetygen i ArrayListens HashMap.
                    for(int i = 0; i < resultat.size(); i++) {
                        String betyg = resultat.get(i).get("KURSBETYG");
                        String kurs = resultat.get(i).get("KURSNAMN");
                        //Kontrollerar att de inte är null.
                        if(kurs!= null && betyg != null){
                            //Lägger till kursens namn och elevens betyg i rextrutan.
                            taElevensKursbetyg.append(kurs + " " + betyg + "\n");
                        }
                    else{
                            //Felmeddelande om eleven inte har några betyg än.
                            JOptionPane.showMessageDialog(null, "Eleven har inga betyg än.");
                        }
                    }
                }  
                else{
                    //Felmeddelande om det inte finns någon elev med namnet som användaren har skrivit in.
                    JOptionPane.showMessageDialog(null, "Det finns ingen elev med det namnet.");
                }
            } 
        }   
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");   
        }   
    }//GEN-LAST:event_btnSokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taElevensKursbetyg;
    private javax.swing.JTextField tfElev;
    // End of variables declaration//GEN-END:variables
}

