package tema0.entregajaf.ejercicio4;

public class PuntoTestJoseAF {
    public static void main(String[] args) throws Exception{
        Punto punto1 = new Punto(4, 2);
        Punto punto2 = new Punto(6, 3);
        Punto3D punto3D1 = new Punto3D(7, 2, 8);
        Punto3D punto3D2 = new Punto3D(7, 2, 8);

        if(punto1.equals(punto2)){
            System.out.println("Las coordenadas del "+punto1.toString()+" y del "+punto2.toString()+" son las mismas");
        }else{
            System.out.println("Las coordenadas del "+punto1.toString()+" y del "+punto2.toString()+" no son las mismas");
        }

        if(punto3D1.equals(punto3D2)){
            System.out.println("Las coordenadas del "+punto3D1.toString()+" y del "+punto3D2.toString()+" son las mismas");
        }else{
            System.out.println("Las coordenadas del "+punto3D1.toString()+" y del "+punto3D2.toString()+" no son las mismas");
        }
    }
}
