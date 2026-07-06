package Model;

public class RutasdeGastromia extends Servicio_De_Turismo{
    private String Menu_Especial;

    public RutasdeGastromia(String menu_Especial) {
        Menu_Especial = menu_Especial;
    }

    public RutasdeGastromia(String name, int costo_de_Servicios, String menu_Especial) {
        super(name, costo_de_Servicios);
        Menu_Especial = menu_Especial;

    }

    @Override

    public void mostrarInfornacion() {

            System.out.println("Servicio: " + Name +
                    " | Costo: $" + Costo_de_Servicios +
                    " | Menú especial: " + Menu_Especial);
        }


    }





