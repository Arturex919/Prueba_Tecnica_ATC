import java.util.List;

public class Cd extends Disco{
    Metodos metodos = new Metodos();

    double velocidadLaser;

    public Cd() {
    }

    public Cd(String nombre, double capacidad, TipoDisco tipoDisco, List<String> contenidoDisco, double velocidad) {
        super(nombre, capacidad, tipoDisco, contenidoDisco);//mostramo aqui el enun para que siempre sea CD
        this.velocidadLaser = velocidad;
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
        return "Reproduciendo disco: "+nombre +" con el contenido de : "+contenidoDisco;
    }
}
