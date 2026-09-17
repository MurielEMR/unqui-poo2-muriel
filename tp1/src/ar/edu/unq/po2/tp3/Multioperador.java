package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void addNumber(int number){
        numeros.add(number);
    }
    public int sumarArreglo(){
        int sumatoria = 0;
        for (int numero: numeros){
            sumatoria+=numero;
        }
        return sumatoria;
    }
    public int restarArreglo(){
        int resto = 0;
        for (int numero : numeros){
            resto -=numero;
        }
        return resto;
    }
    public int productoArreglo(){
        int multiplicado = 1;
        for(int numero : numeros){
            multiplicado = multiplicado * numero;
        }
        return multiplicado;
    }
    public void limpiarArreglo(){
        numeros.clear();
    }

}
