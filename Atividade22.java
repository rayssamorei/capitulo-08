package atividades;

import java.util.Scanner;

/**
 *Criar um programa que:
■■ utilize uma sub-rotina para receber os elementos de uma matriz 10X5 de números reais;
■■ utilize uma sub-rotina para calcular a soma de todos os elementos localizados abaixo da sexta linha
dessa matriz;
Os resultados deverão ser mostrados no programa principal.
 */
public class Atividade22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matrix = new double[10][5];

        rdMatrix(matrix, entrada);
        double sum = sixRow(matrix);


        System.out.println("A soma de todos os elementos abaixo da sexta linha é: " + sum);

        entrada.close();
    }

    public static void rdMatrix(double[][] matrix, Scanner entrada) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = entrada.nextDouble();

            }
        }

    }

    public static double sixRow(double[][] matrix) {
        double sum = 0;

        for (int i = 5; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
