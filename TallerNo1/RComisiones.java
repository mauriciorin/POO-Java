package TallerNo1;
import java.util.Scanner;

public class RComisiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, numVendedor;
        double venta, comision;
        String zona;

        // Solicitar la cantidad de vendedores
        System.out.print("Ingrese la cantidad de vendedores: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            System.out.print("Ingrese nuevamente la cantidad de vendedores: ");
            scanner.next();
        }
        n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            System.out.print("Ingrese nuevamente la cantidad de vendedores: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de vendedores: ");
                scanner.next();
            }
            n = scanner.nextInt();
        }

        System.out.println("\n===== Registro de vendedores =====");

        for (int i = 1; i <= n; i++) {
            // Captura del número de vendedor
            System.out.print("\nIngrese el número del vendedor " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el número de vendedor: ");
                scanner.next();
            }
            numVendedor = scanner.nextInt();

            // Captura de la venta
            System.out.print("Ingrese el monto de la venta del vendedor: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el monto de la venta: ");
                scanner.next();
            }
            venta = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            // Validar la zona de venta
            do {
                System.out.print("Ingrese la zona de venta (Norte, Sur, Oriente, Poniente, Centro): ");
                zona = scanner.nextLine().trim().toLowerCase();

                if (!zona.equals("norte") && !zona.equals("sur") && !zona.equals("oriente") &&
                    !zona.equals("poniente") && !zona.equals("centro")) {
                    System.out.println("Error: Zona inválida. Intente nuevamente.");
                }
            } while (!zona.equals("norte") && !zona.equals("sur") && !zona.equals("oriente") &&
                     !zona.equals("poniente") && !zona.equals("centro"));

            // Calcular la comisión según la zona de venta
            switch (zona) {
                case "norte":
                    comision = venta * 0.20;
                    break;
                case "sur":
                    comision = venta * 0.18;
                    break;
                case "oriente":
                    comision = venta * 0.17;
                    break;
                case "poniente":
                    comision = venta * 0.21;
                    break;
                case "centro":
                    comision = venta * 0.15;
                    break;
                default:
                    comision = 0; // No debería llegar aquí, pero es una seguridad extra.
            }

            // Mostrar resultado
            System.out.println("Vendedor #" + numVendedor + " | Zona: " + zona.substring(0, 1).toUpperCase() + zona.substring(1)
                    + " | Venta: $" + venta + " | Comisión: $" + comision);
        }

        scanner.close();
    }
}
