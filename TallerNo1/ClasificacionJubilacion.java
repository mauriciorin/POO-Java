package TallerNo1;
import java.util.Scanner;

public class ClasificacionJubilacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, antiguedad;
        String continuar;

        System.out.println("Clasificación de jubilación para el año 2004");
        System.out.println("- Jubilación por edad: 60 años o más y menos de 25 años de antigüedad");
        System.out.println("- Jubilación por antigüedad joven: Menos de 60 años y 25 años o más de antigüedad");
        System.out.println("- Jubilación por antigüedad adulta: 60 años o más y 25 años o más de antigüedad");

        do {
            // Validar la entrada de la edad
            System.out.print("Ingrese la edad del trabajador: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                System.out.print("Ingrese nuevamente la edad: ");
                scanner.next();
            }
            edad = scanner.nextInt();

            while (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
                System.out.print("Ingrese nuevamente la edad: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    System.out.print("Ingrese nuevamente la edad: ");
                    scanner.next();
                }
                edad = scanner.nextInt();
            }

            // Validar la entrada de la antigüedad
            System.out.print("Ingrese la antigüedad en el empleo (en años): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                System.out.print("Ingrese nuevamente la antigüedad: ");
                scanner.next();
            }
            antiguedad = scanner.nextInt();

            while (antiguedad < 0) {
                System.out.println("Error: La antigüedad no puede ser negativa.");
                System.out.print("Ingrese nuevamente la antigüedad: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    System.out.print("Ingrese nuevamente la antigüedad: ");
                    scanner.next();
                }
                antiguedad = scanner.nextInt();
            }

            // Determinar el tipo de jubilación
            if (edad >= 60 && antiguedad < 25) {
                System.out.println("El trabajador aplica para jubilación por edad.");
            } else if (edad < 60 && antiguedad >= 25) {
                System.out.println("El trabajador aplica para jubilación por antigüedad joven.");
            } else if (edad >= 60 && antiguedad >= 25) {
                System.out.println("El trabajador aplica para jubilación por antigüedad adulta.");
            } else {
                System.out.println("El trabajador no cumple con los requisitos para jubilarse en el 2004.");
            }

            // Preguntar si desea ingresar otro trabajador
            System.out.println("¿Desea evaluar otro trabajador?");
            System.out.print("Si desea continuar escriba S, sino escriba cualquier otra tecla: ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Proceso finalizado. ¡Gracias!");
        scanner.close();
    }
}
