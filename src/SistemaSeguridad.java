public class SistemaSeguridad {
    private String nombreSistema;
    private int intentosFallidos;
    public SistemaSeguridad(String nombre) {
        this.nombreSistema = nombre; this.intentosFallidos = 0;
    }
    public void registrarIntentoFallido() { intentosFallidos++; }
    public void mostrarEstado() {
        String estado;
        if (intentosFallidos >= 3) {
            estado = "BLOQUEADO";
        } else {
            estado = "ACTIVO";
        }
        System.out.println("Sistema: " + nombreSistema + " | Estado: " + estado);
    }
}