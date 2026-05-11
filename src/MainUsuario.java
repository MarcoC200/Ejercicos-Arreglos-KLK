public class MainUsuario {
    public static void main(String[] args) {
        Usuario[] lista = new Usuario[2];
        // Llenado manual (sin Scanner por restricción)
        lista[0] = new Usuario();
        lista[0].setNombreUsuario("Marco");
        lista[0].setContrasena("claveSegura123");

        lista[1] = new Usuario();
        lista[1].setNombreUsuario("Andres");
        lista[1].setContrasena("12345678");

        // USO DE .LENGTH COMO PIDE LA TAREA
        for (int i = 0; i < lista.length; i++) {
            lista[i].mostrarDatos();
        }
    }
}