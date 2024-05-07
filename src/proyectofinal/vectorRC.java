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
public class vectorRC {
    int num[];
    int nump;
  
    
  



    public vectorRC()
 {
     num=null;
     nump=0;
 } 
   public void crearVector()
 {
     num=new int [nump];
 }

  public void setnum(int p,int ve)
  {
       num[p]=ve;
  }

  public int getnum(int p)
  {
        return num[p];
  }

  public void setnump(int ne)
  {
       nump = ne;
  }

  public int getnump()
    {
        return nump;
    }
 public void llenarVector()
  {
      int n=Integer.parseInt(JOptionPane.showInputDialog("""
                                                         Digite El Numero De Notas
                                                         Del Curso: """));
      setnump(n);

      crearVector();

      for(int i=0;i<getnump();i++)
      {
          int ve=Integer.parseInt(JOptionPane.showInputDialog("Digite La Nota Numero: "+i+":"));
          setnum(i,ve);
      }
  }
 
}
