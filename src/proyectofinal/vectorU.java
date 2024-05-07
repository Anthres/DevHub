/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaVector.java
 *
 * Created on 14/04/2009, 06:28:12 AM
 */

package proyectofinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author programacion2
 */
public class vectorU extends javax.swing.JFrame {

 DeclararVector v=new DeclararVector();
 int cont=0;
 
    public vectorU() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/DevHuvbn.png")).getImage());
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nEle = new javax.swing.JTextField();
        bElementos = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        bAñadir = new javax.swing.JButton();
        bMostrar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        verElementos = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        verElementosOrdenados = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Barra1 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Vector");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Trabajar con Vector");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 170, 30);

        jLabel2.setText("No. Elementos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 110, 16);

        nEle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nEleActionPerformed(evt);
            }
        });
        getContentPane().add(nEle);
        nEle.setBounds(100, 60, 80, 22);

        bElementos.setText("Ok");
        bElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bElementosActionPerformed(evt);
            }
        });
        getContentPane().add(bElementos);
        bElementos.setBounds(200, 60, 108, 23);

        jLabel3.setText("Dato a Añadir:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 100, 20);
        getContentPane().add(Dato);
        Dato.setBounds(100, 100, 80, 22);

        bAñadir.setText("Añadir");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(bAñadir);
        bAñadir.setBounds(200, 100, 110, 23);

        bMostrar.setText("Mostrar");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bMostrar);
        bMostrar.setBounds(10, 300, 90, 23);

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(bLimpiar);
        bLimpiar.setBounds(320, 100, 90, 23);

        verElementos.setColumns(20);
        verElementos.setRows(5);
        jScrollPane1.setViewportView(verElementos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 150, 130);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(790, 30, 0, 800);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(790, -7, 0, 840);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(720, 3, 0, 820);

        jLabel17.setText("Por: Andres Pantoja");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1100, 10, 130, 16);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel19.setText("Desplegar datos del Vector:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 20));

        jButton5.setText("ShellSort");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, -1));

        jButton1.setText("Invertido Selection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 140, -1));

        jToggleButton1.setText("Normal Selection");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 140, -1));

        jButton3.setText("InsertionSort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 120, -1));

        jButton11.setText("MergeSort");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, -1));

        jButton13.setText("Regresar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 110, -1));

        verElementosOrdenados.setColumns(20);
        verElementosOrdenados.setRows(5);
        jScrollPane2.setViewportView(verElementosOrdenados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, 180));

        jButton7.setText("Búrbuja");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, -1));

        jButton8.setText("Mostrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 80, -1));

        jButton9.setText("Invertido Quick");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 140, -1));

        jToggleButton2.setText("Normal Quick");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 140, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 470, 10));

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel18.setText("Resultado ordenado:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, 20));

        jButton4.setText("¿Como funciona?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 30, 480, 590);

        Barra1.setBackground(new java.awt.Color(246, 246, 246));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/v2icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1devhub.png"))); // NOI18N

        javax.swing.GroupLayout Barra1Layout = new javax.swing.GroupLayout(Barra1);
        Barra1.setLayout(Barra1Layout);
        Barra1Layout.setHorizontalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addGap(7, 7, 7))
        );
        Barra1Layout.setVerticalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra1Layout.createSequentialGroup()
                .addGroup(Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Barra1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Barra1);
        Barra1.setBounds(0, 0, 480, 38);

        setSize(new java.awt.Dimension(476, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bElementosActionPerformed

        int n=Integer.parseInt(nEle.getText());
        v.setNumEle(n);
        v.crearVector();
        JOptionPane.showMessageDialog(null, "Tamaño Asignado");
        verElementos.setText("");
        nEle.setText("");
        Dato.grabFocus();

    }//GEN-LAST:event_bElementosActionPerformed

    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed

       if(cont<v.getNumEle())
       {
           int ele=Integer.parseInt(Dato.getText());
           v.setNum(cont, ele);
           verElementos.append(""+v.getNum(cont)+"\n");
           cont++;
       }
       else
       {
           verElementos.setText("No se puede añadir otro elemento");
       }
       Dato.setText("");
       Dato.grabFocus();


    }//GEN-LAST:event_bAñadirActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed

     // v.crearVector();
      nEle.setText("");
      Dato.setText("");
      verElementos.setText("");
      nEle.grabFocus();
      cont=0;
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed

     verElementos.setText("");

     int i;

     for(i=0; i<v.getNumEle();i++)
     {
         verElementos.append(""+v.getNum(i)+"\n");
     }
    }//GEN-LAST:event_bMostrarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int aux;
        for (int i=0; i<v.getNumEle(); i++)
            {
                for (int j=i+1; j<v.getNumEle(); j++)
                    {
                        if(v.getNum(i)>v.getNum(j))
                            {
                                aux = v.getNum(i);
                                v.setNum(i, v.getNum(j));
                                v.setNum(j, aux);
                            }
                    }
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        verElementosOrdenados.setText("");
        int i;

        for(i=0; i<v.getNumEle();i++)
        {
         verElementosOrdenados.append(""+v.getNum(i)+"\n");
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nEleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nEleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nEleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int imax;
int aux;
for (int i = 0; i < v.getNumEle(); i++) {
    imax = i;
    for (int j = i + 1; j < v.getNumEle(); j++) {
        if (v.getNum(j) > v.getNum(imax)) {
            imax = j;
        }
    }
    aux = v.getNum(i);
    v.setNum(i, v.getNum(imax));
    v.setNum(imax, aux);
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    for (int i = 1; i < v.getNumEle(); i++) {
        int temp = v.getNum(i);
        int Izq = 0;
        int Der = i - 1;
    while (Izq <= Der) {
        int Medio = (Izq + Der) / 2;
        if (temp < v.getNum(Medio))
            Der = Medio - 1;
        else
            Izq = Medio + 1;
    }
    for (int j = i - 1; j >= Izq; j--) {
        v.setNum(j+1, v.getNum(j));
    }
    v.setNum(Izq, temp);
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    int h = v.getNumEle() / 2;
    int i;
    while (h > 0) {
        for (i = h; i < v.getNumEle(); i++) {
            int B = v.getNum(i);
            int j;
        for (j = i; j >= h && v.getNum(j - h) > B; j -= h) {
            v.setNum(j, v.getNum(j - h));
        }
        v.setNum(j, B);
    }
    h = h / 2;
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
int ind_izq = 0;
int ind_der = v.getNumEle() - 1;

int i, j;
int elem;
i = ind_izq;
j = ind_der;
elem = v.getNum((ind_izq + ind_der) / 2);
do {
    while (v.getNum(i) > elem) {
        i++;
    }
    while (elem > v.getNum(j)) {
        j--;
    }
    if (i <= j) {
        int aux = v.getNum(i);
        v.setNum(i, v.getNum(j));
        v.setNum(j, aux);
        i++;
        j--;
    }
} while (i <= j);
if (ind_izq < j) {
    int aux = v.getNum(ind_izq);
    v.setNum(ind_izq, v.getNum(j));
    v.setNum(j, aux);
}
if (i < ind_der) {
    int aux = v.getNum(i);
    v.setNum(i, v.getNum(ind_der));
    v.setNum(ind_der, aux);
}




    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 int izq = 0;
int der = 0;
int centro;
if (izq < der) {
    centro = (izq + der) / 2;
    v.setNum(izq, centro);
    v.setNum(centro + 1, der);
    v.setNum(izq, v.getNum(der));

}

int k = 0;
int c = 0;
int n;
int b = 0;
int a = 0;
int i = a;
int j = c + 1;
n = b - a;
while (i < c + 1 && j < b + 1) {
    if (v.getNum(i) < v.getNum(j)) {
        v.setNum(k, v.getNum(i));
        i = i + 1;
    } else {
        v.setNum(k, v.getNum(j));
        j = j + 1;
    }
    k = k + 1;
}
while (i < c + 1) {
    v.setNum(k, v.getNum(i));
    i++;
    k++;
}
while (j < b + 1) {
    v.setNum(k, v.getNum(j));
    j++;
    k++;
}
i = a;
for (k = 0; k < n; k++) {
    v.setNum(i, v.getNum(k));
    i++;
}

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
             int imin;
     int aux;
       for (int i = 0; i < v.getNumEle(); i++) {
           imin = i;
         for (int j = i + 1; j < v.getNumEle(); j++) {
            if (v.getNum(j) < v.getNum(imin)) {
            imin = j;
        }
    }
    aux = v.getNum(i);
    v.setNum(i, v.getNum(imin));
    v.setNum(imin, aux);
}
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        int ind_izq = 0;
int ind_der = v.getNumEle() - 1;

int i, j;
int elem;
i = ind_izq;
j = ind_der;
elem = v.getNum((ind_izq + ind_der) / 2);
do {
    while (v.getNum(i) < elem){
        i++;
    }
    while (elem < v.getNum(j)){
        j--;
    }
    if (i <= j) {
        int aux = v.getNum(i);
        v.setNum(i, v.getNum(j));
        v.setNum(j, aux);
        i++;
        j--;
    }
} while (i <= j);
if (ind_izq < j) {
    int aux = v.getNum(ind_izq);
    v.setNum(ind_izq, v.getNum(j));
    v.setNum(j, aux);
}
if (i < ind_der) {
    int aux = v.getNum(i);
    v.setNum(i, v.getNum(ind_der));
    v.setNum(ind_der, aux);
}

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tuto3 newframe = new tuto3();

        newframe.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vectorU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra1;
    private javax.swing.JTextField Dato;
    private javax.swing.JButton bAñadir;
    private javax.swing.JToggleButton bElementos;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField nEle;
    private javax.swing.JTextArea verElementos;
    private javax.swing.JTextArea verElementosOrdenados;
    // End of variables declaration//GEN-END:variables

}
