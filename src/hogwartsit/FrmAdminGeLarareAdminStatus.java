/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

/**
 *
 * @author ellin
 */
public class FrmAdminGeLarareAdminStatus extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAdminGeLarareAdminStatus
     */
    public FrmAdminGeLarareAdminStatus(InfDB idb) {
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
        tfSokLarare = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        lblAndringar = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();

        jLabel1.setText("Sök lärare att ge administratörstatus:");

        tfSokLarare.setColumns(15);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        btnSpara.setText("Spara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSpara)
                    .addComponent(lblAndringar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSokLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSok))
                    .addComponent(jLabel1))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSokLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addGap(32, 32, 32)
                .addComponent(lblAndringar)
                .addGap(70, 70, 70)
                .addComponent(btnSpara)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
         try{
            //Kontrollerar att textfältet inte är tomt.
            if(Validering.textfaltHarVarde(tfSokLarare)){
                // Hämtar texten i textfältet SokRuta, splittar strängen vid mellanslag och skapar en array av strängar.
                String[] elevNamnet = tfSokLarare.getText().trim().split("\\s+");
                String forNamn = elevNamnet[0];
                String efterNamn = elevNamnet[1]; 
                String adminStatus = idb.fetchSingle("SELECT Administrator FROM Larare WHERE Fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'");
            }
         }
         catch (InfException ettUndantag){
             JOptionPane.showMessageDialog(null, "Något gick fel");
         }
         
    }//GEN-LAST:event_btnSokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnSpara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAndringar;
    private javax.swing.JTextField tfSokLarare;
    // End of variables declaration//GEN-END:variables
}