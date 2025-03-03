package TallerNo1;
import java.util.Scanner;

public class RRegistroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, numControl;
        String nivel, especialidad;
        int contadorBachillerato = 0, contadorProfesional = 0, contadorMaestria = 0, contadorSistemas = 0;

        // Capturar la cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos a registrar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            System.out.print("Ingrese nuevamente la cantidad de alumnos: ");
            scanner.next();
        }
        n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Error: La cantidad de alumnos debe ser mayor que cero.");
            System.out.print("Ingrese nuevamente la cantidad de alumnos: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de alumnos: ");
                scanner.next();
            }
            n = scanner.nextInt();
        }

        System.out.println("\n===== Registro de alumnos =====");

        for (int i = 1; i <= n; i++) {
            // Captura del número de control
            System.out.print("\nIngrese el número de control del alumno " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el número de control: ");
                scanner.next();
            }
            numControl = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Validar el nivel académico
            do {
                System.out.print("Ingrese el nivel del alumno (Bachillerato, Profesional, Maestría): ");
                nivel = scanner.nextLine().toLowerCase();

                if (!nivel.equals("bachillerato") && !nivel.equals("profesional") && !nivel.equals("maestría")) {
                    System.out.println("Error: Nivel inválido. Intente nuevamente.");
                }
            } while (!nivel.equals("bachillerato") && !nivel.equals("profesional") && !nivel.equals("maestría"));

            // Contar alumnos por nivel
            switch (nivel) {
                case "bachillerato": contadorBachillerato++; break;
                case "profesional": contadorProfesional++; break;
                case "maestría": contadorMaestria++; break;
            }

            // Validar la especialidad
            System.out.print("Ingrese la especialidad del alumno: ");
            especialidad = scanner.nextLine().toLowerCase();

            // Contar alumnos de sistemas
            if (especialidad.equals("sistemas")) {
                contadorSistemas++;
            }

            System.out.println("Alumno registrado - No. Control: " + numControl + " | Nivel: " + nivel + " | Especialidad: " + especialidad);
        }

        // Mostrar el resumen final
        System.out.println("\n===== RESUMEN DE ALUMNOS =====");
        System.out.println("Total alumnos de Bachillerato: " + contadorBachillerato);
        System.out.println("Total alumnos de Profesional: " + contadorProfesional);
        System.out.println("Total alumnos de Maestría: " + contadorMaestria);
        System.out.println("Total alumnos de la especialidad de Sistemas: " + contadorSistemas);

        scanner.close();
    }
}

