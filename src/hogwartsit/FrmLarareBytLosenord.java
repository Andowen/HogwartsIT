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
public class FrmLarareBytLosenord extends javax.swing.JInternalFrame {

    private static InfDB idb;
    
    /**
     * Creates new form FrmLarareBytLosenord
     */
    public FrmLarareBytLosenord(InfDB idb) {
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
        tfAnvandarnamn = new javax.swing.JTextField();
        pfGammaltLosenord = new javax.swing.JPasswordField();
        pfNyttLosenord = new javax.swing.JPasswordField();
        btnBytLosenord = new javax.swing.JButton();
        pfNyttLosenord2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Ange dina inloggningsuppgifter och ett nytt lösenord.");

        tfAnvandarnamn.setColumns(10);

        pfGammaltLosenord.setColumns(10);

        pfNyttLosenord.setColumns(10);

        btnBytLosenord.setText("Byt lösenord");
        btnBytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenordActionPerformed(evt);
            }
        });

        pfNyttLosenord2.setColumns(10);

        jLabel2.setText("Användarnamn:");

        jLabel3.setText("Gammalt lösenord:");

        jLabel4.setText("Nytt lösenord:");

        jLabel5.setText("Upprepa ditt nya lösenord:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pfGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBytLosenord)
                    .addComponent(pfNyttLosenord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(tfAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(pfGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfNyttLosenord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBytLosenord)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenordActionPerformed
        try {
            // Kontrollerar att textfälten inte är tomma.
            if (Validering.textfaltHarVarde(tfAnvandarnamn) && Validering.textfaltHarVarde(pfGammaltLosenord) && Validering.textfaltHarVarde(pfNyttLosenord) && Validering.textfaltHarVarde(pfNyttLosenord2)) {
                // Hämtar texten i textfältet SokRuta, splittar strängen vid mellanslag och skapar en array av strängar.
                String[] lararNamnet = tfAnvandarnamn.getText().trim().split("\\s+");
                String forNamn = lararNamnet[0];
                String efterNamn = lararNamnet[1];
                // Hämtar texten i de tre lösenordsfönstrena.
                String gammaltLosen = pfGammaltLosenord.getText();
                String nyttLosen1 = pfNyttLosenord.getText();
                String nyttLosen2 = pfNyttLosenord2.getText();
                // Hämtar lösenord för en lärare.
                String resultat = idb.fetchSingle("SELECT Losenord FROM Larare WHERE Fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'");
                //Kontrollerar att de gamla/nuvarande lösenorden matchar och att de nya lösenorden matchar med varandra.
                if (resultat.equals(gammaltLosen) && nyttLosen1.equals(nyttLosen2)) {
                    //Ändrar lösenordet i tabellen.
                    idb.update("UPDATE Larare SET Losenord = \'" + nyttLosen1 + "\' WHERE Fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'");
                    JOptionPane.showMessageDialog(null, "Du har nu bytt lösenord och ditt nya är: " + nyttLosen1);
                    //Om endast de nya lösenorden matchar skrivs felmeddelande ut om att det gamla lösenordet inte stämmer.
                } else if (nyttLosen1.equals(nyttLosen2)) {
                    JOptionPane.showMessageDialog(null, "Ditt gamla lösenord stämmer inte.");
                    //Om endast de gamla lösenorden  matchar skrivs felmeddelande ut om att de nya lösenorden inte matchar.
                } else if (resultat.equals(gammaltLosen)) {
                    JOptionPane.showMessageDialog(null, "Dina nya lösenord matchar inte med varandra.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Textfältet saknar värde.");
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
        }
        catch (NullPointerException ettAnnatUndantag) {
            ettAnnatUndantag.getMessage();
            JOptionPane.showMessageDialog(null, "Ditt användarnamn stämmer inte.");
            
        }
    }//GEN-LAST:event_btnBytLosenordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLosenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pfGammaltLosenord;
    private javax.swing.JPasswordField pfNyttLosenord;
    private javax.swing.JPasswordField pfNyttLosenord2;
    private javax.swing.JTextField tfAnvandarnamn;
    // End of variables declaration//GEN-END:variables
}
