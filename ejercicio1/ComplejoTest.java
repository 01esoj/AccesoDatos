package tema0.entregajaf.ejercicio1;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo complejoLleno = new Complejo(4.1, 6.2);
        Complejo complejoVacio = new Complejo();
        Complejo complejoSumado = new Complejo();

        System.out.println("COMPLEJOS INICIALES");
        System.out.print("Complejo Lleno: \t");
        complejoLleno.imprimir();
        System.out.print("Complejo Vacio: \t");
        complejoVacio.imprimir();

        complejoVacio.asignar(1.8, 9.5);
        System.out.println("COMPLEJOS DESPUES DE SUMAR");
        complejoSumado.sumar(complejoLleno, complejoVacio);
        System.out.print("Complejo Lleno: \t");
        complejoLleno.imprimir();
        System.out.print("Complejo Vacio: \t");
        complejoVacio.imprimir();
        System.out.print("Complejo Sumado: \t");
        complejoSumado.imprimir();
    }
}
