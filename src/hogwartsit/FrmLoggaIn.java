/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsit;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Anna Svensson och Ellinor Danielsson
 */
public class FrmLoggaIn extends javax.swing.JFrame {

    private static InfDB idb;
    private boolean arInloggad = false;
    private static boolean arAdmin = false;
    private static String lararID = "";
    
    /**
     * Creates new form FrmLoggaIn2
     */
    public FrmLoggaIn(InfDB idb) {
        initComponents();
        this.idb = idb;
        // Bestämmer storleken på fönstret
        this.setSize(340, 300);
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
        lblValkommen = new javax.swing.JLabel();
        lblLoggaIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Logga In");
        setAlwaysOnTop(true);
        setResizable(false);

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

        lblValkommen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValkommen.setText("Välkommen!");

        lblLoggaIn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblLoggaIn.setText("Logga in som lärare eller administratör");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnvandarnamn)
                    .addComponent(lblLosenord)
                    .addComponent(lblValkommen)
                    .addComponent(lblLoggaIn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoggaIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvsluta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblValkommen)
                .addGap(18, 18, 18)
                .addComponent(lblLoggaIn)
                .addGap(18, 18, 18)
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
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        //Validerar inloggningen och stänger sedan fönstret
        //Kontrollerar att textfälten inte är tomma.
        if (Validering.textfaltHarVarde(tfAnvandarnamn) && Validering.textfaltHarVarde(tfLosenord)){
            // Hämtar texten i textfältet användarnamn, splittar strängen vid mellanslag och skapar en array av strängar.
            String[] anvandarNamnet = tfAnvandarnamn.getText().trim().split("\\s+");
            // Hämtar lösenordet och konverterar det till en sträng.
            String losenordet = String.valueOf(tfLosenord.getPassword());
            String forNamn = anvandarNamnet[0];
            String efterNamn = anvandarNamnet[1];
            
                try {
                //Hämtar lösenord och administratörsstatus från läraren.
                HashMap<String, String> resultat = idb.fetchRow("SELECT larar_id, losenord, administrator FROM larare WHERE fornamn = \'" + forNamn + "\' AND efternamn = \'" + efterNamn + "\'"); 
                
                String losenord = resultat.get("LOSENORD");
                String administrator = resultat.get("ADMINISTRATOR");
                String ettlararID = resultat.get("LARAR_ID");
                
                    //Kontrollerar att lösenordet som skrivits matchar det som är lagrat i databasen
                    if (losenordet.equals(losenord)) {
                        arInloggad = true;
                        lararID = ettlararID;
                    
                        //Kontrollerar om användaren har administratörs-status eller ej
                        if (administrator.equals("T")) {
                            arAdmin = true; 
                        }
                
                        this.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Felaktigt lösenord.");
                    }
                } 
                catch (InfException ettUndantag) {
                    ettUndantag.getMessage();
                    JOptionPane.showMessageDialog(null, "Felaktigt användarnamn.");
                }
                catch (NullPointerException ettAnnatUndantag) {
                    ettAnnatUndantag.getMessage();
                    JOptionPane.showMessageDialog(null, "Felaktigt användarnamn.");
                }
                    

        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        //Stänger fönstret
        this.dispose();
    }//GEN-LAST:event_btnAvslutaActionPerformed
  
    public boolean getArInloggad(){
        //Metoden returnerar en boolean om någon är inloggad eller inte, för användning i HuvudFonster-klassen
        return arInloggad;
    }
    
    public static boolean getArAdmin() {
         //Metoden returnerar en boolean om någon är administratör eller inte, för användning i HuvudFonster-klassen
        return arAdmin;       
    }
    
    public static String getArInloggadSom() {
        return lararID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblAnvandarnamn;
    private javax.swing.JLabel lblLoggaIn;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextField tfAnvandarnamn;
    private javax.swing.JPasswordField tfLosenord;
    // End of variables declaration//GEN-END:variables
}
