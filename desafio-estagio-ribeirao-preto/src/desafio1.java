import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = -1;
        List<Integer> resultado = new ArrayList<>();
        String mensagem = "O número que você digitou não tem na sequência Fibonacci!";
        int anterior = 0;
        int atual = 0;
        int proximo = 0;

        do {
            try {
                System.out.print("Digite um número inteiro positivo: ");
                numero = sc.nextInt();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Ops... você digitou não digitou um número inteiro, lembrando números inteiros não tem casa decimais");
            }
        } while (numero < 0);

        for (int i = 0; i <= numero; i++) {
            if (i == 0) {
                resultado.add(atual);
            }else if (i == 1) {
                atual = i;
                proximo = atual + anterior;
                resultado.add(atual);
                resultado.add(proximo);
            } else {
                anterior = atual;
                atual = proximo;
                proximo = atual + anterior;
                resultado.add(proximo);
                if (proximo == numero || proximo > numero) {
                    break;
                }
            }

        }

        if (resultado.contains(numero)) {
            mensagem = "O número que você digitou pertence sim a Fibonacci!";
        }

        System.out.println(mensagem);
        System.out.println("Segue tabela de Fibonacci até o número escolhido: " + resultado);



        sc.close();
    }
}
