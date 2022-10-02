package tema0.entregajaf.ejercicio4;

public class Sucesos {
    //Atributos
    private int iTiempo;
    private String sDescripcionSuceso;

    //Constructor
    public Sucesos(int iTiempo, String sDescripcionSuceso) {
        this.iTiempo = iTiempo;
        this.sDescripcionSuceso = sDescripcionSuceso;
    }
    
    //Metodos
    public int getiTiempo() {
        return iTiempo;
    }

    public void setiTiempo(int iTiempo) {
        this.iTiempo = iTiempo;
    }

    public String getsDescripcionSuceso() {
        return sDescripcionSuceso;
    }

    public void setsDescripcionSuceso(String sDescripcionSuceso) {
        this.sDescripcionSuceso = sDescripcionSuceso;
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
        return "Sucesos [iTiempo=" + iTiempo + ", sDescripcionSuceso=" + sDescripcionSuceso + "]";
    }
    
}
