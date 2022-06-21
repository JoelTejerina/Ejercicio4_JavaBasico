package curso.java.ejerciciocuatro;

public class SmartDevice {

    private String tipo;
    private boolean portatil;
    private String tipoConexion;
    private boolean tactil;

    public SmartDevice(){

    }
    public SmartDevice(String tipo, boolean portatil, String tipoConexion, boolean tactil) {
        this.tipo = tipo;
        this.portatil = portatil;
        this.tipoConexion = tipoConexion;
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public boolean getTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }
    @Override
    public String toString() {
        return "SmartDevice{" +
                "tipo='" + tipo + '\'' +
                ", portatil=" + portatil +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", tactil=" + tactil +
                '}';
    }
}
