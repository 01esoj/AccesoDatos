package tema0.entregajaf.ejercicio4;

public class Punto {
    //Atributos
    protected int iCoordenadaX, iCoordenadaY;
    
    //Constructor
    public Punto(int iCoordenadaX, int iCoordenadaY) {
        this.iCoordenadaX = iCoordenadaX;
        this.iCoordenadaY = iCoordenadaY;
    }

    //Metodos
    public int getiCoordenadaX() {
        return iCoordenadaX;
    }

    public void setiCoordenadaX(int iCoordenadaX) {
        this.iCoordenadaX = iCoordenadaX;
    }

    public int getiCoordenadaY() {
        return iCoordenadaY;
    }

    public void setiCoordenadaY(int iCoordenadaY) {
        this.iCoordenadaY = iCoordenadaY;
    }
    
    public double distancia(Punto paramPunto){
        return Math.sqrt(Math.pow((getiCoordenadaX()-paramPunto.getiCoordenadaX()), 2)
                        +Math.pow((getiCoordenadaY()-paramPunto.getiCoordenadaY()), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Punto [iCoordenadaX=" + iCoordenadaX + ", iCoordenadaY=" + iCoordenadaY + "]";
    }
}
