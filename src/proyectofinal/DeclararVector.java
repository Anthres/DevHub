 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion2
 */
public class DeclararVector
{

    int num[];
    int numEle;

 public DeclararVector()
 {
     num=null;
     numEle=0;
 }
 public void crearVector()
 {
     num=new int [numEle];
 }

  public void setNum(int p,int ve)
  {
       num[p]=ve;
  }

  public int getNum(int p)
  {
        return num[p];
  }

  public void setNumEle(int ne)
  {
       numEle = ne;
  }

  public int getNumEle()
    {
        return numEle;
    }
  public void llenarVector()
  {
      int n=Integer.parseInt(JOptionPane.showInputDialog("Digite El Numero De Notas"+"\n"+ "Del Curso: "));
      setNumEle(n);

      crearVector();

      for(int i=0;i<getNumEle();i++)
      {
          int ve=Integer.parseInt(JOptionPane.showInputDialog("Digite La Nota Numero: "+i+":"));
          setNum(i,ve);
      }
  }

}
