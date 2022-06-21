package curso.java.ejerciciocuatro;

public class SmartPhone extends SmartDevice{

    private String nombre;
    private double tamañoDePantalla;
    private double altura;
    private double ancho;
    private double precio;

    public SmartPhone() {
    }

    public SmartPhone(String tipo, boolean portatil, String tipoConexion, boolean tactil, String nombre, double tamañoDePantalla, double altura, double ancho, double precio) {
        super(tipo, portatil, tipoConexion, tactil);
        this.nombre = nombre;
        this.tamañoDePantalla = tamañoDePantalla;
        this.altura = altura;
        this.ancho = ancho;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", precio=" + precio +
                '}';
    }
}
