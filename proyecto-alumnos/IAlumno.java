public interface IAlumno {
    public String getNombre();
    public int[] getNotas();
    public boolean anadeNota(int nota);
    public int numNotas();
    public double getNotaMedia();
    public int getNumeroAprobados();
    public void borrarNotas();
}