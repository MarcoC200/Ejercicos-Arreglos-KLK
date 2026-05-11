public class MainSeguridad {
    public static void main(String[] args) {
        SistemaSeguridad sys = new SistemaSeguridad("Server-X");
        sys.registrarIntentoFallido();
        sys.registrarIntentoFallido();
        sys.registrarIntentoFallido(); // 3 intentos
        sys.mostrarEstado();
    }
}