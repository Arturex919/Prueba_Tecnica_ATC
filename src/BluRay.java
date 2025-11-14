import java.util.List;

public class BluRay extends Disco{
        int velocidadBluRay;
        Metodos metodos = new Metodos();
    public BluRay(String nombre, double capacidad
            , TipoDisco tipoDisco, List<String> contenidoDisco, int velocidadBluRay) {
        super(nombre, capacidad, tipoDisco, contenidoDisco);
        this.velocidadBluRay = velocidadBluRay;
    }

    //metodos
    @Override
    public  void girarDisco(){
        System.out.println("el BluRay esta girando a: "+ velocidadBluRay + " MB/s");
    }
    @Override
    public String toString() {
        return "Reproduciendo disco: "+nombre +" con el contenido de : "+contenidoDisco;
    }
    public void guardarInfoBR(String dato){
        System.out.println("Se esta guardando los datos en el BluRay: " + dato);
        metodos.almacenarInfo(contenidoDisco,dato);
    }
    public void leerDatosBR(){
        System.out.println("leyendo los datos del BlueRay");
        metodos.leerDatos(contenidoDisco);
    }
    public void eliminarTodaInfo(){
        metodos.eliminarContenido(contenidoDisco);
    }
    public void reporteBR(){
        metodos.infoDisco(nombre, capacidad,contenidoDisco,tipoDisco.toString());
    }

}
