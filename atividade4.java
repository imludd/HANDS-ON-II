package atividaderafaela;

/**
 *
 * @author Ludmilla Santos
 */
import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {

        Scanner Xaden = new Scanner(System.in);

        int tentativas = 0;
        char resposta;
        boolean acertou = false;

        do {
            tentativas++;

            System.out.println("Qual comando é usado para repetição em Java?");
            System.out.println("a) if");
            System.out.println("b) switch");
            System.out.println("c) for");
            System.out.println("d) break");
            System.out.println("e) case");
            System.out.print("Digite a resposta: ");

            resposta = Xaden.next().charAt(0);

            switch (resposta) {
                case 'c':
                    System.out.println("Resposta correta");
                    System.out.println("Acertou na tentativa " + tentativas);
                    acertou = true;
                    break;

                default:
                    System.out.println("Resposta incorreta");
            }

            System.out.println();

        } while (tentativas < 3 && acertou == false);

        if (acertou == false) {
            System.out.println("Resposta incorreta nas 3 tentativas");
        }

    }
}
}
