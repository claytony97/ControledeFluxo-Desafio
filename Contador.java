// Classe Contador
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                // Verifica se o primeiro parâmetro é maior que o segundo
                if (parametroUm > parametroDois) {
                    throw new ParametrosInvalidosException();
                }

                // Chama o método contar para imprimir os números
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // Calcula a quantidade de iterações (for)
        int iteracoes = parametroDois - parametroUm + 1;

        if (iteracoes <= 0) {
            System.out.println("Nenhum número para imprimir.");
            return;
        }

        System.out.println("Imprimindo os números:");

        // Realiza o loop for para imprimir os números
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

