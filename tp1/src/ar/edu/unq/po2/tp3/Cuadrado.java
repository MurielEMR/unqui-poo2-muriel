package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Point noroeste, int lado) {
        super(noroeste, new Point(noroeste.getX() + lado, noroeste.getY() + lado));
    }
}
