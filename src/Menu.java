import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner rc = new Scanner(System.in);
        System.out.println("Sistema de felinos");

        //Arrays de para cada instancia creada de cada clase hija
        ArrayList<Felinae> felinos = new ArrayList<Felinae>();
        ArrayList <Pantherinae> panthera = new ArrayList<Pantherinae>();
        //clase felinae
        Felinae felino1 = new Felinae();
        Felinae felino2 = new Felinae();
        Felinae felino3 = new Felinae();
        felinos.add(felino1);
        felinos.add(felino2);
        felinos.add(felino3);
        //clase pantherinae
        Pantherinae panthera1 = new Pantherinae();
        Pantherinae panthera2 = new Pantherinae();
        panthera.add(panthera1);
        panthera.add(panthera2);


        // ejemplo de los datos que deben ser llenados
        // Felinae felino1  = new Felinae("Guepardo","Salvaje","Mediano","Felinae","Acinonyx","Jubatus" );

        //Ciclos para solicitar los datos de cada instancias de la primera clase hija
        System.out.println("INGERESE LOS DATOS DE LAS ESPECIES DE LA FAMILIA FELINAE");
        for (Felinae feli : felinos ){
            System.out.println("Ingrese el nombre del felino:");
            String nombre = rc.nextLine();
            feli.setNombre(nombre);
            System.out.println("Ingrese el tipo (Domestico o salvaje):");
            String tipo = rc.nextLine();
            feli.setTipo(tipo);
            System.out.println("Ingrese el tamaño (Grande, mediano, pequeño):");
            String tamaño = rc.nextLine();
            feli.setTamaño(tamaño);
            System.out.println("Ingrese la familia a la que pertenece:");
            String familia = rc.nextLine();
            feli.setFamilia(familia);
            System.out.println("Ingrese el genero de la especie (genero taxonomico):");
            String genero = rc.nextLine();
            feli.setGenero(genero);
            System.out.println("Ingrese el nombre cientifico del felino:");
            String nombre_C = rc.nextLine();
            feli.setNombre_C(nombre_C);
            System.out.println("-----------------------------------------");
        }
        //Ciclos para solicitar los datos de cada instancias de la segunda clase hija
        System.out.println("INGERESE LOS DATOS DE LAS ESPECIES DE LA FAMILIA PANTHERINAE");
        for (Pantherinae phant : panthera ){
            System.out.println("Ingrese el nombre del felino :");
            String nombre = rc.nextLine();
            phant.setNombre(nombre);
            System.out.println("Ingrese el tipo (Domestico o salvaje):");
            String tipo = rc.nextLine();
            phant.setTipo(tipo);
            System.out.println("Ingrese el tamaño (Grande, mediano, pequeño):");
            String tamaño = rc.nextLine();
            phant.setTamaño(tamaño);
            System.out.println("Ingrese la familia a la que pertenece:");
            String familia = rc.nextLine();
            phant.setFamilia(familia);
            System.out.println("Ingrese el genero de la especie (genero taxonomico):");
            String genero = rc.nextLine();
            phant.setGenero(genero);
            System.out.println("Ingrese el nombre cientifico del felino:");
            String nombre_C = rc.nextLine();
            phant.setNombre_C(nombre_C);
            System.out.println("-----------------------------------------");
        }
        //Impreciones de sus respectivos datos y metodos
        for (Felinae feli : felinos){
            feli.imprimir();
            feli.ocultar();
            feli.trepar();
        }
        for(Pantherinae phant : panthera){
            phant.imprimir();
            phant.Correr();
            phant.Rugir();
            phant.Escalar();
        }

    }
}
