public class TestAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pedro");
        assert a1.getNombre().equals("Pedro");

        assert a1.anadeNota(8);
        assert a1.anadeNota(5);
        assert a1.anadeNota(10);

        assert !a1.anadeNota(-1);
        assert !a1.anadeNota(11);

        assert a1.numNotas() == 3;

        double media = a1.getNotaMedia();
        assert Math.abs(media - 7.6666) < 0.01 : "Media esperada cercana a 7.67";

        assert a1.getNumeroAprobados() == 3;

        a1.borrarNotas();
        assert a1.numNotas() == 0;
        assert a1.getNotaMedia() == 0.0;
        assert a1.getNumeroAprobados() == 0;

        System.out.println("Todas las pruebas pasaron correctamente.");
    }
}