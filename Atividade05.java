package atividades;

import java.util.Scanner;

/**
 * Faça uma sub-rotina que receba um valor inteiro e verifique se ele é positivo ou negativo.
 */
public class Atividade05 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = entrada.nextInt();

        if(num > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        entrada.close();
    }
}
