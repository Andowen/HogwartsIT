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
public class FrmElevElevhemLista extends javax.swing.JInternalFrame {

    private static InfDB idb;
    
    /**
     * Creates new form FrmTest
     */
    public FrmElevElevhemLista(InfDB idb) {
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

        tfFraga = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        tfElevhemSok = new javax.swing.JTextField();
        spElevhemmensElever = new javax.swing.JScrollPane();
        taListaMedElever = new javax.swing.JTextArea();

        setBorder(null);

        tfFraga.setText("För vilket elevhem vill du lista elever?");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        tfElevhemSok.setColumns(10);

        taListaMedElever.setColumns(20);
        taListaMedElever.setRows(5);
        spElevhemmensElever.setViewportView(taListaMedElever);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSok)
                    .addComponent(tfFraga)
                    .addComponent(tfElevhemSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(spElevhemmensElever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spElevhemmensElever)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfFraga)
                        .addGap(27, 27, 27)
                        .addComponent(tfElevhemSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(btnSok)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        // Kontrollerar att textfältet inte är tomt.
        if (Validering.textfaltHarVarde(tfElevhemSok)) {
            //Hämtar strängen från textfältet.
            String elevhem = tfElevhemSok.getText();
            //Tömmer textrutan från text.
            taListaMedElever.setText("");
            
            try {
                //Hämtar förnamn och efternamn på eleverna i det önskade elevhemmet.
                ArrayList<HashMap<String, String>> resultat = idb.fetchRows("SELECT fornamn, efternamn FROM Elev \n" + 
                        "JOIN sovsal ON Sovsal_ID = Sovsal \n" + ""
                        + "JOIN elevhem ON Elevhem_ID = Elevhem \n" +
                        "WHERE Elevhemsnamn = \'" + elevhem + "\'");
                //Kontrollerar att resultatet inte är null.
                if (resultat != null) {
                    
                    //Loopar igenom ArrayListen och hämtar förnamn och efternamn för varje elev i ArrayListens HashMap.
                    for (int i = 0; i < resultat.size(); i++) {
                        String fornamn = resultat.get(i).get("FORNAMN");
                        String efternamn = resultat.get(i).get("EFTERNAMN");
                        //Kontrollerar att variablerna fornamn och efternamn inte är null.
                        if (fornamn != null && efternamn != null) {
                            //Lägger till förnamn och efternamn i textrutan.
                            taListaMedElever.append(fornamn + " " + efternamn + "\n");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Det finns inga elever i elevhemmet");
                        }
                    }
                }
                else {
                JOptionPane.showMessageDialog(null, "Det finns inget elevhem med det namnet.");  
                }
            
            }
            
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JScrollPane spElevhemmensElever;
    private javax.swing.JTextArea taListaMedElever;
    private javax.swing.JTextField tfElevhemSok;
    private javax.swing.JLabel tfFraga;
    // End of variables declaration//GEN-END:variables
}
