/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andow
 */
public class FrmLarareRegistreraHuspoang extends javax.swing.JInternalFrame {

    private static InfDB idb;
    
    /**
     * Creates new form FrmLarareRegistreraHuspoang
     */
    public FrmLarareRegistreraHuspoang(InfDB idb) {
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

        cbElevhem = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        tfNyaPoang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMeddelande = new javax.swing.JLabel();

        cbElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin" }));

        jButton1.setText("Registrera huspoäng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfNyaPoang.setColumns(10);

        jLabel2.setText("Elevhem:");

        jLabel3.setText("Nya huspoäng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfNyaPoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMeddelande)
                    .addComponent(jButton1))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNyaPoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lblMeddelande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       try {
           //Kontrollerar att textfältet innehåller ett värde som är ett heltal.
            if (Validering.textfaltHarVarde(tfNyaPoang) && Validering.textfaltTal(tfNyaPoang)) {
                //Hämtar namnet på elevhemmet i comboboxen.
                String elevhem = cbElevhem.getSelectedItem().toString();
                //Hämtar hupoängen från tabellen Elevhem.
                String huspoang = idb.fetchSingle("SELECT Huspoang FROM Elevhem where Elevhemsnamn = \'" + elevhem + "\'");
                //Omvandlar huspoängen och det inkommande talet till int och adderar dem.
                int talHuspoang = Integer.parseInt(huspoang);
                int nyaHuspoang = Integer.parseInt(tfNyaPoang.getText());
                int summa = talHuspoang + nyaHuspoang;
                //Uppdaterar tabellen med den nya huspoängen.
                idb.update("UPDATE Elevhem SET Huspoang = \'" + summa + "\' WHERE Elevhemsnamn = \'" + elevhem + "\'");
                //Skriver ut ett meddelande om att poängen har ändrats och den nya huspoängen.
                JOptionPane.showMessageDialog(null, "Poängen har registrerats. " + elevhem + " har nu sammanlagt " + summa + " poäng.");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbElevhem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMeddelande;
    private javax.swing.JTextField tfNyaPoang;
    // End of variables declaration//GEN-END:variables
}
