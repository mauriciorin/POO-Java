package TallerNo1;
import java.util.Scanner;

public class RHeladeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRECIO_LIMON = 2500, PRECIO_NUEZ = 2800, PRECIO_LULO = 2600, 
                  PRECIO_FRESA = 2000, PRECIO_CREMA = 3000;
        int totalLimon = 0, totalNuez = 0, totalLulo = 0, totalFresa = 0, totalCrema = 0;
        int cantidad, opcion;
        String continuar;

        System.out.println("Bienvenido al sistema de reporte semanal de ventas.");
        System.out.println("Sabores disponibles:");
        System.out.println("1. Limón - $2500");
        System.out.println("2. Nuez - $2800");
        System.out.println("3. Lulo - $2600");
        System.out.println("4. Fresa - $2000");
        System.out.println("5. Crema - $3000");

        do {
            // Capturar el sabor de la paleta
            System.out.print("\nIngrese el número del sabor de la paleta vendida (1-5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el número del sabor (1-5): ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            while (opcion < 1 || opcion > 5) {
                System.out.println("Error: Opción inválida. Ingrese un número entre 1 y 5.");
                System.out.print("Ingrese nuevamente el número del sabor: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente el número del sabor: ");
                    scanner.next();
                }
                opcion = scanner.nextInt();
            }

            // Capturar la cantidad de paletas vendidas
            System.out.print("Ingrese la cantidad de paletas vendidas de este sabor: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad: ");
                scanner.next();
            }
            cantidad = scanner.nextInt();

            while (cantidad < 0) {
                System.out.println("Error: No se pueden vender cantidades negativas.");
                System.out.print("Ingrese nuevamente la cantidad: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente la cantidad: ");
                    scanner.next();
                }
                cantidad = scanner.nextInt();
            }

            // Registrar las ventas por sabor
            switch (opcion) {
                case 1 -> totalLimon += cantidad;
                case 2 -> totalNuez += cantidad;
                case 3 -> totalLulo += cantidad;
                case 4 -> totalFresa += cantidad;
                case 5 -> totalCrema += cantidad;
            }

            // Preguntar si hay más facturas
            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equals("s"));

        // Calcular valores totales
        int ventaLimon = totalLimon * PRECIO_LIMON;
        int ventaNuez = totalNuez * PRECIO_NUEZ;
        int ventaLulo = totalLulo * PRECIO_LULO;
        int ventaFresa = totalFresa * PRECIO_FRESA;
        int ventaCrema = totalCrema * PRECIO_CREMA;
        int ventaTotal = ventaLimon + ventaNuez + ventaLulo + ventaFresa + ventaCrema;

        // Mostrar el reporte final
        System.out.println("\n===== REPORTE SEMANAL DE VENTAS =====");
        System.out.println("Sabor      | Cantidad Vendida | Valor Total");
        System.out.println("--------------------------------------------");
        System.out.println("Limón      | " + totalLimon + "               | $" + ventaLimon);
        System.out.println("Nuez       | " + totalNuez + "               | $" + ventaNuez);
        System.out.println("Lulo       | " + totalLulo + "               | $" + ventaLulo);
        System.out.println("Fresa      | " + totalFresa + "               | $" + ventaFresa);
        System.out.println("Crema      | " + totalCrema + "               | $" + ventaCrema);
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL VENTAS SEMANALES: $" + ventaTotal);

        scanner.close();
    }
}
