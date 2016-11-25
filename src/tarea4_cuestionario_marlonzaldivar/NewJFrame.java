
package tarea4_cuestionario_marlonzaldivar;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Cuestionario = new javax.swing.JPanel();
        preg1 = new javax.swing.JLabel();
        preg1_opc1 = new javax.swing.JRadioButton();
        preg1_opc2 = new javax.swing.JRadioButton();
        preg1_opc3 = new javax.swing.JRadioButton();
        preg2 = new javax.swing.JLabel();
        preg2_v = new javax.swing.JCheckBox();
        preg2_f = new javax.swing.JCheckBox();
        preg3 = new javax.swing.JLabel();
        preg3_opc1 = new javax.swing.JRadioButton();
        preg3_opc2 = new javax.swing.JRadioButton();
        preg3_opc3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        terminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cuestionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuestionario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        preg1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preg1.setText("1. ¿Cuanto es (2+2)x5?");

        buttonGroup1.add(preg1_opc1);
        preg1_opc1.setText("12");

        buttonGroup1.add(preg1_opc2);
        preg1_opc2.setText("20");

        buttonGroup1.add(preg1_opc3);
        preg1_opc3.setText("24");

        preg2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preg2.setText("2. ¿π (Pi) equivale a 3.14159265359?");

        buttonGroup2.add(preg2_v);
        preg2_v.setText("Verdadero");

        buttonGroup2.add(preg2_f);
        preg2_f.setText("Falso");

        preg3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preg3.setText("3. Si Juan tiene 39 manzanas y regala 17, ¿Cuantas manzanas le quedan?");

        buttonGroup3.add(preg3_opc1);
        preg3_opc1.setText("21");

        buttonGroup3.add(preg3_opc2);
        preg3_opc2.setText("19");

        buttonGroup3.add(preg3_opc3);
        preg3_opc3.setText("22");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Tema: Matematicas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Valor 6%");

        terminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        terminar.setText("Terminar Cuestionario");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CuestionarioLayout = new javax.swing.GroupLayout(Cuestionario);
        Cuestionario.setLayout(CuestionarioLayout);
        CuestionarioLayout.setHorizontalGroup(
            CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuestionarioLayout.createSequentialGroup()
                .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuestionarioLayout.createSequentialGroup()
                        .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CuestionarioLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))
                                .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(preg1))
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(preg1_opc2)
                                            .addComponent(preg1_opc1)
                                            .addComponent(preg1_opc3)))
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(preg2))
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(preg2_f)
                                            .addComponent(preg2_v)))
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(preg3))
                                    .addGroup(CuestionarioLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(preg3_opc2)
                                            .addComponent(preg3_opc1)
                                            .addComponent(preg3_opc3)))))
                            .addGroup(CuestionarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuestionarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(terminar)))
                .addContainerGap())
        );
        CuestionarioLayout.setVerticalGroup(
            CuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuestionarioLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(preg1)
                .addGap(18, 18, 18)
                .addComponent(preg1_opc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preg1_opc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preg1_opc3)
                .addGap(30, 30, 30)
                .addComponent(preg2)
                .addGap(18, 18, 18)
                .addComponent(preg2_v)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preg2_f)
                .addGap(30, 30, 30)
                .addComponent(preg3)
                .addGap(18, 18, 18)
                .addComponent(preg3_opc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preg3_opc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preg3_opc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(terminar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
         
   int resp_co = 0;
   int resp_in = 0;
       
        if(preg1_opc2.isSelected())
      {
       resp_co++;
      }
        else
        {
         resp_in++;
        }
        
        if(preg2_v.isSelected())
      {
       resp_co++;
      }
        else
        {
         resp_in++;
        }
         
        if(preg3_opc3.isSelected())
      {
       resp_co++;
      }
       else
        {
         resp_in++;
        }
        
JOptionPane.showMessageDialog(null,"Resultado:"+"\nRespuestas Correctas:" +resp_co+""
          +"\nRespuestas Incorrectas:" +resp_in+"\nSu calificacion es:"+resp_co*2+"%");

    System.exit(0);
    }//GEN-LAST:event_terminarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cuestionario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel preg1;
    private javax.swing.JRadioButton preg1_opc1;
    private javax.swing.JRadioButton preg1_opc2;
    private javax.swing.JRadioButton preg1_opc3;
    private javax.swing.JLabel preg2;
    private javax.swing.JCheckBox preg2_f;
    private javax.swing.JCheckBox preg2_v;
    private javax.swing.JLabel preg3;
    private javax.swing.JRadioButton preg3_opc1;
    private javax.swing.JRadioButton preg3_opc2;
    private javax.swing.JRadioButton preg3_opc3;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
}
