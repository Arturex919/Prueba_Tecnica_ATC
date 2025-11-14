import java.util.List;

public class Cd extends Disco{
    Metodos metodos = new Metodos();

    double velocidadLaser;

    public Cd() {
    }

    public Cd(String nombre, double capacidad, TipoDisco tipoDisco, List<String> contenidoDisco, String brand,double velocidadLaser) {
        super(nombre, capacidad, tipoDisco, contenidoDisco, brand);
        this.metodos = metodos;
        this.velocidadLaser = velocidadLaser;
    }

    public double getVelocidadLaser() {
        return velocidadLaser;
    }

    public void setVelocidadLaser(double velocidadLaser) {
        this.velocidadLaser = velocidadLaser;
    }

    @Override
    public void girarDisco() {
        System.out.println("iniciando cd "+nombre+" esta girando el disco a la velocidad: "+ velocidadLaser);
    }
    public void guardarInfo(String dato){

        metodos.almacenarInfo(contenidoDisco,dato);
    }
    public void tituloCd(){

            metodos.leerDatos(contenidoDisco);

    }
     public void eliminarTodaInfo() {

             metodos.eliminarContenido(contenidoDisco);

     }
     public void reporteCd(){
        metodos.infoDisco(nombre, capacidad,contenidoDisco,tipoDisco.toString());
     }

    @Override
    public String toString() {
        return "Reproduciendo CD: " + nombre + " [" + brand + "] con el contenido: " + contenidoDisco;
    }

}
