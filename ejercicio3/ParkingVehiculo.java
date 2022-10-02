package tema0.entregajaf.ejercicio3;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ParkingVehiculo implements Parking{
    //Constantes
    private final static double PRECIO_POR_MINUTO = 0.0425;
    private final static int MAXIMO_PLAZAS = 100;

    //Atributos
    private String sDireccionParking;
    private int iPlazasActualesOcupadas;

    //Constructor
    public ParkingVehiculo(String sDireccionParking) {
        this.sDireccionParking = sDireccionParking;
    }

    //Metodos
    @Override
    public void aparcaCoche(Vehiculo v) {
        if(hayPlaza()){
            ArrayList<Vehiculo> parking = new ArrayList<Vehiculo>();
            parking.add(v);
            setiPlazasActualesOcupadas(getiPlazasActualesOcupadas()+1);
        }else{
            System.out.println("No se puede aparcar");
        }
    }

    @Override
    public double getFactura(Vehiculo v) {
        double factura = v.getdFechaInicio().until(v.getdFechaFin(), ChronoUnit.MINUTES) * PRECIO_POR_MINUTO;
        return factura;
    }

    @Override
    public boolean hayPlaza() {
        if(MAXIMO_PLAZAS > getiPlazasActualesOcupadas())
            return true;
        else
            return false;
    }

    @Override
    public void sacaCoche(Vehiculo v) {
        ArrayList<Vehiculo> parking = new ArrayList<Vehiculo>();
        parking.remove(v);
        setiPlazasActualesOcupadas(getiPlazasActualesOcupadas()-1);
    }

    public static double getPrecioPorMinuto() {
        return PRECIO_POR_MINUTO;
    }

    public static int getMaximoPlazas() {
        return MAXIMO_PLAZAS;
    }

    public String getsDireccionParking() {
        return sDireccionParking;
    }

    public void setsDireccionParking(String sDireccionParking) {
        this.sDireccionParking = sDireccionParking;
    }

    public int getiPlazasActualesOcupadas() {
        return iPlazasActualesOcupadas;
    }

    public void setiPlazasActualesOcupadas(int iPlazasActualesOcupadas) {
        this.iPlazasActualesOcupadas = iPlazasActualesOcupadas;
    }
}
