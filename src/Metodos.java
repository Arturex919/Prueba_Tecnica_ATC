import java.util.List;

public class Metodos {

    public void almacenarInfo(List<String> contenidoDisco,String info){
        if (contenidoDisco!=null){
            contenidoDisco.add(info);
            System.out.println("la informacion: "+info+" se añadio correctamente");
        }else {
            System.out.println("inicia el disco primero");
        }
    }
    public void leerDatos(List<String> contenidoDisco){
        if (contenidoDisco!=null && !contenidoDisco.isEmpty()){
            System.out.println("datos");
            for (String datos : contenidoDisco) {
                System.out.println("- "+datos);
            }
        }else {
            System.out.println("no existe datos");
        }
    }
    public void eliminarContenido(List<String> contenidoDisco){

            contenidoDisco.clear();
            System.out.println("eliminando datos");
    }
    public void infoDisco(String nombre, double capacidad, List<String> contenidoDisco, String tipo){
        if (contenidoDisco!=null){
            for (String discos : contenidoDisco) {
                System.out.println("informacion del disco: ");
                System.out.println("Disco: " + nombre);
                System.out.println("Tipo: " + tipo);
                System.out.println("Capacidad: " + capacidad + " GB");
            }
        }
    }
}
