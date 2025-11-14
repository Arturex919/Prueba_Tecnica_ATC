import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMetodo {
    Scanner in = new Scanner(System.in);
    private final List<Disco> discos = new ArrayList<>();

    public void showMenu() {
        System.out.println("===== Menu Principal =====");
        System.out.println("1. Crear CD");
        System.out.println("2. Crear Disco Duro");
        System.out.println("3. Crear BluRay");
        System.out.println("4. Crear Vinilo");
        System.out.println("5. Crear Frisbee");
        System.out.println("6. Crear Rueda");
        System.out.println("7. Listar Discos");
        System.out.println("8. Interactuar con Disco");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public void showAccionesCd() {
        System.out.println("===== Menu CD =====");
        System.out.println("1. Agregar contenido");
        System.out.println("2. Ver contenido");
        System.out.println("3. Eliminar contenido");
        System.out.println("4. Ver detalles");
        System.out.println("5. iniciar disco)");
        System.out.println("6. reproducir contenido");
        System.out.println("7. Volver");
        System.out.print("Opción: ");
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
    }

    public void creaCd() {
        System.out.println("Insertar los datos de tu CD");
        System.out.println("Nombre: ");
        String name = in.nextLine();

        System.out.println("capacidad (GB): ");
        double capacidad = in.nextDouble();
        in.nextLine();

        System.out.println("Velocidad del disco: ");
        double velocidad = in.nextDouble();
        in.nextLine();

        System.out.print("Marca: ");
        String brand = in.nextLine();

        Cd cd = new Cd(name, capacidad, TipoDisco.CD, new ArrayList<>(),brand, velocidad );

        addDisco(cd);
        System.out.println("se creo el disco correctamente" + "\n");


    }

    public void creaHHD() {
        System.out.println("Nombre del Disco Duro: ");
        String nombre = in.nextLine();

        System.out.println("capacidad (GB): ");
        double capacidad = in.nextDouble();
        in.nextLine();

        System.out.println("RPM: ");
        int rpm = in.nextInt();
        in.nextLine();

        System.out.println("Tipo de conexión (USB/SATA): ");
        String conexion = in.nextLine().toUpperCase();
        System.out.print("Marca: ");
        String brand = in.nextLine();

        if (conexion.equalsIgnoreCase("USB") || conexion.equalsIgnoreCase("SATA")) {
            DiscoDuro hdd = new DiscoDuro(nombre, capacidad, TipoDisco.DISCODURO, new ArrayList<>(), conexion, rpm, brand);
            addDisco(hdd);
            System.out.println("se creo el disco correctamente" + "\n");

        } else {
            System.out.println("error,tipo de conexion");
        }
    }

    public void crearBluRay() {
        System.out.println("Nombre del Blu-Ray: ");
        String nombre = in.nextLine();

        System.out.println("Capacidad (GB): ");
        double capacidad = in.nextDouble();
        in.nextLine();

        System.out.println("Velocidad de lectura (MB/s): ");
        int velocidad = in.nextInt();
        in.nextLine();

        System.out.print("Marca: ");
        String brand = in.nextLine();

        BluRay bluRay = new BluRay(nombre, capacidad, TipoDisco.BLU_RAY, new ArrayList<>(), brand,velocidad);
        addDisco(bluRay);
        System.out.println("se creo el disco correctamente" + "\n");
    }

    public void crearVinilo() {
        System.out.println("Nombre del Vinilo: ");
        String nombre = in.nextLine();

        System.out.println("Capacidad (GB): ");
        double capacidad = in.nextDouble();
        in.nextLine(); // limpiar buffer

        System.out.println("Velocidad (RPM): ");
        int rpm = in.nextInt();
        in.nextLine(); // limpiar buffer


        System.out.println("Ingresa el material del vinilo :");
        for (MaterialVinilo m : MaterialVinilo.values()) {
            System.out.println("- " + m);
        }

        System.out.print("Material: ");
        String inputMaterial = in.nextLine().toUpperCase();

        MaterialVinilo material;
        try {
            material = MaterialVinilo.valueOf(inputMaterial);

        } catch (IllegalArgumentException e) {
            System.out.println("Material no válido. Se asignará PVC por defecto.");
            material = MaterialVinilo.PVC;
        }

        // Crear el objeto Vinilo
        System.out.print("Marca: ");
        String brand = in.nextLine();

        Vinilo vinilo = new Vinilo(nombre, capacidad, TipoDisco.VINILO, new ArrayList<>(), brand,rpm, material );
        addDisco(vinilo);

        System.out.println("Vinilo creado correctamente:");
    }

    public void crearFrisbee() {
        System.out.print("Diámetro (cm): ");
        double diametro = in.nextDouble();
        in.nextLine();

        Frisbee frisbee = new Frisbee(diametro);
        System.out.println(frisbee);
        frisbee.girarDisco();
    }

    public void crearRueda() {
        System.out.print("vehiculo : ");
        String tipo = in.nextLine();
        System.out.print("Diámetro (cm): ");
        double diametro = in.nextDouble();
        in.nextLine();

        Rueda rueda = new Rueda(tipo, diametro);
        System.out.println(rueda);
        rueda.girarDisco();
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("No hay discos creados.");
        }
        System.out.println("===== Lista de Discos =====");
        for (int i = 0; i < discos.size(); i++) {
            Disco d = discos.get(i);
            System.out.println((i + 1) + ". " + d.getClass().getSimpleName() + " - " + d.nombre);
        }
    }

    public void interactuarDisco() {
        listarDiscos();
        System.out.print("Selecciona un disco: ");
        int seleccion = in.nextInt();
        in.nextLine();
        if (seleccion < 1 || seleccion > discos.size()) {
            System.out.println("Opción inválida.");
        }

        Disco discoSeleccionado = discos.get(seleccion - 1);

        if (discoSeleccionado instanceof Cd cd) {
            interactuarCd(cd);
        } else if (discoSeleccionado instanceof DiscoDuro hdd) {
            interactuarHDD(hdd);
        } else if (discoSeleccionado instanceof BluRay br) {
            interactuarBluRay(br);
        } else if (discoSeleccionado instanceof Vinilo v) {
            interactuarVinilo(v);
        } else {
            System.out.println("Este disco no tiene acciones interactivas.");
        }
    }
    private void interactuarCd(Cd cd) {
        boolean salir = false;
        while (!salir) {
            showAccionesCd();
            int accion = in.nextInt();
            in.nextLine();

            switch (accion) {
                case 1 -> {
                    System.out.print("Añade una canción: ");
                    String cancion = in.nextLine();
                    cd.guardarInfo(cancion);
                }
                case 2 -> cd.tituloCd();
                case 3 -> cd.eliminarTodaInfo();
                case 4 -> cd.reporteCd();
                case 5 -> cd.girarDisco();
                case 6 -> System.out.println(cd.toString());
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }
    private void interactuarHDD(DiscoDuro HHD) {
        boolean salir = false;
        while (!salir) {
            showAccionesCd();
            int accion = in.nextInt();
            in.nextLine();

            switch (accion) {
                case 1 -> {
                    System.out.print("Añade una canción: ");
                    String cancion = in.nextLine();
                    HHD.guardarInfoHHD(cancion);
                }
                case 2 -> {
                    HHD.leerDatosHHD();
                }
                case 3 -> {
                    HHD.eliminarTodaInfo();
                }
                case 4 -> {
                    HHD.reporteHHD();
                }
                case 5 -> {
                    HHD.girarDisco();
                }
                case 6 -> System.out.println(HHD.toString());
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }
    private void interactuarBluRay(BluRay bluRay) {
        boolean salir = false;
        while (!salir) {
            showAccionesCd();
            int accion = in.nextInt();
            in.nextLine();

            switch (accion) {
                case 1 -> {
                    System.out.print("Añade una canción: ");
                    String cancion = in.nextLine();
                    bluRay.guardarInfoBR(cancion);
                }
                case 2 -> bluRay.leerDatosBR();
                case 3 -> bluRay.eliminarTodaInfo();
                case 4 -> bluRay.reporteBR();
                case 5 -> bluRay.girarDisco();
                case 6 -> System.out.println(bluRay.toString());
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }
    private void interactuarVinilo(Vinilo vinilo) {
        boolean salir = false;
        while (!salir) {
            showAccionesCd();
            int accion = in.nextInt();
            in.nextLine();

            switch (accion) {
                case 1 -> {
                    System.out.print("Añade una canción: ");
                    String cancion = in.nextLine();
                    vinilo.guardarInfo(cancion);
                }
                case 2 -> vinilo.leerDatos();
                case 3 -> vinilo.eliminarTodaInfo();
                case 4 -> vinilo.reporteVinil();
                case 5 -> vinilo.girarDisco();
                case 6 -> System.out.println(vinilo.toString());
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }


}