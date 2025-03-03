package TallerNo1;
import java.util.Scanner;

public class DescuentoReproductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.19;
        final double DESCUENTO_PRECIO = 0.10;
        final double DESCUENTO_MARCA = 0.05;
        final double LIMITE_DESCUENTO = 500;
        double precioSinIVA, descuentoTotal, totalConIVA;
        String esNosy, continuar;

        do {
            // Validar entrada del precio
            System.out.print("Ingrese el precio del reproductor sin IVA: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el precio del reproductor: ");
                scanner.next();
            }
            precioSinIVA = scanner.nextDouble();
            
            while (precioSinIVA < 0) {
                System.out.println("Error: No se puede ingresar un precio negativo.");
                System.out.print("Ingrese nuevamente el precio del reproductor: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente el precio del reproductor: ");
                    scanner.next();
                }
                precioSinIVA = scanner.nextDouble();
            }
            
            // Preguntar si la marca es NOSY
            System.out.print("Si la marca del reproductor es NOSY escriba S, sino escriba cualquier tecla diferente a S: ");
            esNosy = scanner.next().toLowerCase();
            
            // Calcular descuentos
            descuentoTotal = 0;
            if (precioSinIVA >= LIMITE_DESCUENTO) {
                descuentoTotal += precioSinIVA * DESCUENTO_PRECIO;
            }
            if (esNosy.equals("s")) {
                descuentoTotal += precioSinIVA * DESCUENTO_MARCA;
            }
            
            double precioConDescuento = precioSinIVA - descuentoTotal;
            totalConIVA = precioConDescuento + (precioConDescuento * IVA);
            
            // Mostrar resultados
            System.out.println("Precio sin IVA: $" + precioSinIVA);
            System.out.println("Descuento total aplicado: $" + descuentoTotal);
            System.out.println("Total con IVA incluido: $" + totalConIVA);
            
            // Preguntar si desea realizar otra compra
            System.out.println("¿Desea realizar otra compra?");
            System.out.print("Si desea realizar otra compra escriba S, sino escriba cualquier tecla: ");
            continuar = scanner.next().toLowerCase();
            
        } while (continuar.equals("s"));
        
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");
        scanner.close();
    }
}
