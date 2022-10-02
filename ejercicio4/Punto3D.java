package tema0.entregajaf.ejercicio4;

public class Punto3D extends Punto{
    //Atributos
    private int iCoordenadaZ;

    //Constructor
    public Punto3D(int iCoordenadaX, int iCoordenadaY, int iCoordenadaZ) {
        super(iCoordenadaX, iCoordenadaY);
        this.iCoordenadaZ = iCoordenadaZ;
    }

    //Metodos
    public int getiCoordenadaZ() {
        return iCoordenadaZ;
    }

    public void setiCoordenadaZ(int iCoordenadaZ) {
        this.iCoordenadaZ = iCoordenadaZ;
    }

    public double distancia(Punto3D paramPunto) {
        return Math.sqrt(Math.pow((getiCoordenadaX()-paramPunto.getiCoordenadaX()), 2)
                        +Math.pow((getiCoordenadaY()-paramPunto.getiCoordenadaY()), 2)
                        +Math.pow((getiCoordenadaZ()-paramPunto.getiCoordenadaZ()), 2));
    }

    @Override
    public String toString() {
        return super.toString()+" Punto3D [iCoordenadaZ=" + iCoordenadaZ + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else
            return false;
    }
}
