package TallerNo1;
import java.util.Scanner;

public class SwitchTombolaSupermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genero;
        int numeroBolita;
        String premio = "";

        System.out.println("¡Bienvenido a la tómbola del supermercado!");
        
        // Validar género
        System.out.print("Ingrese su género (H para hombre, M para mujer): ");
        genero = scanner.next().toLowerCase();

        while (!genero.equals("h") && !genero.equals("m")) {
            System.out.println("Error: Debe ingresar 'H' para hombre o 'M' para mujer.");
            System.out.print("Ingrese nuevamente su género: ");
            genero = scanner.next().toLowerCase();
        }

        // Validar número de bolita
        System.out.print("Ingrese el número de la bolita (1-5): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entre 1 y 5.");
            System.out.print("Ingrese nuevamente el número de la bolita: ");
            scanner.next();
        }
        numeroBolita = scanner.nextInt();

        while (numeroBolita < 1 || numeroBolita > 5) {
            System.out.println("Error: El número de la bolita debe estar entre 1 y 5.");
            System.out.print("Ingrese nuevamente el número de la bolita: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el número de la bolita: ");
                scanner.next();
            }
            numeroBolita = scanner.nextInt();
        }

        // Determinar premio según género y número de bolita
        switch (genero) {
            case "h":
                switch (numeroBolita) {
                    case 1: premio = "Desodorante"; break;
                    case 2: premio = "Six-Pack de cerveza"; break;
                    case 3: premio = "Camiseta"; break;
                    case 4: premio = "Pantaloneta"; break;
                    case 5: premio = "Sudadera"; break;
                }
                break;
            case "m":
                switch (numeroBolita) {
                    case 1: premio = "Loción"; break;
                    case 2: premio = "Bikini"; break;
                    case 3: premio = "Crema para la cara"; break;
                    case 4: premio = "Plancha para el cabello"; break;
                    case 5: premio = "Esmalte de uñas"; break;
                }
                break;
        }

        // Mostrar el premio obtenido
        System.out.println("¡Felicidades! Usted ha ganado: " + premio);
        
        scanner.close();
    }
}
