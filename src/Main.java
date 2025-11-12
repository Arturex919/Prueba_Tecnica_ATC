import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaContenido = new ArrayList<>();

       /* // Creamos un CD con nombre, capacidad y velocidad
        Cd miCd = new Cd("Mi Música", 0.7, TipoDisco.CD, listaContenido, 1500);
miCd.girarDisco();

    // Almacenar datos
        miCd.guardarInfo("cancion1.mp3");
        miCd.guardarInfo("cancion2.mp3");

    // Leer los datos almacenados
        miCd.tituloCd();

    // Mostrar detalle del CD
       miCd.reporteCd();

    // Eliminar todo el contenido
        miCd.eliminarTodaInfo();

    // Leer nuevamente para comprobar que se eliminó
        System.out.println("lleyendo nuevamente");
        miCd.tituloCd();

        ArrayList<String> contenidoHdd = new ArrayList<>();
        DiscoDuro miHdd = new DiscoDuro("Mi Disco Duro", 500, TipoDisco.DISCODURO, contenidoHdd,  "SATA",7200);

        System.out.println("=== DISCO DURO ===");
        miHdd.girarDisco();
        miHdd.guardarInfoHHD("documento1.txt");
        miHdd.guardarInfoHHD("documento2.txt");
        miHdd.leerDatosHHD();
        miHdd.repporteHHD();
        miHdd.eliminarTodaInfo();
        miHdd.leerDatosHHD();
        BluRay br = new BluRay("Películas Marvel", 25.0, TipoDisco.BLU_RAY,listaContenido,12);

        // Girar el disco
        br.girarDisco();

        // Guardar algunos datos simulados
        br.guardarInfoBR("Iron Man.mp4");
        br.guardarInfoBR("Thor.mp4");
        br.guardarInfoBR("Capitán América.mp4");

        // Leer los datos
        System.out.println();
        br.leerDatosBR();

        // Mostrar detalle completo (nombre, tipo, capacidad, contenido)
        System.out.println();
        br.repporteBR();

        // Mostrar el toString (resumen rápido)
        System.out.println();
        System.out.println(br.toString());

        br.eliminarTodaInfo();
        System.out.println();

        br.leerDatosBR();
*/

        listaContenido.add("Come Together");
        listaContenido.add("Let It Be");
        listaContenido.add("Hey Jude");

        // Crear vinilo
        Vinilo vinilo = new Vinilo("The Beatles - Classic", 1.2, TipoDisco.VINILO, listaContenido, 33, MaterialVinilo.PVC);

        // Probar métodos
        vinilo.girarDisco();
        vinilo.playVinil();
        vinilo.reportarInfo();

        // Mostrar el toString
        System.out.println(vinilo.toString());

        Frisbee fre=new Frisbee(10);
fre.girarDisco();
        System.out.println(fre.toString());
    Rueda rueda=new Rueda("bicicleta",10);
    rueda.girarDisco();
        System.out.println(rueda.toString());
    }
}



