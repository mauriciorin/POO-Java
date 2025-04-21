import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[30];
        int totalAlumnos = 0;

        while (totalAlumnos < 30) {
            System.out.println("Introduce nombre:");
            String nombre = sc.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            Alumno alumno = new Alumno(nombre);
            System.out.println("Introduce notas separadas por espacios:");

            String[] partes = sc.nextLine().trim().split("\s+");

            for (String parte : partes) {
                try {
                    int nota = Integer.parseInt(parte);
                    if (!alumno.anadeNota(nota)) {
                        System.out.println("La nota " + nota + " no se pudo añadir");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido: " + parte);
                }
            }

            alumnos[totalAlumnos] = alumno;
            totalAlumnos++;
        }

        System.out.printf("%-15s %-15s %-15s %-10s%n", "Nombre", "Número de notas", "Aprobados", "Media");
        for (int i = 0; i < totalAlumnos; i++) {
            Alumno a = alumnos[i];
            System.out.printf("%-15s %-15d %-15d %-10.2f%n",
                    a.getNombre(), a.numNotas(), a.getNumeroAprobados(), a.getNotaMedia());
        }
        sc.close();
    }
}