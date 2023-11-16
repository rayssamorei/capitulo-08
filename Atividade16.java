package atividades;

import java.util.Scanner;

/**
 * Faça uma sub-rotina que receba um vetor X de 20 de números reais como parâmetro e retorne a soma
dos elementos de X.
 */
public class Atividade16 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] num = new int[20];

        System.out.println("Informe 20 valores: ");
        for (int i = 0; i < 20; i++){
            System.out.print("Informe o " +(i + 1)+ "° numero: ");
            num[i] = entrada.nextInt();
        }

        int valorSoma= soma(num);
        System.out.printf("O valor da soma dos valores dos vetores é: %d",valorSoma);

        entrada.close();
    }

    public static int soma(int[] num){
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            soma += num[i];
        }
        return soma;
    }
}
