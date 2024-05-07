/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

public class pilaC {
    String [] pilaP;
    int elementos;
    int cima;
    
    
    public pilaC(int cantidad)
    {
      elementos = cantidad;
      pilaP = new String[elementos];
      cima=-1;
    }
    public boolean pilallena(){
        if(cima == elementos -1){
            return(true);
        }
        return(false);
    }
    public boolean pilaVacia(){
        if(cima == 1){
            return(true);
        }
        return(false);
    }
    public void entraElemento(String elem){
        if(!pilallena()){
            cima++;
            pilaP[cima] = elem;
            elementos++;
        }
    }
    public String Vercima(){
        return(pilaP[cima]);
    }
    public String sacarElemento(){
        String aux="";
        if(!pilaVacia()){
            aux = pilaP[cima];
            cima--;
            elementos--;
        }
        return(aux);
    }
        
}
