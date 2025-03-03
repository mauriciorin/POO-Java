package TallerNo1;
import java.util.Scanner;

public class PlanificacionFinanciera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MONTO_NEGATIVO = 10000;
        final double MONTO_POSITIVO = 20000;
        final double EQUIPO_COMPUTO = 5000;
        final double MOBILIARIO = 2000;
        double capitalActual, prestamo = 0, presupuestoTotal, insumos, incentivos;
        String continuar;
        
        do {
            // Validar entrada del capital actual
            System.out.print("Ingrese el capital actual de la empresa: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente el capital actual: ");
                scanner.next();
            }
            capitalActual = scanner.nextDouble();
            
            // Determinar el préstamo necesario
            if (capitalActual < 0) {
                prestamo = MONTO_NEGATIVO - capitalActual;
                presupuestoTotal = MONTO_NEGATIVO;
            } else if (capitalActual <= MONTO_POSITIVO) {
                prestamo = MONTO_POSITIVO - capitalActual;
                presupuestoTotal = MONTO_POSITIVO;
            } else {
                presupuestoTotal = capitalActual;
            }
            
            // Calcular distribución del presupuesto
            double restante = presupuestoTotal - (EQUIPO_COMPUTO + MOBILIARIO);
            insumos = restante / 2;
            incentivos = restante / 2;
            
            // Mostrar resultados
            System.out.println("\nResumen de planificación financiera:");
            if (prestamo > 0) {
                System.out.println("Préstamo solicitado al banco: $" + prestamo);
            } else {
                System.out.println("No se requiere préstamo bancario.");
            }
            System.out.println("Presupuesto total disponible: $" + presupuestoTotal);
            System.out.println("Gasto en equipo de cómputo: $" + EQUIPO_COMPUTO);
            System.out.println("Gasto en mobiliario: $" + MOBILIARIO);
            System.out.println("Presupuesto para compra de insumos: $" + insumos);
            System.out.println("Presupuesto para incentivos al personal: $" + incentivos);
            
            // Preguntar si desea realizar otra planificación
            System.out.println("¿Desea realizar otra planificación?");
            System.out.print("Si desea realizar otra planificación escriba S, sino escriba cualquier tecla: ");
            continuar = scanner.next().toLowerCase();
            
        } while (continuar.equals("s"));
        
        System.out.println("Gracias por usar el planificador financiero. ¡Hasta pronto!");
        scanner.close();
    }
}
