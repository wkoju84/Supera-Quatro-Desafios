

/*
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
o seguinte critério:

• Primeiro os Pares
• Depois os Ímpares

Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada
que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha.

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> paresList = new ArrayList<>();
        List<Integer> imparesList = new ArrayList<>();

        int N = scan.nextInt();

        for (int i = 0; i < N; i++){

            int numero = scan.nextInt();
            if (numero % 2 == 0) paresList.add(numero);
            else imparesList.add(numero);
        }

        paresList.stream().sorted().forEach(System.out::println);
        imparesList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        scan.close();
    }
}