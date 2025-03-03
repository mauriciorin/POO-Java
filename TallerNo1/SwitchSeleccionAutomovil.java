package TallerNo1;
import java.util.Scanner;

public class SwitchSeleccionAutomovil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoCarro, colorCarro;
        String tipoSeleccionado = "", colorSeleccionado = "";

        System.out.println("Bienvenido al sistema de selección de automóviles.");
        System.out.println("Seleccione el tipo de carro:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        
        // Validar entrada del tipo de carro
        System.out.print("Ingrese su opción (1-3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entre 1 y 3.");
            System.out.print("Ingrese nuevamente su opción: ");
            scanner.next();
        }
        tipoCarro = scanner.nextInt();

        while (tipoCarro < 1 || tipoCarro > 3) {
            System.out.println("Error: Opción inválida. Debe ser entre 1 y 3.");
            System.out.print("Ingrese nuevamente su opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente su opción: ");
                scanner.next();
            }
            tipoCarro = scanner.nextInt();
        }

        // Determinar tipo de carro
        switch (tipoCarro) {
            case 1:
                tipoSeleccionado = "Auto";
                break;
            case 2:
                tipoSeleccionado = "SUV";
                break;
            case 3:
                tipoSeleccionado = "Camioneta";
                break;
        }

        System.out.println("\nSeleccione el color del carro:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");

        // Validar entrada del color
        System.out.print("Ingrese su opción (1-3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entre 1 y 3.");
            System.out.print("Ingrese nuevamente su opción: ");
            scanner.next();
        }
        colorCarro = scanner.nextInt();

        while (colorCarro < 1 || colorCarro > 3) {
            System.out.println("Error: Opción inválida. Debe ser entre 1 y 3.");
            System.out.print("Ingrese nuevamente su opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente su opción: ");
                scanner.next();
            }
            colorCarro = scanner.nextInt();
        }

        // Determinar color del carro
        switch (colorCarro) {
            case 1:
                colorSeleccionado = "Negro";
                break;
            case 2:
                colorSeleccionado = "Blanco";
                break;
            case 3:
                colorSeleccionado = "Rojo";
                break;
        }

        // Mostrar selección final
        System.out.println("\nHa seleccionado un " + tipoSeleccionado + " de color " + colorSeleccionado + ".");
        
        scanner.close();
    }
}
