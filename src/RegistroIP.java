public class RegistroIP {
    private String direccionIP, horaAcceso;
    private boolean permitida;
    public RegistroIP(String ip, String hora, boolean p) {
        this.direccionIP = ip;
        this.horaAcceso = hora;
        this.permitida = p;
    }
    public void mostrarEstado() {
        String estado = (permitida) ? "PERMITIDO" : "DENEGADO";
        System.out.println("IP: " + direccionIP + " | Estado: " + estado);
    }
}