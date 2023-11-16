package atividades;

import java.util.Scanner;

/**
 *Elabore uma sub-rotina que receba um vetor X de 15 números inteiros como parâmetro e retorne a
quantidade de valores pares em X
 */
public class Atividade15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int[] num = new int[15];

        System.out.println("Informe os 15 valores inteiros:");
        System.out.println();
        for (int i = 0; i < 15; i++){
            System.out.print("Informe o " +(i + 1)+ "° valor: ");
            num[i] = input.nextInt();
        }

        int contPar =  pares(num);
        System.out.println("A quantidade de valores pares sao: " +contPar);

        input.close();
    }

    public static int pares(int[] n){
        int pares = 0;


        for (int i = 0; i < n.length; i ++){
            if (n[i] % 2 == 0){
                pares++;
            }
        }
        return pares;
    }

}
