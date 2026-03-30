package atividaderafaela;

/**
 * @author Ludmilla Santos
 */
import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        final double RAIO_TERRA = 6371.01;

        double lat1 = 25.0;
        double lon1 = 35.0;
        double lat2 = 35.5;
        double lon2 = 25.5;

        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        double distancia = RAIO_TERRA * Math.acos(
                Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        System.out.println("A distância entre esses pontos é: " + distancia + " km");
    }
}

}
