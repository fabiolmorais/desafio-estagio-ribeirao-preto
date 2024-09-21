import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a String que você gostaria de contar a quantidade de letra 'a': ");
        String mensagem = sc.nextLine();
        int contador = 0;
        boolean existeLetraA = false;
        String resultado = "A String que você digitou tem " + contador + " letra 'a' minúscula ou maiúscula";

        for (int i = 0; i < mensagem.length(); i++) {
            if (mensagem.toLowerCase().contains(String.valueOf('a'))) {
                existeLetraA = true;
            }
            if (mensagem.toLowerCase().charAt(i) == 'a') {
                contador++;
            }
        }

        if (existeLetraA) {
            resultado = "A String tem sim letra 'a', ao todo ela tem " + contador + " 'a'!";
        }

        System.out.println(resultado);

        sc.close();
    }
}
