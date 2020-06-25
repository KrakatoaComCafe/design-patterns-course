package cap6;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {
        Mapa maps = new GoogleMaps();
        maps.devolveMapa("rua vergueiro");

        Relogio relogio = new RelogioDoSistema();
        Calendar hoje = relogio.hoje();
    }
}
