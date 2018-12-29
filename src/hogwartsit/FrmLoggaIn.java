/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Anna Svensson och Ellinor Danielsson
 */
public class FrmLoggaIn extends javax.swing.JInternalFrame {

    private static InfDB idb;
    private boolean arInloggad = false;
   
    /**
     * Creates new form FrmLoggaIn
     */
    public FrmLoggaIn(InfDB idb) {
        initComponents();
        this.idb = idb;
        // Bestämmer storleken på fönstret
        this.setSize(300, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoggaIn = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        tfAnvandarnamn = new javax.swing.JTextField();
        tfLosenord = new javax.swing.JPasswordField();
        lblAnvandarnamn = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();

        setTitle("Logga in");
        setLayer(1);

        btnLoggaIn.setText("Logga In");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        btnAvsluta.setText("Avsluta");
        btnAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvslutaActionPerformed(evt);
            }
        });

        tfAnvandarnamn.setColumns(12);

        tfLosenord.setColumns(12);

        lblAnvandarnamn.setText("Användarnamn:");

        lblLosenord.setText("Lösenord:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAnvandarnamn)
                    .addComponent(lblLosenord)
                    .addComponent(tfAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoggaIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvsluta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnvandarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLoggaIn)
                    .addComponent(btnAvsluta))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean getArInloggad(){
        //Metod som ska returnera en boolean om någon är inloggad eller inte, för användning i HuvudFonster-klassen
        return arInloggad;
    }
    
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        //Validerar inloggningen och stänger sedan fönstret
        // Här ska validering av användarnamn och lösenord ske, men just nu loggar man helt enkelt in genom att trycka på knappen
        arInloggad = true;
        this.dispose();
        
        
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        //Stänger fönstret
        this.dispose();
    }//GEN-LAST:event_btnAvslutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblAnvandarnamn;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JTextField tfAnvandarnamn;
    private javax.swing.JPasswordField tfLosenord;
    // End of variables declaration//GEN-END:variables
}
