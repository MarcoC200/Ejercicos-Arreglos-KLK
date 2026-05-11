public class MainSensor {
    public static void main(String[] args) {
        SensorTemperatura s1 = new SensorTemperatura("S01", 25.4, "C");
        SensorTemperatura s2 = new SensorTemperatura("S02", 70.1, "F");
        s1.mostrarLectura();
        s2.mostrarLectura();
    }
}