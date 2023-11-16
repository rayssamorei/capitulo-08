package atividades;
/**
 * Crie uma sub-rotina que receba como parâmetro dois valores X e Z, calcule e retorne X
sem utilizar
funções ou operadores de potência prontos.
 */

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Informe um valor para a base: ");
        int base = entrada.nextInt();
        System.out.println("Informe um valor para o expoente: ");
        int expoente = entrada.nextInt();
        
        long resultado = expoente(base, expoente);

        System.out.println("O resultado de " + base + " elevado à " + expoente + " é: " + resultado);

        entrada.close();

    }
    public static long expoente(int base, int expoente){
        long res = 1;

        for (int i = 1; i <= expoente; i++){
            res *= base;
        }

        return res;
    }

}
