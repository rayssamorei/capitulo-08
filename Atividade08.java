package atividades;

import java.util.Scanner;
/**
 * Faça uma sub-rotina que receba um valor inteiro e positivo, calcule e mostre seu fatorial.
 */
public class Atividade08 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int num;
        int res;

        System.out.println("Informe um número inteiro e positivo: ");
        num = entrada.nextInt();

        if(num > 0){
            res = fatorial(num);
            System.out.printf("O número fatorial de %d é: %d", num, res);
        }
        entrada.close();
    }

    public static int fatorial (int num){
        if(num == 0 || num == 1){
            return 1;
        } else {
            return num * fatorial(num-1);
        }
    }
}
