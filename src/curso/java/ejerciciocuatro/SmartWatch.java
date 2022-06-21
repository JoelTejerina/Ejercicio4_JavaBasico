package curso.java.ejerciciocuatro;

public class SmartWatch extends SmartDevice{

    private String nombre;
    private String tipoDePantalla;
    private Double tamañoDePantalla;
    private boolean resistenteAlAgua;
    private String categoria;
    private double precio;


    public SmartWatch() {
    }

    public SmartWatch(String tipo, boolean portatil, String tipoConexion, boolean tactil, String nombre, String tipoDePantalla, Double tamañoDePantalla, boolean resistenteAlAgua, String categoria, double precio) {
        super(tipo, portatil, tipoConexion, tactil);
        this.nombre = nombre;
        this.tipoDePantalla = tipoDePantalla;
        this.tamañoDePantalla = tamañoDePantalla;
        this.resistenteAlAgua = resistenteAlAgua;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePantalla() {
        return tipoDePantalla;
    }

    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
    }

    public Double getTamañoDePantalla() {
        return tamañoDePantalla;
    }

    public void setTamañoDePantalla(Double tamañoDePantalla) {
        this.tamañoDePantalla = tamañoDePantalla;
    }

    public boolean isResistenteAlAgua() {
        return resistenteAlAgua;
    }

    public void setResistenteAlAgua(boolean resistenteAlAgua) {
        this.resistenteAlAgua = resistenteAlAgua;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
                ", tipoDePantalla='" + tipoDePantalla + '\'' +
                ", tamañoDePantalla=" + tamañoDePantalla +
                ", resistenteAlAgua=" + resistenteAlAgua +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                '}';
    }
}
