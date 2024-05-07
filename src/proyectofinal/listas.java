/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tijex
 */
public class listas extends javax.swing.JFrame {

    /**
     * Creates new form listas
     */
    public listas() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/DevHuvbn.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        tproducto = new javax.swing.JTextField();
        tvalor = new javax.swing.JTextField();
        tdescuento = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        tsubtotal = new javax.swing.JTextField();
        tiva = new javax.swing.JTextField();
        ttotalpagar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Barra1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Listas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 184, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Tienda de ejemplo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zapatos..............$90000", "Camisas..............$70000", "Pantalones.........$120000", "Correas..............$40000", "Gorra.................$20000" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Descuentos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        rb1.setText("10%");
        jPanel1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        rb2.setText("30%");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        rb3.setText("50%");
        jPanel1.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        rb4.setText("70%");
        jPanel1.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));
        jPanel1.add(tproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, -1));
        jPanel1.add(tvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, -1));
        jPanel1.add(tdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 60, -1));
        jPanel1.add(ttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 80, -1));

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setText("Valor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel8.setText("Descuento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Valor", "Descuento", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 90));

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 80, -1));
        jPanel1.add(tsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, -1));
        jPanel1.add(tiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 80, -1));
        jPanel1.add(ttotalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, -1));

        jLabel9.setText("Total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel10.setText("SubTotal");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel11.setText("IVA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 390, 10));

        Barra1.setBackground(new java.awt.Color(246, 246, 246));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton11.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/v2icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1devhub.png"))); // NOI18N

        javax.swing.GroupLayout Barra1Layout = new javax.swing.GroupLayout(Barra1);
        Barra1.setLayout(Barra1Layout);
        Barra1Layout.setHorizontalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(7, 7, 7))
        );
        Barra1Layout.setVerticalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra1Layout.createSequentialGroup()
                .addGroup(Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Barra1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        jButton5.setText("¿Como funciona?");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 400, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int val,valprod=0;
        float desc,total;
        val=combo1.getSelectedIndex();
        if(val==0){
            tproducto.setText("Zapato");
            tvalor.setText("90000");
            valprod=90000;
        }
        if(val==1){
            tproducto.setText("Camisa");
            tvalor.setText("70000");
            valprod=70000;
        }
        if(val==2){
            tproducto.setText("Pantalón");
            tvalor.setText("120000");
            valprod=120000;
        }
        if(val==3){
            tproducto.setText("Correa");
            tvalor.setText("40000");
            valprod=40000;
        }
        if(val==4){
            tproducto.setText("Gorra");
            tvalor.setText("20000");
            valprod=20000;
        }

        if(rb1.getModel().isSelected()){
            desc=(valprod*10
            )/100;
            total=valprod-desc;
            tdescuento.setText(String.valueOf(desc));
            ttotal.setText(String.valueOf(total));
        }
        if(rb2.getModel().isSelected()){
            desc=(valprod*30)/100;
            total=valprod-desc;
            tdescuento.setText(String.valueOf(desc));
            ttotal.setText(String.valueOf(total));
        }
        if(rb3.getModel().isSelected()){
            desc=(valprod*50)/100;
            total=valprod-desc;
            tdescuento.setText(String.valueOf(desc));
            ttotal.setText(String.valueOf(total));
        }
        if(rb4.getModel().isSelected()){
            desc=(valprod*70)/100;
            total=valprod-desc;
            tdescuento.setText(String.valueOf(desc));
            ttotal.setText(String.valueOf(total));
        }

        if (JOptionPane.showConfirmDialog(rootPane, "Estas seguro que deseas agregar")==JOptionPane.OK_OPTION)
        {   
            DefaultTableModel m=(DefaultTableModel)tabla1.getModel();
            //m.setNumRows(cont);
            m.addRow(new Object[]{tproducto.getText(),tvalor.getText(),tdescuento.getText(),ttotal.getText()});
            //cont=cont+1;
        }

        //DefaultTableModel m=(DefaultTableModel)tabla1.getModel();
        //m.setNumRows(cont);
        //m.addRow(new Object[]{tproducto.getText(),tvalor.getText(),tdescuento.getText(),ttotal.getText()});

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double suma = 0;
        double totalfinal,iva;
        DefaultTableModel m=(DefaultTableModel)tabla1.getModel();
        for (int i=0;i<tabla1.getRowCount();i++){
            suma=suma+Double.parseDouble(m.getValueAt(i, 3).toString());
        }
        tsubtotal.setText(String.valueOf(suma));
        iva=suma*0.16;
        tiva.setText(String.valueOf(iva));
        totalfinal=suma+iva;
        ttotalpagar.setText(String.valueOf(totalfinal));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a=tabla1.getSelectedRow();
        DefaultTableModel m=(DefaultTableModel)tabla1.getModel();
        if (a != -1) {
        m.removeRow(a);
        }
        //DefaultTableModel m=(DefaultTableModel)tabla1.getModel();
        //m.removeRow(tabla1.getRowCount()-1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tuto8 newframe = new tuto8();

        newframe.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra1;
    private javax.swing.JComboBox combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField tdescuento;
    private javax.swing.JTextField tiva;
    private javax.swing.JTextField tproducto;
    private javax.swing.JTextField tsubtotal;
    private javax.swing.JTextField ttotal;
    private javax.swing.JTextField ttotalpagar;
    private javax.swing.JTextField tvalor;
    // End of variables declaration//GEN-END:variables
}
