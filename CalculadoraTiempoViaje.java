import java.util.Scanner;

public class CalculadoraTiempoViaje {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la distancia entre las dos ciudades (en kilómetros): ");
            double distancia = scanner.nextDouble();

            
            System.out.print("Ingrese la velocidad constante de la bicicleta (en km/h): ");
            double velocidad = scanner.nextDouble();

            
            double tiempo = distancia / velocidad;

            
            System.out.println("El tiempo necesario para llegar de una ciudad a otra es: " + tiempo + " horas");
        }
    }
}
