package tema0.entregajaf.ejercicio2;

public class Ordenador {
    //Atributos
    private String sCodigo, sCPU;
    private int iRAM, iPrecio;
    
    //Constructor
    public Ordenador(String paramCodigo, String paramCPU, int paramRAM, int paramPrecio) {
        this.sCodigo = paramCodigo;
        this.sCPU = paramCPU;
        this.iRAM = paramRAM;
        this.iPrecio = paramPrecio;
    }

    //Metodos
    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }

    public int getiRAM() {
        return iRAM;
    }

    public void setiRAM(int iRAM) {
        this.iRAM = iRAM;
    }

    public int getiPrecio() {
        return iPrecio;
    }

    public void setiPrecio(int iPrecio) {
        this.iPrecio = iPrecio;
    }

    @Override
    public String toString() {
        return "Ordenador [iPrecio=" + iPrecio + " euros, iRAM=" + iRAM + " GB, sCPU=" + sCPU + ", sCodigo=" + sCodigo + "]\t";
    }

    
}
