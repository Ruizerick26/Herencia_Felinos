public class Felinos {
    private String nombre;
    private String tipo;
    private String tamaño;

    public Felinos(String nombre, String tipo, String tamaño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public Felinos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
