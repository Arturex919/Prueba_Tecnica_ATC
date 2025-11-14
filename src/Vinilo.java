import java.util.List;

public class Vinilo extends  Disco{
     int rpm;
     MaterialVinilo material;

     Metodos metodos = new Metodos();
     //construct
     public Vinilo(){}


    public Vinilo(String nombre, double capacidad, TipoDisco tipoDisco, List<String> contenidoDisco, String brand, int rpm, MaterialVinilo material) {
        super(nombre, capacidad, tipoDisco, contenidoDisco, brand);
        this.rpm = rpm;
        this.material = material;
    }

    //getters and setters
    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public  void girarDisco(){
        System.out.println("el disco esta girando a: "+ rpm + "rpm");
    }

    public void guardarInfo(String dato) {
        System.out.println("Se está guardando la canción: " + dato + " en el vinilo");
        metodos.almacenarInfo(contenidoDisco, dato);
    }

    public void leerDatos() {
        System.out.println("el disco de vinilo esta reproduciendo la cancion: "+contenidoDisco);
        metodos.leerDatos(contenidoDisco);
    }

    public void eliminarTodaInfo() {
        metodos.eliminarContenido(contenidoDisco);
    }

    public void reporteVinil() {
        System.out.println("Vinilo: " + nombre);
        System.out.println("Capacidad: " + capacidad + " GB");
        System.out.println("Tipo: " + tipoDisco);
        System.out.println("Material: " + material);
        System.out.println("Velocidad de rotación: " + rpm + " RPM");
        if (contenidoDisco != null && !contenidoDisco.isEmpty()) {
            contenidoDisco.forEach(item -> System.out.println("- " + item));
        } else {
            System.out.println("(vacío)");
        }
    }    @Override
    public String toString() {
        return "Reproduciendo Vinilo: " + nombre + " [" + brand + "] material: " + material + " con el contenido: " + contenidoDisco;
    }

}
