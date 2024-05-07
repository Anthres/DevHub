/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tijex
 */
public class matrices extends javax.swing.JFrame {

    matricesC m=new matricesC();
 public boolean esPrimo(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
    public matrices() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        sumabordes = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        tprimeraf = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        tsegundadiag = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        tsumpot4imp = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        tpromnumimp1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        tparcubultf = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        tmedia = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        tmediana = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        tmoda = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        tsumprimcol1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        tpronupri5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        tds = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        Barra1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Matrices");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 184, -1));

        jButton3.setText("Suma Bordes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, -1));

        sumabordes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sumabordes.setEnabled(false);
        sumabordes.setSelectionColor(new java.awt.Color(0, 0, 0));
        sumabordes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabordesActionPerformed(evt);
            }
        });
        getContentPane().add(sumabordes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, -1));

        jButton4.setText("Prime Fila +");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, -1));

        tprimeraf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tprimeraf.setEnabled(false);
        getContentPane().add(tprimeraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, -1));

        jButton5.setText("+ pote 3 par");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 160, -1));

        tsegundadiag.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tsegundadiag.setEnabled(false);
        getContentPane().add(tsegundadiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 160, -1));

        jButton6.setText("+ pote 4 impar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 160, -1));

        tsumpot4imp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tsumpot4imp.setEnabled(false);
        getContentPane().add(tsumpot4imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 160, -1));

        jButton7.setText("Prom num imp 5<x<15");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 160, -1));

        tpromnumimp1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tpromnumimp1.setEnabled(false);
        getContentPane().add(tpromnumimp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 160, -1));

        jButton8.setText("+ par cubo  ult fila");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 160, -1));

        tparcubultf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tparcubultf.setEnabled(false);
        tparcubultf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tparcubultfActionPerformed(evt);
            }
        });
        getContentPane().add(tparcubultf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 160, -1));

        jButton9.setText("Media");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, -1));

        tmedia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tmedia.setEnabled(false);
        getContentPane().add(tmedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 150, -1));

        jButton10.setText("Mediana");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 150, -1));

        tmediana.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tmediana.setEnabled(false);
        getContentPane().add(tmediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, -1));

        jButton11.setText("Moda");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, -1));

        tmoda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tmoda.setEnabled(false);
        getContentPane().add(tmoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 150, -1));

        jButton12.setText("+ prim colum 1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 160, -1));

        tsumprimcol1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tsumprimcol1.setEnabled(false);
        getContentPane().add(tsumprimcol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 160, -1));

        jButton13.setText("Prom num prim 5<x<13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 170, -1));

        tpronupri5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tpronupri5.setEnabled(false);
        getContentPane().add(tpronupri5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 170, -1));

        jButton2.setBackground(new java.awt.Color(192, 255, 192));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 60));

        jButton14.setBackground(new java.awt.Color(206, 226, 255));
        jButton14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton14.setText("Ver");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 60));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 780, 10));

        jLabel3.setText("Por: Andres Pantoja");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jButton17.setText("Desv. Estandar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, -1));

        tds.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tds.setEnabled(false);
        tds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdsActionPerformed(evt);
            }
        });
        getContentPane().add(tds, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 150, -1));

        jButton16.setText("Regresar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        Barra1.setBackground(new java.awt.Color(246, 246, 246));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton15.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/v2icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton18.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1devhub.png"))); // NOI18N

        javax.swing.GroupLayout Barra1Layout = new javax.swing.GroupLayout(Barra1);
        Barra1.setLayout(Barra1Layout);
        Barra1Layout.setHorizontalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addGap(7, 7, 7))
        );
        Barra1Layout.setVerticalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra1Layout.createSequentialGroup()
                .addGroup(Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Barra1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setText("¿Como funciona?");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int suma=0;
        for(int i=0; i<=m.getFilas()-1; i++)
        {
            for(int j=0; j<=m.getColumnas()-1; j++)
            {
                if(i==0||j==0||i==m.getFilas()-1||j==m.getColumnas()-1)
                suma=suma+m.getMatriz(i,j);

            }
        }
        sumabordes.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sumabordesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabordesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumabordesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int suma=0;
        for(int i=0; i<=m.getFilas()-1; i++)
        {
            for(int j=0; j<=m.getColumnas()-1; j++)
            {
                if(i==0){
                    suma=suma+m.getMatriz(i,j); }

            }
        }
        tprimeraf.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int n = m.getFilas();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            int elemento = m.getMatriz(i, n - i - 1);
            if (elemento % 2 == 0) {
                suma += Math.pow(elemento, 3);
            }
        }

        tsegundadiag.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int suma = 0;
        int n = m.getFilas();

        for (int i = 0; i < n; i++) {
            int j = i;

            if (m.getMatriz(i, j) % 2 != 0) {
                int num = m.getMatriz(i, j);
                suma += Math.pow(num, 4);
            }
        }

        tsumpot4imp.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                int elemento = m.getMatriz(i, j);
                if (elemento > 5 && elemento < 15 && elemento % 2 != 0) {
                    suma += elemento;
                    contador++;
                }
            }
        }

        double promedio = 0.0;
        if (contador > 0) {
            promedio = (double) suma / contador;
        }

        tpromnumimp1.setText(String.valueOf(promedio));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int suma = 0;
        int ultimaFila = m.getFilas() - 1;

        for (int j = 0; j < m.getColumnas(); j++) {
            int elemento = m.getMatriz(ultimaFila, j);

            if (elemento % 2 == 0) {
                suma += Math.pow(elemento, 3);
            }
        }

        tparcubultf.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tparcubultfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tparcubultfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tparcubultfActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        double media = 0;
        int contador = 0;

        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                media = media + m.getMatriz(i, j);
                contador++;
            }
        }

        double prom = media / contador;
        tmedia.setText(String.valueOf(prom));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        double[] valores = new double[m.getFilas() * m.getColumnas()];
        int index = 0;

        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                valores[index] = m.getMatriz(i, j);
                index++; //index es un índice o posición dentro de una estructura de datos, como un arreglo o una lista
            }
        }

        double mediana;
        if (valores.length % 2 == 0) {
            int mid = valores.length / 2;
            mediana = (valores[mid - 1] + valores[mid]) / 2.0;
        } else {
            int mid = valores.length / 2;
            mediana = valores[mid];
        }

        tmediana.setText(String.valueOf(mediana));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Map<Double, Integer> frecuencias = new HashMap<>();
        double moda = 0;
        int maxFrecuencia = 0;

        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                double elemento = m.getMatriz(i, j);
                int frecuencia = frecuencias.getOrDefault(elemento, 0) + 1;
                frecuencias.put(elemento, frecuencia);

                if (frecuencia > maxFrecuencia) {
                    moda = elemento;
                    maxFrecuencia = frecuencia;
                }
            }
        }

        tmoda.setText(String.valueOf(moda));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int sumaPrimos = 0;
        for (int i = 0; i < m.getFilas(); i++) {
            int num = m.getMatriz(i, 0);
            if (esPrimo(num)) {
                sumaPrimos = sumaPrimos + num;
            }
        }
        tsumprimcol1.setText(Integer.toString(sumaPrimos));

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int suma = 0;
        int count = 0;

        for (int i = 0; i <= m.getFilas() - 1; i++) {
            for (int j = 0; j <= m.getColumnas() - 1; j++) {
                int num = m.getMatriz(i, j);
                if (num > 5 && num < 13 && esPrimo(num)) {
                    suma = suma + num;
                    count++;
                }
            }
        }

        double promedio = (double) suma / count;
        tpronupri5.setText(String.valueOf(promedio));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int f,g,i,j;

        f=Integer.parseInt(JOptionPane.showInputDialog("No de Filas de la matriz: "));
        g=Integer.parseInt(JOptionPane.showInputDialog("No de Columnas de la matriz: "));
        m.setFilas(f);
        m.setColumnas(g);

        m.crearMatriz();
        for(i=0; i<=m.getFilas()-1; i++)
        {
            for(j=0; j<=m.getColumnas()-1; j++)
            {
                int v=Integer.parseInt(JOptionPane.showInputDialog("Digite el Elemento en la posicion ["+i+","+j+"]"));
                m.setMatriz(i,j,v);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        m.mostrarMatriz();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        double media = 0;
        int contador = 0;

        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                media += m.getMatriz(i, j);
                contador++;
            }
        }

        double prom = media / contador;

        double sumaCuadradosDiferencias = 0;
        for (int i = 0; i < m.getFilas(); i++) {
            for (int j = 0; j < m.getColumnas(); j++) {
                double diferencia = m.getMatriz(i, j) - prom;
                sumaCuadradosDiferencias += diferencia * diferencia;
            }
        }

        double desviacionEstandar = Math.sqrt(sumaCuadradosDiferencias / contador);

        tds.setText(String.valueOf(desviacionEstandar));
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdsActionPerformed

    }//GEN-LAST:event_tdsActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        tuto5 newframe = new tuto5();

        newframe.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField sumabordes;
    private javax.swing.JTextField tds;
    private javax.swing.JTextField tmedia;
    private javax.swing.JTextField tmediana;
    private javax.swing.JTextField tmoda;
    private javax.swing.JTextField tparcubultf;
    private javax.swing.JTextField tprimeraf;
    private javax.swing.JTextField tpromnumimp1;
    private javax.swing.JTextField tpronupri5;
    private javax.swing.JTextField tsegundadiag;
    private javax.swing.JTextField tsumpot4imp;
    private javax.swing.JTextField tsumprimcol1;
    // End of variables declaration//GEN-END:variables
}
