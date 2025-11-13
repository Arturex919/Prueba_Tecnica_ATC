import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int option;

        MenuMetodo menuMetodo = new MenuMetodo();
        do {
            menuMetodo.showMenu();
            option = in.nextInt();

            switch (option) {
                case 1 -> {
                    menuMetodo.creaCd();
                }
                case 2 -> {
                    menuMetodo.creaHHD();
                }
                case 3 -> {
                    menuMetodo.crearBluRay();
                }
                case 4 -> {
                    menuMetodo.crearVinilo();
                }
                case 5 -> {
                    menuMetodo.crearFrisbee();
                }
                case 6 -> {
                    menuMetodo.crearRueda();
                }
                case 7 -> {
                    menuMetodo.listarDiscos();
                }
                case 8->{
                    menuMetodo.interactuarDisco();
                }
                case 0 -> {
                }
            }
        } while (option != 0);
    }
}



