package tema0.entregajaf.ejercicio3;

public class ParkingTestJoseAF {
    public static void main(String[] args) throws Exception{
        try{
            ParkingVehiculo pruebaParkingVehiculo = new ParkingVehiculo("hl");
            Vehiculo coche1 = new Vehiculo("2438fgjdh");
            
            pruebaParkingVehiculo.aparcaCoche(coche1);
            Thread.sleep(120*1000);
            pruebaParkingVehiculo.sacaCoche(coche1);

            System.out.println(coche1+"; Factura = "+pruebaParkingVehiculo.getFactura(coche1));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}