/*
 * This Java program is to implement One Time Pad encryption
 * reference: GeeksforGeeks
 * modified by: Diana,Amy,Sofiyah
 * changes: increase the number of character that can be used includes symbols, TAB and New Line
 *          prepared with GUI for friendly uses.
 */

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author u
 */
public class OTP extends javax.swing.JFrame {

    static String table = "";
    
    public OTP() {
        initComponents();
        genTable(); //generate table
    }
    
    // Function to generate table based on ASCII, 32 until 126 and with TAB and New Line
    static void genTable() {
        
        // append to table ASCII 32 until 126 (SPACE until ~)
        for (int i = 32; i <= 126; i++) {
            table += (char) i;
        }

        table += '\t'; // TAB
        table += '\n'; // New Line
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMessage2 = new javax.swing.JTextArea();
        btnEncrypt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textMessage1 = new javax.swing.JTextArea();
        btnDecrypt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textKey = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("One Time Pad");
        setResizable(false);

        jLabel1.setText("Message 2");

        textMessage2.setEditable(false);
        textMessage2.setColumns(20);
        textMessage2.setLineWrap(true);
        textMessage2.setRows(5);
        jScrollPane1.setViewportView(textMessage2);

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        jLabel2.setText("Message 1");

        textMessage1.setColumns(20);
        textMessage1.setRows(5);
        jScrollPane2.setViewportView(textMessage1);

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        jLabel3.setText("Key");

        textKey.setColumns(20);
        textKey.setRows(5);
        jScrollPane3.setViewportView(textKey);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(btnEncrypt)
                                                .addGap(41, 41, 41)
                                                .addComponent(btnDecrypt))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDecrypt)
                            .addComponent(btnEncrypt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed

        String message = textMessage1.getText(); //get message from text message 1
        String key = generateRandomKey(message.length()); //generate random key using function generateRandomKey() with the length of the message
        String encryptText = encryptOTP(message, key); //encrypt the message using the key

        textKey.setText(key); //set text key
        textMessage2.setText(encryptText); //set text message 2
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed

        String message = textMessage1.getText(); //get message from text message 1
        String key = textKey.getText(); //get key from text key

        String encryptText;
        if (message.length() != key.length()) { //ensure key == length to display encrypted text else display error
            encryptText = "Error: Cannot be decrypted.";
            textMessage2.setForeground(Color.red);
        } else {
            encryptText = decryptOTP(message, key);
            textMessage2.setForeground(Color.BLACK);
        }
        
        textMessage2.setText(encryptText); //set text message 2
    }//GEN-LAST:event_btnDecryptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OTP().setVisible(true);
            }
        });
    }

    // Function to encrypt plaint text to cipher text using One Time Pad Cipher
    public static String encryptOTP(String str, String key) {

        int cipher[] = new int[key.length()];

        // convert to number based on the table
        // then, message + key
        for (int i = 0; i < key.length(); i++) {
            cipher[i] = getIndex(str.charAt(i)) + getIndex(key.charAt(i));
        }

        // modulus to no. of character in table
        for (int i = 0; i < key.length(); i++) {
            cipher[i] = cipher[i] % table.length();
        }

        // convert to character back based on the table
        String encryptText = "";
        for (int i = 0; i < key.length(); i++) {
            int x = cipher[i];
            encryptText += table.charAt(x);
        }

        return encryptText;
    }

    // Function to decrypt the cipher text to plain text using One Time Pad Cipher
    public static String decryptOTP(String str, String key) {

        int plain[] = new int[key.length()];

        // convert to number based on the table
        // then, message - key
        for (int i = 0; i < key.length(); i++) {
            plain[i] = getIndex(str.charAt(i)) - getIndex(key.charAt(i));
        }
        
        // modulus to no. of character in table
        for (int i = 0; i < key.length(); i++) {
            if (plain[i] < 0) {
                plain[i] += table.length();
            } else {
                plain[i] = plain[i] % table.length();
            }
        }

        // convert to character back based on the table
        String decryptText = "";
        for (int i = 0; i < key.length(); i++) {
            int x = plain[i];
            decryptText += table.charAt(x);
        }

        return decryptText;
    }

    // Function to generate random string for the key
    public static String generateRandomKey(int targetStringLength) {

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength); //String builder with capacity of the length

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = 0 + (int) (random.nextFloat() * (96 - 0 + 1));
            buffer.append(table.charAt(randomLimitedInt));
        }

        String generatedString = buffer.toString();

        return generatedString;
    }

    // Function to return the index of the table based on char received
    static int getIndex(char x) {
        for (int i = 0; i < table.length(); i++) {
            if (x == table.charAt(i)) {
                return i;
            }
        }
        return -1; //possibility of char is unrecognized
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textKey;
    private javax.swing.JTextArea textMessage1;
    private javax.swing.JTextArea textMessage2;
    // End of variables declaration//GEN-END:variables
}
