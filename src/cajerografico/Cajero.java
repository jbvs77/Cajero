/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerografico;

import javax.swing.JOptionPane;
public class Cajero extends javax.swing.JFrame {

    int saldo = 1000;
    public Cajero() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jlblsaldo = new javax.swing.JLabel();
        jbtndeposito = new javax.swing.JButton();
        jbtnretiro = new javax.swing.JButton();
        jlblmonto = new javax.swing.JLabel();
        jtxtmonto = new javax.swing.JTextField();
        jbtnsaldo = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtndeposito.setText("DEPOSITO");
        jbtndeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndepositoActionPerformed(evt);
            }
        });

        jbtnretiro.setText("RETIRO");
        jbtnretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnretiroActionPerformed(evt);
            }
        });

        jlblmonto.setText("Ingrese el monto deseado");

        jbtnsaldo.setText("SALDO");
        jbtnsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtndeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnretiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnsaldo)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtndeposito)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnretiro)))
                .addGap(43, 43, 43)
                .addComponent(jbtnsaldo)
                .addGap(18, 18, 18)
                .addComponent(jlblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private void jbtndepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndepositoActionPerformed
        int monto = 0;

        monto = Integer.parseInt(jtxtmonto.getText());
        saldo = monto + saldo;
        jlblsaldo.setText("Tu actual es: " + Integer.toString(saldo));
        jtxtmonto.setText("");
    }//GEN-LAST:event_jbtndepositoActionPerformed

    private void jbtnsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsaldoActionPerformed
        jlblsaldo.setText("Tu saldo es: " + saldo);        
    }//GEN-LAST:event_jbtnsaldoActionPerformed

    private void jbtnretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnretiroActionPerformed
        int monto = 0;
        monto = Integer.parseInt(jtxtmonto.getText());
        
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "No tiene dinero suficiente.");
            jtxtmonto.setText("");
        } else {            
            saldo = saldo - monto;
            jlblsaldo.setText("Tu actual es: " + Integer.toString(saldo));
            jtxtmonto.setText("");
        }      
        
        


    }//GEN-LAST:event_jbtnretiroActionPerformed

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
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
            }
        });    
    } public void llamar(){
        
 Object [] opciones ={"Aceptar","Cancelar"};
 int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
 JOptionPane.YES_NO_OPTION,
 JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
 if (eleccion == JOptionPane.YES_OPTION)
 {
 System.exit(0);
 }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public void probandoGit(){
    
    }
    public void hehesalu2(){
    
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton jbtndeposito;
    private javax.swing.JButton jbtnretiro;
    private javax.swing.JButton jbtnsaldo;
    private javax.swing.JLabel jlblmonto;
    private javax.swing.JLabel jlblsaldo;
    private javax.swing.JTextField jtxtmonto;
    // End of variables declaration//GEN-END:variables
}
