package tema0.entregajaf.ejercicio3;

import java.time.LocalDateTime;

public class Vehiculo{
    //Atributos
    private String sMatricula;
    private LocalDateTime dFechaInicio, dFechaFin;

    //Constructor
    public Vehiculo(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    
    //Metodos
    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public LocalDateTime getdFechaInicio() {
        return dFechaInicio;
    }

    public void setdFechaInicio(LocalDateTime dFechaInicio) {
        this.dFechaInicio = dFechaInicio;
    }

    public LocalDateTime getdFechaFin() {
        return dFechaFin;
    }

    public void setdFechaFin(LocalDateTime dFechaFin) {
        this.dFechaFin = dFechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [sMatricula=" + sMatricula + ", dFechaInicio=" + dFechaInicio + ", dFechaFin=" + dFechaFin + "]";
    }
}
