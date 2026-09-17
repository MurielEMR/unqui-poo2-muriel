package ar.edu.unq.po2.tp3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultioperadorTestCase {
    private Multioperador multioperador;
    //da estos numeros para todos los testeos
    @BeforeEach
    public void setUp() {
        multioperador = new Multioperador();

        multioperador.addNumber(5);
        multioperador.addNumber(10);
        multioperador.addNumber(4);
        multioperador.addNumber(6);
    }
        @Test

        public void sumarArregloTest(){
        //prueba normal
        assertEquals(25,multioperador.sumarArreglo());
        //prueba lista vacia
        multioperador.limpiarArreglo();
        assertEquals(0, multioperador.sumarArreglo());
        //con un numero solo
        multioperador.addNumber(10);
        assertEquals(10,multioperador.sumarArreglo());


        //Solo con negativos
        multioperador.limpiarArreglo();
        multioperador.addNumber(-5);
        multioperador.addNumber(-10);
        multioperador.addNumber(-4);
        multioperador.addNumber(-6);
        assertEquals(-25,multioperador.sumarArreglo());

    }

    @Test
    public void restarArregloTest(){
        //operacion normal
        multioperador.restarArreglo();//es un numero al aire, no se modifica
        assertEquals(-25,multioperador.restarArreglo());

        //operacion con lista vacia
        multioperador.limpiarArreglo();
        assertEquals(0,multioperador.restarArreglo());



    }
    @Test
    public void multiplicarArregloTest(){
        assertEquals(1200,multioperador.productoArreglo());
    }

}
