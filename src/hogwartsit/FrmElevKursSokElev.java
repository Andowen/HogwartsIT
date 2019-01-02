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
public class FrmElevKursSokElev extends javax.swing.JInternalFrame {

    private static InfDB idb;
    
    /**
     * Creates new form FrmKurser
     */
    public FrmElevKursSokElev(InfDB idb) {
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
        tfSokRuta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taKurser = new javax.swing.JTextArea();

        jLabel1.setText("Ange elevens namn och få fram kurser han/hon varit registrerad på.");

        tfSokRuta.setColumns(10);

        jLabel2.setText("Elevens namn:");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        taKurser.setColumns(20);
        taKurser.setRows(5);
        jScrollPane1.setViewportView(taKurser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnSok)
                            .addComponent(tfSokRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSokRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSok))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        try{
            //Kontrollerar att textfältet inte är tomt.
            if(Validering.textfaltHarVarde(tfSokRuta)){
                // Hämtar texten i textfältet SokRuta, splittar strängen vid mellanslag och skapar en array av strängar.
                String[] elevNamnet = tfSokRuta.getText().trim().split("\\s+");
                String forNamn = elevNamnet[0];
                String efterNamn = elevNamnet[1]; 
                // Hämtar kurser som en elev varit registrerad på.
                 ArrayList<HashMap<String, String>> resultat = idb.fetchRows("SELECT kursnamn FROM Kurs\n" +
                    "JOIN Har_betyg_i ON Har_betyg_i.Kurs_ID = Kurs.Kurs_ID \n" +
                    "JOIN Elev ON Elev.Elev_ID = Har_betyg_i.Elev_ID \n" +
                    "WHERE Fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'");
                    //Kontrollerar att resultatet inte är null.
                    if(resultat != null) {
                        //Loopar genom ArrayListen och hämtar kursnamnen för varje kurs i ArrayListens HashMap.
                        for(int i = 0; i <resultat.size(); i ++) {
                        String kursNamn = resultat.get(i).get("KURSNAMN");
                        //Kontrollerar att de inte är null.
                        if(kursNamn != null) {
                            //Lägger till kursnamnen i textrutan.
                            taKurser.append(kursNamn + "\n");
                        }
                    else{
                        // Felmeddelande om eleven inte är registrerad på några kurser.
                        JOptionPane.showMessageDialog(null, "Eleven är inte registrerad på några kurser"); 
                        }
                    }   
                }
                    else{
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
    private javax.swing.JTextArea taKurser;
    private javax.swing.JTextField tfSokRuta;
    // End of variables declaration//GEN-END:variables
}
