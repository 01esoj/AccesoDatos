package tema0.entregajaf.ejercicio2;

public class OrdenadorPortatil extends Ordenador{
    //Atributos
    private double dPeso;

    //Constructor
    public OrdenadorPortatil(String paramCodigo, String paramCPU, int paramRAM, int paramPrecio, double paramPeso) {
        super(paramCodigo, paramCPU, paramRAM, paramPrecio);
        this.dPeso = paramPeso;
    }

    //Metodos
    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    @Override
    public String toString() {
        return super.toString()+"OrdenadorPortatil [dPeso=" + dPeso + " kg]";
    }

    
    
}
