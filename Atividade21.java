package atividades;

import java.util.Scanner;

/**
 *. Faça uma sub-rotina que receba uma matriz 10X10 e determine o maior elemento acima da diagonal 
principal. Esse valor deverá ser mostrado no programa principal
 */
public class Atividade21 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++) {

                System.out.println("Informe o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = entrada.nextInt();

            }
        }

        int max = maxDig(matriz);

        System.out.println("O maior elemento acima da diagonal principal é: " + max );

        entrada.close();

    }

    public static int maxDig(int[][] matrix){
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }

            }
        }

        return max;
    }
    
}