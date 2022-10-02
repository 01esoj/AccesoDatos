package tema0.entregajaf.ejercicio1;

public class Complejo {
    private double dPReal;
    private double dPImag;

    public Complejo() {
        dPReal = 0;
        dPImag = 0;
    }

    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    public void asignar(double dPReal, double dPImag){
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    public void sumar(Complejo c1, Complejo c2){
        dPImag = Math.round((c1.getdPImag() + c2.getdPImag())*10.0)/10.0;
        dPReal = Math.round((c1.getdPReal() + c2.getdPReal())*10.0)/10.0;
    }

    public void imprimir(){
        System.out.println("dPImag: "+dPImag+"\tdPReal: "+dPReal);
    }
}
