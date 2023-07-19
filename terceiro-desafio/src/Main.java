
/*
Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.

Exemplo
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

Descrição do problema:
Os pares têm os seguintes parâmetros:

int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.

Retorno
int: O número de pares que satisfazem o critério.

Formatos de Entrada:

Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
alvo.
Seu código deve conter um array de inteiros, de tamanho n.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do array? ");
        int tamanhoDoArray = scan.nextInt();

        int[] n = new int[tamanhoDoArray];

        System.out.println("Entre com os elementos do array: ");
        for (int i = 0; i < tamanhoDoArray; i++) {
            n[i] = scan.nextInt();
        }

        System.out.println("Entre com o valor da diferença: ");
        int k = scan.nextInt();

        scan.close();

        int resultado = ParesDiferentes.diferencaEntrePares(n, k);
        System.out.println("Número de pares com diferença " + k + ": " + resultado);
    }

    public static class ParesDiferentes {
        public static int diferencaEntrePares(int[] n, int k){
            int contador = 0;
            for (int i = 0; i < n.length; i++){
                for (int j = i + 1; j < n.length; j++){
                    if (Math.abs(n[i] - n[j]) == k){
                        contador++;
                    }
                }
            }
            return contador;
        }

    }
}











