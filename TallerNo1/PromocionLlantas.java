package TallerNo1;
import java.util.Scanner;

public class PromocionLlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRECIO1 = 100, PRECIO2 = 75, PRECIO3 = 50;
        int numLlantas;
        double precioUnitario, totalPagar, descuento;
        String continuar;
        System.out.println("Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10");

        do {
            System.out.print("Ingrese el número de llantas a comprar: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                System.out.print("Ingrese nuevamente el número de llantas: ");
                scanner.next();
            }
            numLlantas = scanner.nextInt();
            
            while (numLlantas < 0) {
                System.out.println("Error: No se pueden comprar cantidades negativas.");
                System.out.print("Ingrese nuevamente el número de llantas: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    System.out.print("Ingrese nuevamente el número de llantas: ");
                    scanner.next();
                }
                numLlantas = scanner.nextInt();
            }
            
            if (numLlantas < 5) {
                precioUnitario = PRECIO1;
                descuento = 0;
            } else if (numLlantas <= 10) {
                precioUnitario = PRECIO2;
                descuento = (PRECIO1 - PRECIO2) * numLlantas;
            } else {
                precioUnitario = PRECIO3;
                descuento = (PRECIO1 - PRECIO3) * numLlantas;
            }
            
            totalPagar = numLlantas * precioUnitario;
            
            System.out.println("Precio unitario aplicado: $" + precioUnitario);
            System.out.println("Total sin descuento: $" + (numLlantas * PRECIO1));
            System.out.println("Descuento proporcionado: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagar);
            
            System.out.println("¿Desea realizar otra compra?");
            System.out.print("Si desea realizar otra compra escriba S, sino escriba cualquier tecla: ");
            continuar = scanner.next().toLowerCase();
            
        } while (continuar.equals("s"));
        
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");
        scanner.close();
    }
}
