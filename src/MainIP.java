public class MainIP {
    public static void main(String[] args) {
        final int MAX = 2;
        RegistroIP[] seguridad = new RegistroIP[MAX];
        int indice = 0;

        // INGRESO 1 POR 1 CON CONTROL DE ESPACIO (Como el ejemplo del profe)
        if (indice < MAX) {
            seguridad[indice++] = new RegistroIP("192.168.1.1", "08:00", true);
        } else {
            System.out.println("No hay más memoria");
        }

        if (indice < MAX) {
            seguridad[indice++] = new RegistroIP("10.0.0.5", "09:30", false);
        } else {
            System.out.println("No hay más memoria");
        }

        // Operación sobre elemento específico (índice 0)
        System.out.println("Mostrando primer registro:");
        seguridad[0].mostrarEstado();
    }
}