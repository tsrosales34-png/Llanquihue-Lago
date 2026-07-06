package Model;

public class Servicio_De_Turismo {
protected String Name;
protected int Costo_de_Servicios;

    public Servicio_De_Turismo() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCosto_de_Servicios() {
        return Costo_de_Servicios;
    }

    public void setCosto_de_Servicios(int costo_de_Servicios) {
        Costo_de_Servicios = costo_de_Servicios;
    }

    public Servicio_De_Turismo(String name, int costo_de_Servicios) {
        Name = name;
        Costo_de_Servicios = costo_de_Servicios;


        }




    public void mostrarInfornacion() {
        System.out.println("Servicio: " + Name + " | Costo: $" + Costo_de_Servicios);

    }

}

