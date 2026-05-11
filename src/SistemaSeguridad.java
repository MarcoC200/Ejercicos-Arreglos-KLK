public class SistemaSeguridad {
    private String nombreSistema;
    private int intentosFallidos;
    public SistemaSeguridad(String nombre) {
        this.nombreSistema = nombre; this.intentosFallidos = 0;
    }
    public void registrarIntentoFallido() { intentosFallidos++; }
    public void mostrarEstado() {
        String estado = (intentosFallidos >= 3) ? "BLOQUEADO" : "ACTIVO";
        System.out.println("Sistema: " + nombreSistema + " | Estado: " + estado);
    }
}