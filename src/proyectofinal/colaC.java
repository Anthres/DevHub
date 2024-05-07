/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;


public class colaC {
    String[] colaC;
    int elementos;
    int frente;
    int fin;

    public colaC(int cantidad) {
        elementos = cantidad;
        colaC = new String[elementos];
        frente = -1;
        fin = -1;
    }

    public boolean colaVacia() {
        if (frente == -1 && fin == -1) {
            return true;
        }
        return false;
    }

    public boolean colaLlena() {
        if ((fin + 1) % elementos == frente) {
            return true;
        }
        return false;
    }

    public void encolar(String elem) {
        if (!colaLlena()) {
            if (colaVacia()) {
                frente = 0;
            }
            fin = (fin + 1) % elementos;
            colaC[fin] = elem;
        }
    }

    public String desencolar() {
        String aux = "";
        if (!colaVacia()) {
            aux = colaC[frente];
            if (frente == fin) {
                frente = -1;
                fin = -1;
            } else {
                frente = (frente + 1) % elementos;
            }
        }
        return aux;
    }

    public String verFrente() {
        return colaC[frente];
    }
}
