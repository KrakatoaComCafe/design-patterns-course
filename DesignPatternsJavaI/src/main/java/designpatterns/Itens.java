package designpatterns;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Itens {
    CANETA,
    LAPIS;

    private static final List<Itens> ITENS;

    static {
        ITENS = Stream.of(Itens.values())
                .collect(Collectors.toList());
    }

    public static boolean existeItensNaLista(Itens item1, Itens item2) {
        if (item1.equals(item2)) {
            return false;
        } else if (!ITENS.contains(item1)) {
            return false;
        } else return ITENS.contains(item2);
    }
}
