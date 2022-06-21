package curso.java.ejerciciocuatro;

public class Principal {
    public static void main(String[] args) {
        SmartDevice smartDevice1 = new SmartDevice(
                "Telefono intelegente", true, "wifi", true);
        System.out.println(smartDevice1);

        SmartPhone smartPhone1 = new SmartPhone(
                "Telefono intelegente", true, "wifi", true, "Samsung s10", 6.1, 20.1, 10.2, 100000.2);
        System.out.println("Smart Phone... Tipo: "+ smartPhone1.getTipo() + " Portatil: " + smartPhone1.getPortatil() + " Tipo de conexion: " + smartPhone1.getTipoConexion() + " Tactil: " + smartPhone1.getTactil() + " " +smartPhone1);

        SmartWatch smartWatch1 = new SmartWatch(
                "Reloj intelegente", true, "bluetooth", true, "Colmi P8", "LCD IPS", 1.4, true, "Deportivo", 5.500);
        System.out.println("Smart Watch... Tipo: "+ smartWatch1.getTipo() + " Portatil: " + smartWatch1.getPortatil() + " Tipo de conexion: " + smartWatch1.getTipoConexion() + " Tactil: " + smartWatch1.getTactil() + " " + smartWatch1);
    }
}