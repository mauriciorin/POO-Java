package TallerNo1;
import java.util.Scanner;

public class RRegistroNacimientos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadBebes, contadorMasculino = 0, contadorFemenino = 0;
        String sexo;
        
        // Validar la cantidad de nacimientos
        System.out.print("Ingrese la cantidad de bebés nacidos: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            System.out.print("Ingrese nuevamente la cantidad de bebés: ");
            scanner.next();
        }
        cantidadBebes = scanner.nextInt();
        
        while (cantidadBebes <= 0) {
            System.out.println("Error: La cantidad de nacimientos debe ser mayor a 0.");
            System.out.print("Ingrese nuevamente la cantidad de bebés: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de bebés: ");
                scanner.next();
            }
            cantidadBebes = scanner.nextInt();
        }

        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        // Capturar datos de cada bebé
        int i = 1;
        do {
            System.out.println("\nBebé #" + i);
            System.out.print("Ingrese el nombre del bebé: ");
            // Validar el sexo del bebé
            System.out.print("Ingrese el sexo del bebé (M/F): ");
            sexo = scanner.next().toUpperCase();
            while (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Error: Debe ingresar 'M' para masculino o 'F' para femenino.");
                System.out.print("Ingrese nuevamente el sexo del bebé (M/F): ");
                sexo = scanner.next().toUpperCase();
            }
            scanner.nextLine(); // Consumir el salto de línea después de next()

            // Contar según el sexo
            if (sexo.equals("M")) {
                contadorMasculino++;
            } else {
                contadorFemenino++;
            }
            i++;
        } while (i <= cantidadBebes);

        // Mostrar el resumen final
        System.out.println("\nResumen de nacimientos:");
        System.out.println("Bebés masculinos: " + contadorMasculino);
        System.out.println("Bebés femeninos: " + contadorFemenino);

        scanner.close();
    }
}
