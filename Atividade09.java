package atividades;

import java.util.Scanner;

/**
 *Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo e retorne a soma dos divisores
desse valor
 */
public class Atividade09 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int num, res;

        System.out.println("Informe um valor inteiro e positivo");
        num = entrada.nextInt();

        res = somaDiv(num);

        System.out.println("A soma dos divisores do número " + num + " é: " + res);

        entrada.close();
    }
    public static int somaDiv (int num){
        if(num < 0){
            return -1;
        }
        int somaDivs = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                somaDivs += i;
            }
        }
        return somaDivs;
    }
}
