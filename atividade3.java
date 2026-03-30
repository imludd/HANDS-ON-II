package atividaderafaela;

/**
 *
 * @author Ludmilla Santos
 */
import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        Scanner Levi = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = Levi.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letras++;
            } else if (c >= '0' && c <= '9') {
                numeros++;
            } else if (c == ' ') {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros: " + outros);

    }
}
}
