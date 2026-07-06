package Model;

public class Excursion extends Servicio_De_Turismo {
    private String Viaje;

    public Excursion(String viaje) {
        Viaje = viaje;
    }

    public String getViaje() {
        return Viaje;
    }

    public Excursion(String name, int costo_de_Servicios, String viaje) {
        super(name, costo_de_Servicios);
        Viaje = viaje;


    }

    @Override
    public void mostrarInfornacion() {
        System.out.println("Servicio: " + Name +
                " | Costo: $" + Costo_de_Servicios +
                " | Embarcación: " + Viaje);

    }
}