package ui;
import Data.Gestor;
import Model.Servicio_De_Turismo;
public class Main {
    public static void main(String[] args) {
        Gestor Gestion = new Gestor();
        Gestion.cargarServicios();
        System.out.println("Catalogo Llanquihue Tour");

        for (Servicio_De_Turismo servicio : Gestion.getLista()) {
            servicio.mostrarInfornacion();
        }

    }

    }



