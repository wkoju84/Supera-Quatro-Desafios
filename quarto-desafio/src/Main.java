/*
A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
de olhar para várias páginas impressas por um tempo, você percebe que ele está
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
prosseguindo em direção ao centro da página.

Por exemplo a linha:
THIS LINE IS GIBBERISH

está sendo impressa como:
I ENIL SIHTHSIREBBIG S
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Recebe a impressão de forma incorreta
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a linha a ser impressa: ");

        String linha = scan.nextLine();

        String linhaCorrigida = corrigirImpressao(linha);

        System.out.println("Linha corrigida: " + linhaCorrigida);

        scan.close();
    }

    private static String corrigirImpressao(String linha) {

        int tamanhoDaLinha = linha.length();
        int meioDaLinha = tamanhoDaLinha / 2;

        String metadeEsquerda = linha.substring(0, meioDaLinha);
        String metadeDireita = linha.substring(meioDaLinha);

        //modifica cadeia de caracteres sem criar um novo objeto
        StringBuilder linhaCorrigida = new StringBuilder();

        // Imprime a metade esquerda da linha em ordem reversa
        for (int i = metadeEsquerda.length() - 1; i >= 0; i--) {
            linhaCorrigida.append(metadeEsquerda.charAt(i));
        }

        // Imprime a metade direita da linha em ordem reversa
        for (int i = metadeDireita.length() - 1; i >= 0; i--) {
            linhaCorrigida.append(metadeDireita.charAt(i));
        }

        return linhaCorrigida.toString();

    }
}