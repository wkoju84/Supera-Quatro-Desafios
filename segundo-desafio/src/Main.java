

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.*/


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double N;
        Double valorMoeda;
        Integer quociente;
        Integer resto;

        List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 2);
        List<Integer> moedas = Arrays.asList(100, 50, 25, 10, 5, 1);

        N = scan.nextDouble();

        resto = (int) (N * 100.0 + 0.5);

        System.out.println("Notas");

        for (Integer nota: notas){
            quociente = resto / (nota * 100);
            System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
            resto = resto % (nota * 100);
        }

        System.out.println("Moedas:");

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for (Integer moeda: moedas){

            valorMoeda = (double) moeda / 100;
            quociente = resto / moeda;
            System.out.println(quociente
                                + " moeda(s) de R$ "
                                + decimalFormat.format(valorMoeda)
                                                .replace("," , "."));
            resto = resto % moeda;
        }

        scan.close();
    }
}