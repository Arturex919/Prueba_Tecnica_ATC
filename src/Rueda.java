import Interfaces.IGirar;

// Clase para una rueda giratoria que no almacena datos
public class Rueda implements IGirar {

    private String vehiculo;
    private double diametro; // en cm

    public Rueda() {}

    public Rueda(String vehiculo, double diametro) {
        this.vehiculo = vehiculo;
        this.diametro = diametro;
    }

    @Override
    public void girarDisco() {
        System.out.println("La rueda de '" + vehiculo + "' está girando con diámetro: " + diametro + " cm");
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda: " + vehiculo + " (diámetro " + diametro + " cm)";
    }
}
