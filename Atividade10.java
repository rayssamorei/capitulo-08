package atividades;

import java.util.Scanner;

/**
 * Elabore uma sub-rotina que receba como parâmetro um valor N (inteiro e maior ou igual a 1) e determine o valor da sequência S, descrita a seguir:
*/
public class Atividade10 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor N:");
        int n  = entrada.nextInt();

        double res = sequencia(n);

        String resFormatado = String.format("%.2f", res);

        System.out.println("O valor da sequência S com o número " + n + " é: " + resFormatado);

        entrada.close();

    }
    public static double sequencia(int n){
        if(n < 0){
            System.out.println("Valor inválido.");
            return -1;
        }
        double soma = 0.0;

        for(int i = 1; i <= n; i++){
            soma += 1.0 / i;
        }

        return soma;
    }
}
