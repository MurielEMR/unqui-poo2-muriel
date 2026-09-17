package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;


public class Counter {
    List<Integer> numbers = new ArrayList<Integer>();
    public void addNumber(int number){
        numbers.add(number);
    }
    public int getEvenOccurrences(){
        int contador = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                contador = contador + 1;
            }
        }
        return contador;
    }
    public int getOddOccurrences(){
        int contador =0;
        for (int number : numbers){
            if(number %2 !=0 ){
                contador = contador +1;
            }
        }
        return contador;
    }
    //Numero del que quiero saber los multiplos
    public int getMultiplesOf(int n) {
        int contador = 0;
        for (int number : numbers){
            if (number % n ==0) {
                contador = contador + 1;
            }
        }
        return contador ;
    }
    public int numeroConMayorDigitosPares(int[] numbers) {
        int mayor = 0;
        for (int numero : numbers) {
            mayor = mayorCantidadDigitosParesEntre(mayor, numero);
        }
        return mayor;
    }

    public int mayorCantidadDigitosParesEntre(int numero1, int numero2) {
        if (cantidadDigitosPares(numero1) > cantidadDigitosPares(numero2)) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public int cantidadDigitosPares(int numero) {
        int contador = 0;
        while (numero != 0) {
            int cifra = numero % 10;
            numero /= 10;
            contador += unoSi(esPar(cifra));
        }
        return contador;
    }

    public int unoSi(boolean condicion) {
        if (condicion) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public boolean esPar(int numero) {
        return numero % 2 == 0 ;
    }
}
