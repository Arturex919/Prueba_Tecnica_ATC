import java.util.List;

public class DiscoDuro extends Disco  {
    int rpm; //colocamos rpm porque es velocidad que da giro un hdd
    String conexion;
    Metodos metodos = new Metodos();

    //constructores

    public DiscoDuro() {
    }

    public DiscoDuro(String nombre, double capacidad, TipoDisco tipoDisco, List<String> contenidoDisco, String conexion, int rpm) {
        super(nombre, capacidad, tipoDisco, contenidoDisco);
        this.conexion = conexion;
        this.rpm = rpm;
    }
//getters y setters

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public Metodos getMetodos() {
        return metodos;
    }

    public void setMetodos(Metodos metodos) {
        this.metodos = metodos;
    }

    //metodos
    @Override
    public  void girarDisco(){
        System.out.println("Se inicio el HHD con "+nombre+" esta girando el disco a la velocidad: "+ rpm);
    }
    @Override
    public String toString() {
        return "Reproduciendo disco: "+nombre +" con el contenido de : "+contenidoDisco;
    }
    public void guardarInfoHHD(String dato){
        System.out.println("Se esta escribiendo los datos con cabezal magnético: " + dato);
        metodos.almacenarInfo(contenidoDisco,dato);
    }
    public void leerDatosHHD(){
        System.out.println("leyendo los datos medio del cabezal magnetico");
        metodos.leerDatos(contenidoDisco);
    }
    public void eliminarTodaInfo(){
        metodos.eliminarContenido(contenidoDisco);
    }
    public void reporteHHD(){
        metodos.infoDisco(nombre, capacidad,contenidoDisco,tipoDisco.toString());
    }


}
