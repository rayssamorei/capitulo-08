package atividades;

import java.util.Scanner;

/**
 * Faça uma sub-rotina que receba como parâmetro um valor inteiro e positivo N, indicando a quantidade
de parcelas de uma soma S, calculada pela fórmula:
S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... + (n2 + 1)/(n + 3)
 */
public class Atividade11 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Informe um valor para N: ");
        int n = entrada.nextInt();

        double res = calcularSoma(n);

        String resFormatado = String.format("%.2f", res);
        
        System.out.println("O valor da soma S é de: " + resFormatado);
        
        entrada.close();
    }
    public static double calcularSoma(int n) {
        if (n <= 0) {
            System.out.println("Número inválido.");
            return -1;
        }

        double soma = 0.0;
        int numerador = 2;
        for (int i = 4; i <= n + 3; i++) {
            soma += (double) (numerador + i * i) / i;
        }

        return soma;
    }
}
