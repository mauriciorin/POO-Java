package TallerNo1;
import java.util.Scanner;

public class SalarioObrero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PAGO_POR_HORA = 5000;
        final double INCREMENTO_EXTRA = 1.20; // 20% más en horas extras
        final int HORAS_LIMITE = 40;
        double horasTrabajadas, salarioBase, salarioExtra, salarioTotal;
        String continuar;

        System.out.println("Cálculo de salario semanal para obreros.");
        System.out.println("Pago por hora: $" + PAGO_POR_HORA);
        System.out.println("Horas extras se pagan con un aumento del 20%.");

        do {
            // Validar entrada de horas trabajadas
            System.out.print("Ingrese el número de horas trabajadas en la semana: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número válido.");
                System.out.print("Ingrese nuevamente las horas trabajadas: ");
                scanner.next();
            }
            horasTrabajadas = scanner.nextDouble();

            while (horasTrabajadas < 0) {
                System.out.println("Error: No se pueden ingresar horas negativas.");
                System.out.print("Ingrese nuevamente las horas trabajadas: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    System.out.print("Ingrese nuevamente las horas trabajadas: ");
                    scanner.next();
                }
                horasTrabajadas = scanner.nextDouble();
            }

            // Calcular el salario
            if (horasTrabajadas <= HORAS_LIMITE) {
                salarioBase = horasTrabajadas * PAGO_POR_HORA;
                salarioExtra = 0;
            } else {
                salarioBase = HORAS_LIMITE * PAGO_POR_HORA;
                double horasExtras = horasTrabajadas - HORAS_LIMITE;
                salarioExtra = horasExtras * (PAGO_POR_HORA * INCREMENTO_EXTRA);
            }

            salarioTotal = salarioBase + salarioExtra;

            // Mostrar resultados
            System.out.println("Salario base: $" + salarioBase);
            System.out.println("Salario por horas extras: $" + salarioExtra);
            System.out.println("Salario total: $" + salarioTotal);

            // Preguntar si desea calcular otro salario
            System.out.println("¿Desea calcular otro salario?");
            System.out.print("Si desea calcular otro salario escriba S, sino escriba cualquier tecla: ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
        scanner.close();
    }
}
