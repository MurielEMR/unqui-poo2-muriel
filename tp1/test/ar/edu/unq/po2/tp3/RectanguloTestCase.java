package ar.edu.unq.po2.tp3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTestCase {
    private Rectangulo rectangulo;
    @BeforeEach
    public void setUp(){
        rectangulo = new Rectangulo(new Point(), new Point(5,5));
    }
    @Test

    public void getAnchoTest(){
        assertEquals(5,rectangulo.getAncho());
    }
    @Test
    public void getAltoTest(){
        assertEquals(5,rectangulo.getAlto());
    }
    @Test
    public void getAreaTest(){
        assertEquals(25,rectangulo.getArea());
    }


}
