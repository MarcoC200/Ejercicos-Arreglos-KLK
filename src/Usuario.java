public class Usuario {
    private String nombreUsuario, correo, contrasena;
    public void setNombreUsuario(String n) { nombreUsuario = n; }
    public void setCorreo(String c) { correo = c; }
    public void setContrasena(String p) {
        if (p.length() >= 8) { this.contrasena = p; }
        else { System.out.println("ADVERTENCIA: Contraseña muy corta."); }
    }
    public void mostrarDatos() {
        System.out.println("Usuario: " + nombreUsuario + " | Correo: " + correo);
    }
}