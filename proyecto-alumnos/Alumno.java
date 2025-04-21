public class Alumno implements IAlumno {
    private String nombre;
    private int[] notas;
    private int contadorNotas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new int[10]; // máximo 10 notas
        this.contadorNotas = 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int[] getNotas() {
        int[] resultado = new int[contadorNotas];
        System.arraycopy(notas, 0, resultado, 0, contadorNotas);
        return resultado;
    }

    @Override
    public boolean anadeNota(int nota) {
        if (contadorNotas >= 10 || nota < 0 || nota > 10) {
            return false;
        }
        notas[contadorNotas] = nota;
        contadorNotas++;
        return true;
    }

    @Override
    public int numNotas() {
        return contadorNotas;
    }

    @Override
    public double getNotaMedia() {
        if (contadorNotas == 0) return 0.0;
        int suma = 0;
        for (int i = 0; i < contadorNotas; i++) {
            suma += notas[i];
        }
        return (double) suma / contadorNotas;
    }

    @Override
    public int getNumeroAprobados() {
        int aprobados = 0;
        for (int i = 0; i < contadorNotas; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    @Override
    public void borrarNotas() {
        contadorNotas = 0;
    }
}