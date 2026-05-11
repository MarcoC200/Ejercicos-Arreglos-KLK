public class SensorTemperatura {
    private String idSensor, unidad;
    private double valorActual;
    public SensorTemperatura(String id, double valor, String un) {
        this.idSensor = id; this.valorActual = valor; this.unidad = un;
    }
    public void mostrarLectura() {
        System.out.println("Sensor: " + idSensor + " | Valor: " + valorActual + " " + unidad);
    }
}