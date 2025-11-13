import Interfaces.IGirar;

import java.util.ArrayList;
import java.util.List;

public abstract class Disco implements IGirar {


     String nombre;
    double almacenanciento;
    TipoDisco tipoDisco;
     List<String> contenidoDisco;

     //constructores

//contrustor vacio
    public Disco() {
    }
    //contrustor
    public Disco(String nombre, double almacenanciento
            , TipoDisco tipoDisco, List<String> contenidoDisco) {
        this.nombre = nombre;
        this.almacenanciento = almacenanciento;
        this.tipoDisco = tipoDisco;
        //creo un arraylist para que no sriva como almacen para el contenido de disco
        this.contenidoDisco =  (contenidoDisco != null) ? contenidoDisco : new ArrayList<>();//en caso de ser null va a crear una lista nueva con el iterador
    }
    //getter y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlmacenanciento(double almacenanciento) {
        this.almacenanciento = almacenanciento;
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
        return " disco: "+nombre +" creado con el contenido de : "+contenidoDisco;
    }


}
