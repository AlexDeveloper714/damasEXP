package Interfaz;

import Codigo.*;

public class Panel_Visual extends javax.swing.JFrame {

    boolean SiEs = false;
    String[][] tabla = new String[7][7];

    public Panel_Visual() {
        initComponents();
        for (int i = 0; i < UbicacionTable.getRowCount(); i++) {
            for (int j = 0; j < UbicacionTable.getColumnCount(); j++) {
                UbicacionTable.setValueAt(null, i, j);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        UbicacionTable = new javax.swing.JTable();
        ResetearBtn = new javax.swing.JButton();
        PintarBtn = new javax.swing.JButton();
        ErrorTxt1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UbicacionTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UbicacionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {"", null, null, null, null, null, null},
                {"", null, null, null, null, null, null},
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UbicacionTable);
        if (UbicacionTable.getColumnModel().getColumnCount() > 0) {
            UbicacionTable.getColumnModel().getColumn(0).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(1).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(2).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(3).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(4).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(5).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(6).setResizable(false);
        }

        ResetearBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetearBtn.setText("Borrar Tablero");
        ResetearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearBtnActionPerformed(evt);
            }
        });

        PintarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PintarBtn.setText("Pintar Tablero");
        PintarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PintarBtnActionPerformed(evt);
            }
        });

        ErrorTxt1.setEditable(false);
        ErrorTxt1.setBackground(new java.awt.Color(214, 217, 223));
        ErrorTxt1.setColumns(20);
        ErrorTxt1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ErrorTxt1.setRows(5);
        ErrorTxt1.setText("Bienvenido al tablero de las damas\nchinas, solamnente pintamos el\ntablero, jugar requeriria más\nlógica xD");
        ErrorTxt1.setBorder(null);
        ErrorTxt1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PintarBtn)
                            .addComponent(ResetearBtn)))
                    .addComponent(ErrorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ErrorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PintarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetearBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetearBtnActionPerformed
        for (int i = 0; i < UbicacionTable.getRowCount(); i++) {
            for (int j = 0; j < UbicacionTable.getColumnCount(); j++) {
                UbicacionTable.setValueAt(null, i, j);
                tabla[i][j] = null;
            }
        }
    }//GEN-LAST:event_ResetearBtnActionPerformed

    private void PintarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PintarBtnActionPerformed
        int i = 0, j = 0;
        VueltaAtras proceso = new VueltaAtras();
        proceso.crearTabDam(tabla);
        //Ubicar en la tabla
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                UbicacionTable.setValueAt(tabla[i][j], i, j);
            }
        }
    }//GEN-LAST:event_PintarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Visual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ErrorTxt1;
    private javax.swing.JButton PintarBtn;
    private javax.swing.JButton ResetearBtn;
    private javax.swing.JTable UbicacionTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
