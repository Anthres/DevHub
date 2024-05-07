/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Tijex
 */
public class matricesC {
    private int matriz[][];
    private int filas;
    private int columnas;

public matricesC()
{
    matriz=null;
    filas=0;
    columnas=0;
}
public void crearMatriz()
{
    matriz=new int [filas][columnas];
}
public void setMatriz(int f, int c, int val)
{
    matriz[f][c]=val;
}
public int getMatriz(int f, int c)
{
    return matriz[f][c];
}
public void setFilas(int f)
{
      filas = f;
 }

 public int getFilas()
 {
        return filas;
 }

 public void setColumnas(int c)
 {
        columnas = c;
 }

public int getColumnas()
{
        return columnas;
}
public void mostrarMatriz()
{
    int i,j;
    String datosM="";
    for(i=0; i<=getFilas()-1; i++)
    {
         for(j=0; j<=getColumnas()-1; j++)
         {

             datosM=datosM+String.valueOf(getMatriz(i,j)+" \t "+" \t ");
         }

         datosM=datosM+" \n "+" \n ";
    }

    JOptionPane.showMessageDialog(null,"DATOS DE LA MATRIZ"+"\n"+datosM);

}

    double getMatriz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
