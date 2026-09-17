package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuadradoTestCase {
    private Cuadrado cuadrado;

    @BeforeEach

    public void setUp(){

        cuadrado = new Cuadrado (new Point(), 5);

    }
    @Test
    public void cuadradoCreadoTest(){
        assertEquals(25,cuadrado.getArea());
        assertEquals(5,cuadrado.getAlto());
    }
}
