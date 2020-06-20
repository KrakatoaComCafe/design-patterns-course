package cap3;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato c1 = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
        historico.adiciona(c1.salvaEstado());

        System.out.println(c1.getTipoContrato());
        c1.avanca();
        System.out.println(c1.getTipoContrato());
        c1.avanca();
        System.out.println(c1.getTipoContrato());
        c1.avanca();
        System.out.println(c1.getTipoContrato());
    }
}
