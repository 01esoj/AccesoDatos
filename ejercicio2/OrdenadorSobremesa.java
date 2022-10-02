package tema0.entregajaf.ejercicio2;

public class OrdenadorSobremesa extends Ordenador{
    //Atributos
    private String sTipoTorre;

    //Constructor
    public OrdenadorSobremesa(String paramCodigo, String paramCPU, int paramRAM, int paramPrecio, String sTipoTorre) {
        super(paramCodigo, paramCPU, paramRAM, paramPrecio);
        this.sTipoTorre = sTipoTorre;
    }

    //Metodos
    public String getsTipoTorre() {
        return sTipoTorre;
    }

    public void setsTipoTorre(String sTipoTorre) {
        this.sTipoTorre = sTipoTorre;
    }

    @Override
    public String toString() {
        return super.toString()+"OrdenadorSobremesa [sTipoTorre=" + sTipoTorre + "]";
    }

    
}
