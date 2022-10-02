package tema0.entregajaf.ejercicio3;

public interface Parking {
    
    public boolean hayPlaza();
    public void aparcaCoche(Vehiculo v);
    public void sacaCoche(Vehiculo v);
    public double getFactura(Vehiculo v); 
}
