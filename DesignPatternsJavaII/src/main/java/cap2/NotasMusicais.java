package cap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {

    private static Map<String, Nota> notas;
    private static List<Class<? extends Nota>> clazzes;

    static {
        notas = new HashMap<>();
        clazzes = Arrays.asList(
                Do.class,
                Re.class,
                Mi.class,
                Fa.class,
                Sol.class,
                La.class,
                Si.class,
                DoSus.class,
                ReSus.class
        );
    }

    public Nota pega(String nota) {
        try {
            if(!notas.containsKey(nota)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().equalsIgnoreCase(nota)) {
                        notas.put(nota, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }
            return notas.get(nota);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
