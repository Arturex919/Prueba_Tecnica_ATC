import Interfaces.IGirar;

import java.util.ArrayList;
import java.util.List;

public abstract class Disco implements IGirar {


     String nombre;
    double capacidad;
    TipoDisco tipoDisco;
     List<String> contenidoDisco;
    String brand;

     //constructores

//contrustor vacio
    public Disco() {
    }
    //contrustor

    public Disco(String nombre, double capacidad, TipoDisco tipoDisco, List<String> contenidoDisco, String brand) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.contenidoDisco = contenidoDisco;
        this.brand = brand;
    }

    //getter y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipoDisco(TipoDisco tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public void setContenidoDisco(List<String> contenidoDisco) {
        this.contenidoDisco = contenidoDisco;
    }

    //para que nos muestre el disco que se va a reproducir con el contenido
    @Override
    public String toString() {
        return "CD: " + nombre + " [" + brand + "] con el contenido: " + contenidoDisco;
    }


}
