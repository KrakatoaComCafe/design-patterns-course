package cap3;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado pega(int index) {
        return this.estadosSalvos.get(index);
    }

    public void adiciona(Estado estado) {
        this.estadosSalvos.add(estado);
    }
}
