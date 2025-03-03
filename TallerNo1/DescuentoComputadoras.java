package TallerNo1;
import java.util.Scanner;

public class DescuentoComputadoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_UNITARIO = 500;
        int numComputadoras;
        double total, descuento, totalPagar;
        String continuar = null;

        do {
            System.out.print("Ingrese el número de computadoras a comprar: ");

            // Verifica que el usuario ingrese un número entero válido
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                System.out.print("Ingrese nuevamente el número de computadoras: ");
                scanner.next(); // Limpia el buffer de entrada
            }
            numComputadoras = scanner.nextInt();

            // Validar que no sea un número negativo
            if (numComputadoras < 0) {
                System.out.println("Error: No se pueden comprar cantidades negativas.");
                continue; // Reinicia el ciclo
            }

            // Calcular total y descuento
            total = numComputadoras * PRECIO_UNITARIO;
            if (numComputadoras < 5) {
                descuento = total * 0.10;
            } else if (numComputadoras < 10) {
                descuento = total * 0.20;
            } else {
                descuento = total * 0.40;
            }
            totalPagar = total - descuento;

            // Mostrar resultados
            System.out.println("Total sin descuento: $" + total);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagar);

            // Preguntar si desea realizar otra compra
            System.out.println("¿Desea realizar otra compra? ");
            System.out.print("Si desea realizar otra compra escriba S, sino escriba cualquier tecla diferente a S: ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Gracias por su compra. ¡Vuelva pronto! ");
        scanner.close();
    }
}
