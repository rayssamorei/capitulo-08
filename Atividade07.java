package atividades;

import java.util.Scanner;

/**
 * Elabore uma sub-rotina que leia um número não determinado de valores
 * positivos e retorne a média aritmética desses valores. Terminar a entrada de
 * dados com o valor zero.
 */
public class Atividade07 {
    public static void main(String[] args) {
        calMedia();
    
    }
    public static void calMedia() {
        var entrada = new Scanner(System.in);
        int valores, qtd = 0, positivos = 0;
        double media;

        do {
            System.out.println("Informe valores positivos. digite 0  para encerrar a entrada de dados. ");
            valores = entrada.nextInt();

            if(valores > 0){
                positivos += valores;
                qtd++;
            } else if (valores < 0) {
                System.out.println("Número inválido. Insira um número positiva.");
            }
        } while (valores != 0);

        if(positivos > 0){
            media = (double) positivos / qtd;
            System.out.println("A média dos números positivos é: " + media);
        } else {
            System.out.println("Nenhum valor foi inserido. ");
        }
        entrada.close();
    }
}
