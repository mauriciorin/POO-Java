package TallerNo1;
import java.util.Scanner;

public class DescuentoManzanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_POR_KILO = 3.50; // Precio base por kilo de manzanas
        double kilosComprados, totalSinDescuento, descuento, totalPagar;
        String continuar;
        
        System.out.println("Bienvenido a la frutería. Precios base: $" + PRECIO_POR_KILO + " por kilo.");
        System.out.println("Descuentos aplicables según cantidad comprada:");
        System.out.println("0 - 2 kg: 0% descuento");
        System.out.println("2.01 - 5 kg: 10% descuento");
        System.out.println("5.01 - 10 kg: 15% descuento");
        System.out.println("10.01 kg en adelante: 20% descuento");
        
        do {
            // Validar entrada de kilos
            System.out.print("Ingrese la cantidad de kilos de manzanas a comprar: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente la cantidad de kilos: ");
                scanner.next();
            }
            kilosComprados = scanner.nextDouble();
            
            while (kilosComprados < 0) {
                System.out.println("Error: No se pueden comprar cantidades negativas.");
                System.out.print("Ingrese nuevamente la cantidad de kilos: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente la cantidad de kilos: ");
                    scanner.next();
                }
                kilosComprados = scanner.nextDouble();
            }
            
            // Determinar el porcentaje de descuento
            if (kilosComprados <= 2) {
                descuento = 0;
            } else if (kilosComprados <= 5) {
                descuento = 0.10;
            } else if (kilosComprados <= 10) {
                descuento = 0.15;
            } else {
                descuento = 0.20;
            }
            
            // Calcular los totales
            totalSinDescuento = kilosComprados * PRECIO_POR_KILO;
            double descuentoAplicado = totalSinDescuento * descuento;
            totalPagar = totalSinDescuento - descuentoAplicado;
            
            // Mostrar resultados
            System.out.println("Total sin descuento: $" + totalSinDescuento);
            System.out.println("Descuento aplicado: $" + descuentoAplicado);
            System.out.println("Total a pagar: $" + totalPagar);
            
            // Preguntar si desea realizar otra compra
            System.out.println("¿Desea realizar otra compra?");
            System.out.print("Si desea realizar otra compra escriba S, sino escriba cualquier tecla: ");
            continuar = scanner.next().toLowerCase();
            
        } while (continuar.equals("s"));
        
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");
        scanner.close();
    }
}
