package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTestCase {
    private Point point;
    private Point point00;
    //crea un escenario donde existe un punto en 00

    @BeforeEach
    public void setUp(){
        point = new Point(5,5);
        point00 = new Point();
    }
    @Test
    public void constructorPointTest(){
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    public void constructorPointOrigenTest(){
        assertEquals(0,point00.getX());
        assertEquals(0,point00.getY());
    }
    @Test
    public void sumarTest(){
        Point punto2 = new Point(10,10);
        Point resultado = point.sumar(punto2);
        assertEquals(15,resultado.getX());
        assertEquals(15,resultado.getY());
    }
    @Test
    public void moverTest(){
        point.mover(10,10);
        assertEquals(10,point.getX());
        assertEquals(10,point.getY());
    }


}
