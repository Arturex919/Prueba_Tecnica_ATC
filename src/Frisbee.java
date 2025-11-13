import Interfaces.IGirar;

import java.util.List;

public class Frisbee implements IGirar {

    double diametro;
//constructores

    public Frisbee() {
    }

    public Frisbee(double diametro) {
        this.diametro = diametro;
    }

//getters and setters

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void girarDisco() {
        System.out.println("El frisbee está girando");
    }
    @Override
    public String toString() {
        return " el diámetro del frisbee es de " + diametro + " cm";
    }
}
