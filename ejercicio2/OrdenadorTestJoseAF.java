package tema0.entregajaf.ejercicio2;

public class OrdenadorTestJoseAF {
    public static void main(String[] args) {
        //Creo los objetos
        OrdenadorPortatil ordPortatil = new OrdenadorPortatil("47825G", "i7-11400H", 8, 950, 2);
        OrdenadorSobremesa ordSobremesa = new OrdenadorSobremesa("95738R", "i9-12400K", 32, 1650, "E-ATX");

        //Llamo a ambos toString
        System.out.println(ordPortatil.toString());
        System.out.println(ordSobremesa.toString());

        //Cambio un par de valores
        ordPortatil.setiRAM(16);
        ordSobremesa.setiPrecio(1500);

        //Llamo de nuevo a ambos toString para comprobar que los cambios se han hecho correctamente
        System.out.println(ordPortatil.toString());
        System.out.println(ordSobremesa.toString());
    }
}
