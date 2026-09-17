package ar.edu.unq.po2.tp3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);
    }

    public void mover(int nuevoX, int nuevoY){
        this.x = nuevoX;
        this.y = nuevoY;
    }

    public Point sumar(Point otroPunto){
        int nuevoX = this.x + otroPunto.getX();
        int nuevoY = this.y + otroPunto.getY();
        return new Point(nuevoX,nuevoY);
    }
    public int getX(){

        return x;
    }
    public int getY(){
        return y;
    }


}
