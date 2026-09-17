package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private Point noroeste;
    private Point sureste;

    public Rectangulo(Point noroeste, Point sureste){
        if(noroeste.getX()>= sureste.getX() || noroeste.getY() >= sureste.getY()){
            throw new RuntimeException("Los valores del sureste deben ser mayores para el rectangulo");
        }
        this.noroeste = noroeste;
        this.sureste = sureste;
    }
    public int getAncho(){
        return sureste.getX() - noroeste.getX();
    }
    public int getAlto(){
        return sureste.getY() - noroeste.getY();
    }
    public int getArea(){
        //area es base*altura
        return this.getAncho() * this.getAlto();
    }
    public int getPerimetro(){
        return this.getAncho()*2 + this.getAlto()*2;
    }
}
