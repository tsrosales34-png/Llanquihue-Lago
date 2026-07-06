package Data;
import Model.*;
import java.util.ArrayList;
import java.util.List;
public class Gestor {
    private List<Servicio_De_Turismo> lista = new ArrayList<>();

    public void cargarServicios() {

        lista.add(new RutasdeGastromia("Sabores especiales de Llanquihue", 2000, "Cerdo Salteado"));
        lista.add(new RutasdeGastromia("Ruta de la Jamonada",15000,"Jamon al jugo"));
        lista.add(new RutasdeGastromia("Ruta de la Carne", 155000,"Bistec con arroz"));
        lista.add(new RutasdeGastromia("Rutas variadas", 30000,"Bistec con Arroz y Jamon al Jugo"));
        lista.add(new RutasdeGastromia("Degustaciones liquidas", 5000,"Benidas Variadas"));
        lista.add(new Servicio_De_Turismo("Tour Lacustre", 2500));
        lista.add(new Servicio_De_Turismo("Tour del lago",5000));
        lista.add(new Servicio_De_Turismo("Paseo historico", 5000));
        lista.add(new Servicio_De_Turismo("Paseo por el Campo", 3500));
        lista.add(new Servicio_De_Turismo("Paseo por Barrio Historico", 7000));
        lista.add(new Excursion("Paseo en Lancha",2500, "Viaje por el lago"));
        lista.add(new Excursion("Paseo en Jate",  3500,  "Paseo en Jate por la Bahia"));
        lista.add(new Excursion("Paseo en Caballo",6000, "Recorrido por la Llanura"));
        lista.add(new Excursion("Paseo en bote",  5000, "paseo por el lago llanquihue"));
        lista.add(new Excursion("Canotaje", 2300, "Depotes"));



    }

    public List<Servicio_De_Turismo> getLista() {
        return lista;
    }
}