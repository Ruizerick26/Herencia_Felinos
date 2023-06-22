public class Pantherinae extends Felinos{
    private String familia;
    private String genero;
    private String Nombre_C;

    public Pantherinae(String nombre, String tipo, String tamaño, String familia, String genero, String nombre_C) {
        super(nombre, tipo, tamaño);
        this.familia = familia;
        this.genero = genero;
        Nombre_C = nombre_C;
    }

    public Pantherinae() {
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre_C() {
        return Nombre_C;
    }

    public void setNombre_C(String nombre_C) {
        Nombre_C = nombre_C;
    }
    public void Correr(){
        System.out.println("Esta especie se especializa en correr");
    }
    public void Rugir(){
        System.out.println("Esta especie posee un rugido caracteristico");
    }
    public void Escalar(){
        System.out.println("Esta especie escala laderas montañosas con facilidad");
    }
    public void imprimir(){
        System.out.printf("El nombre de la especie es %s y su tamaño es %s, se encuentra en estado %s \n " +
                "Su nombre cientifico es %s %s y es de la familia %s\n", getNombre(),getTamaño(),getTipo(),getGenero(),getNombre_C(),getFamilia() );
    }
}
