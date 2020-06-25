package cap6;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {
        String googleMaps = "http://maps.google.com.br/maps?q-rua+vergueiro";
        URL url = null;
        try {
            url = new URL(googleMaps);
            InputStream inputStream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // .....
        return "mapa";
    }
}
