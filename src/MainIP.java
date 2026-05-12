public class MainIP {
    public static void main(String[] args) {
        final int MAX = 2;
        RegistroIP[] seguridad = new RegistroIP[MAX];
        int indice = 0;

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

        System.out.println("Mostrando primer registro:");
        seguridad[0].mostrarEstado();
    }
}