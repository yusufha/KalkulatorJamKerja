
package kalkulatorjamkerja;

import java.awt.event.KeyEvent;
import java.time.Year;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author YusufHA
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    /**
     * Method validasi textBox bulan dan tahun : hanya dapat diisi angka.
     * @param evt 
     */
    public void FilterHanyaAngka(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }
    }
    
    /**
     * Method validasi textBox bulan : Tidak boleh diisi angka '0' & Tidak boleh diisi angka '>12'.
     * @param evt 
     */
    public void FilterNol(java.awt.event.KeyEvent evt){
      int bulan = Integer.parseInt(txtBulan.getText());

        if (bulan <= 0) {
            JOptionPane.showMessageDialog(null, "Bulan Tidak Boleh 0....", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtBulan.setText("");
        } else if (bulan > 12){
            JOptionPane.showMessageDialog(null, "Bulan Tidak Ada....", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtBulan.setText("");
        }else{
        
        }
     }
    
    public void BatasTahun(java.awt.event.KeyEvent evt){
      if(txtTahun.getText().length()>4){
          JOptionPane.showMessageDialog(this, "Tahun Terlalu Banyak Dap");
          evt.consume();
      }
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtBulan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Bulan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        txtBulan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBulan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBulanFocusGained(evt);
            }
        });
        txtBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBulanActionPerformed(evt);
            }
        });
        txtBulan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBulanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBulanKeyTyped(evt);
            }
        });
        getContentPane().add(txtBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 34, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tahun");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        txtTahun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTahunFocusGained(evt);
            }
        });
        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });
        txtTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTahunKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTahunKeyTyped(evt);
            }
        });
        getContentPane().add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 59, -1));

        btnHitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah Hari Kerja");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        txtJumlah.setEditable(false);
        txtJumlah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jam");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 30, 30));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kalkulatorjamkerja/back kal.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTahunKeyTyped
        // TODO add your handling code here
        FilterHanyaAngka(evt);
    }//GEN-LAST:event_txtTahunKeyTyped

    /**
     * Method Action Button Hitung.
     * Memanggil method dari class CekHari, lalu menghitung jumlah jam keseluruhan dalam satu bulan tertentu.
     * @param evt 
     */
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        int mm = Integer.parseInt(txtBulan.getText());
        int yy = Integer.parseInt(txtTahun.getText());
        
        CekHari ch = new CekHari();
        int jjk_SSRK = ch.countSSRK(yy, mm);
        int jjk_J = ch.countJumat(yy, mm);
        int jjk_S = ch.countSabtu(yy, mm);
        
        int jumlah_jk = jjk_SSRK + jjk_J + jjk_S;
        
        txtJumlah.setText(Integer.toString(jumlah_jk));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        // TODO add your handling code here:
        btnHitungActionPerformed(evt);
    }//GEN-LAST:event_txtTahunActionPerformed

    private void txtBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBulanActionPerformed
        // TODO add your handling code here:
        txtTahun.requestFocus();
    }//GEN-LAST:event_txtBulanActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        txtBulan.setText("ex:2");
        txtTahun.setText("ex:2018");
        lblBack.requestFocus();
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtBulanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBulanFocusGained
        // TODO add your handling code here:
        txtBulan.setText("");
    }//GEN-LAST:event_txtBulanFocusGained

    private void txtTahunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTahunFocusGained
        // TODO add your handling code here:
        txtTahun.setText("");
    }//GEN-LAST:event_txtTahunFocusGained

    private void txtBulanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBulanKeyTyped
        // TODO add your handling code here:
        FilterHanyaAngka(evt);
    }//GEN-LAST:event_txtBulanKeyTyped

    private void txtBulanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBulanKeyReleased
        // TODO add your handling code here:
        FilterNol(evt);
    }//GEN-LAST:event_txtBulanKeyReleased

    private void txtTahunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTahunKeyReleased
        // TODO add your handling code here:
        BatasTahun(evt);
    
    }//GEN-LAST:event_txtTahunKeyReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBack;
    private javax.swing.JTextField txtBulan;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
