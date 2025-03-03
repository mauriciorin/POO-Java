package TallerNo1;
import java.util.Scanner;

public class RReporteInternos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, condena, contador = 0;
        String nombre;

        // Capturar la cantidad de internos
        System.out.print("Ingrese la cantidad de internos registrados: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            System.out.print("Ingrese nuevamente la cantidad de internos: ");
            scanner.next();
        }
        n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Error: La cantidad de internos debe ser mayor que cero.");
            System.out.print("Ingrese nuevamente la cantidad de internos: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de internos: ");
                scanner.next();
            }
            n = scanner.nextInt();
        }

        System.out.println("\n===== Registro de internos =====");
        String reporte = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("\nIngrese el nombre del interno " + i + ": ");
            scanner.nextLine(); // Limpiar buffer
            nombre = scanner.nextLine();

            System.out.print("Ingrese la condena en meses de " + nombre + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la condena en meses: ");
                scanner.next();
            }
            condena = scanner.nextInt();

            while (condena < 0) {
                System.out.println("Error: La condena no puede ser negativa.");
                System.out.print("Ingrese nuevamente la condena en meses: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente la condena en meses: ");
                    scanner.next();
                }
                condena = scanner.nextInt();
            }

            // Registrar internos con condena menor a 36 meses
            if (condena < 36) {
                reporte += "Interno: " + nombre + " | Condena: " + condena + " meses\n";
                contador++;
            }
        }

        // Mostrar el reporte final
        System.out.println("\n===== INTERNOS CON CONDENA MENOR A 36 MESES =====");
        if (contador > 0) {
            System.out.println(reporte);
            System.out.println("Total de internos con condena menor a 36 meses: " + contador);
        } else {
            System.out.println("No hay internos con condenas menores a 36 meses.");
        }

        scanner.close();
    }
}
