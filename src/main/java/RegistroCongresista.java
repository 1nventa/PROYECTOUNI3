
package com.danielarroyo.sistema_gestion_congresistas.Ui;


public class RegistroCongresista extends javax.swing.JFrame {

  
    public RegistroCongresista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NOMBREtxt = new javax.swing.JTextField();
        IDtxt = new javax.swing.JTextField();
        ESMIEMBROCOMITEtxt = new javax.swing.JTextField();
        APELLIDOtxt = new javax.swing.JTextField();
        INSTITUCIONtxt = new javax.swing.JTextField();
        ESORGANIZADORtxt = new javax.swing.JTextField();
        EMAILtxt = new javax.swing.JTextField();
        MOVILtxt = new javax.swing.JTextField();
        ButtonOK = new javax.swing.JButton();
        ButtonELIMINAR = new javax.swing.JButton();
        ButtonLISTAR = new javax.swing.JButton();
        ButtonEDITAR = new javax.swing.JButton();
        ButtonGUARDAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(103, 125, 106));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(103, 125, 106));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 37, -1));

        jLabel2.setText("NOMBRE:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 58, -1, -1));

        jLabel3.setText("PRIMER APELLIDO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("INSTITUCION:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setText("EMAIL:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel6.setText("MOVIL:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setText("ES MIEMBRO COMITE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel8.setText("ES ORGANIZADOR:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        NOMBREtxt.setText("jTextField1");
        NOMBREtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREtxtActionPerformed(evt);
            }
        });
        jPanel3.add(NOMBREtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 204, -1));

        IDtxt.setText("jTextField1");
        jPanel3.add(IDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 18, 204, 22));

        ESMIEMBROCOMITEtxt.setText("jTextField1");
        ESMIEMBROCOMITEtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESMIEMBROCOMITEtxtActionPerformed(evt);
            }
        });
        jPanel3.add(ESMIEMBROCOMITEtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 204, -1));

        APELLIDOtxt.setText("jTextField1");
        jPanel3.add(APELLIDOtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 204, -1));

        INSTITUCIONtxt.setText("jTextField1");
        INSTITUCIONtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSTITUCIONtxtActionPerformed(evt);
            }
        });
        jPanel3.add(INSTITUCIONtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 204, -1));

        ESORGANIZADORtxt.setText("jTextField1");
        jPanel3.add(ESORGANIZADORtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 204, -1));

        EMAILtxt.setText("jTextField1");
        EMAILtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILtxtActionPerformed(evt);
            }
        });
        jPanel3.add(EMAILtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 204, -1));

        MOVILtxt.setText("jTextField1");
        MOVILtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOVILtxtActionPerformed(evt);
            }
        });
        jPanel3.add(MOVILtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 204, -1));

        ButtonOK.setText("OK");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 100, 37));

        ButtonELIMINAR.setText("ELIMINAR");
        jPanel3.add(ButtonELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 200, 37));

        ButtonLISTAR.setText("LISTAR");
        ButtonLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLISTARActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonLISTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 200, 37));

        ButtonEDITAR.setText("EDITAR");
        ButtonEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEDITARActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonEDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 100, 37));

        ButtonGUARDAR.setText("GUARDAR");
        ButtonGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGUARDARActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 18, 200, 37));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 690, 360));

        jPanel5.setBackground(new java.awt.Color(103, 125, 106));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("DETALLES"));

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOIMBRE", "PRIMER APELLIDO", "INSTITUCION", "EMAIL", "MOVIL", "ES MIEMBRO COMITE", "ES ORGANIZADOR"
            }
        ));
        jScrollPane2.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 680, 190));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INSTITUCIONtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSTITUCIONtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INSTITUCIONtxtActionPerformed

    private void EMAILtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILtxtActionPerformed

    private void MOVILtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOVILtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOVILtxtActionPerformed

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonOKActionPerformed

    private void ButtonLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLISTARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLISTARActionPerformed

    private void ButtonEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEDITARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEDITARActionPerformed

    private void NOMBREtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREtxtActionPerformed

    private void ESMIEMBROCOMITEtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESMIEMBROCOMITEtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESMIEMBROCOMITEtxtActionPerformed

    private void ButtonGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGUARDARActionPerformed
        ButtonGUARDAR.setText("GUARDAR");
jPanel3.add(ButtonGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 18, 200, 37));
ButtonGUARDAR.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        ButtonGUARDARActionPerformed(evt);
    }
});
    }//GEN-LAST:event_ButtonGUARDARActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(RegistroCongresista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCongresista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCongresista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCongresista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCongresista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField APELLIDOtxt;
    public javax.swing.JButton ButtonEDITAR;
    public javax.swing.JButton ButtonELIMINAR;
    public javax.swing.JButton ButtonGUARDAR;
    public javax.swing.JButton ButtonLISTAR;
    public javax.swing.JButton ButtonOK;
    public javax.swing.JTextField EMAILtxt;
    public javax.swing.JTextField ESMIEMBROCOMITEtxt;
    public javax.swing.JTextField ESORGANIZADORtxt;
    public javax.swing.JTextField IDtxt;
    public javax.swing.JTextField INSTITUCIONtxt;
    public javax.swing.JTextField MOVILtxt;
    public javax.swing.JTextField NOMBREtxt;
    public javax.swing.JTable TABLA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
