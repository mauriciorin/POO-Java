package TallerNo1;
import java.util.Scanner;

public class RCompraCamisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String nombre, talla;
        int xs = 0, s = 0, m = 0, l = 0, xl = 0, xxl = 0, xxxl = 0;

        // Capturar la cantidad de empleados
        System.out.print("Ingrese la cantidad de empleados: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            System.out.print("Ingrese nuevamente la cantidad de empleados: ");
            scanner.next();
        }
        n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Error: La cantidad de empleados debe ser mayor que cero.");
            System.out.print("Ingrese nuevamente la cantidad de empleados: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de empleados: ");
                scanner.next();
            }
            n = scanner.nextInt();
        }

        System.out.println("\n===== Registro de tallas de camisas =====");

        for (int i = 1; i <= n; i++) {
            System.out.print("\nIngrese el nombre del empleado " + i + ": ");
            scanner.nextLine(); // Limpiar buffer
            nombre = scanner.nextLine();

            // Validar la talla de la camisa
            do {
                System.out.print("Ingrese la talla de la camisa (XS, S, M, L, XL, XXL, XXXL): ");
                talla = scanner.next().toUpperCase();

                if (!talla.equals("XS") && !talla.equals("S") && !talla.equals("M") &&
                    !talla.equals("L") && !talla.equals("XL") && !talla.equals("XXL") &&
                    !talla.equals("XXXL")) {
                    System.out.println("Error: Talla inválida. Intente nuevamente.");
                }
            } while (!talla.equals("XS") && !talla.equals("S") && !talla.equals("M") &&
                     !talla.equals("L") && !talla.equals("XL") && !talla.equals("XXL") &&
                     !talla.equals("XXXL"));

            // Contar la cantidad de camisas por talla
            switch (talla) {
                case "XS": xs++; break;
                case "S": s++; break;
                case "M": m++; break;
                case "L": l++; break;
                case "XL": xl++; break;
                case "XXL": xxl++; break;
                case "XXXL": xxxl++; break;
            }

            System.out.println("Empleado registrado: " + nombre + " | Talla: " + talla);
        }

        // Mostrar el resumen final
        System.out.println("\n===== RESUMEN DE TALLAS =====");
        System.out.println("XS: " + xs);
        System.out.println("S: " + s);
        System.out.println("M: " + m);
        System.out.println("L: " + l);
        System.out.println("XL: " + xl);
        System.out.println("XXL: " + xxl);
        System.out.println("XXXL: " + xxxl);

        scanner.close();
    }
}
