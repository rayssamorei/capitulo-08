package atividades;

import java.util.Scanner;

/**
 *Crie um programa que receba o número dos 10 alunos de uma sala, armazenando-os em um vetor, junto
com as notas obtidas ao longo do semestre (foram realizadas quatro avaliações). Elabore sub-rotinas para:
■■ determinar e mostrar a média aritmética de todos os alunos;
■■ indicar os números dos alunos que deverão fazer recuperação, ou seja, aqueles com média inferior a 6.
 */
public class Atividade25 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] numAluno = new int[10];
        double[][] notasAlunos = new double[10][4];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o numero do " +(i + 1)+ "° aluno: ");
            numAluno[i] = entrada.nextInt();

            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a " +(j + 1)+ "° nota do aluno " + numAluno[i]+ ": ");
                notasAlunos[i][j] = entrada.nextDouble();
            }
        }

        double mediaTotal = mediaTotal(notasAlunos);

        System.out.println("A média aritmética de todos os alunos é " + mediaTotal);

        int[] alunRecp = calAlunRec(numAluno, notasAlunos);

        System.out.println("Os números dos alunos que deverão fazer a recuperação são: " );

        for (int num : alunRecp) {
            System.out.println(num);
        }


        entrada.close();
    }

    public static double mediaTotal(double[][] notasAlunos) {
        double form = 0;
        int qtd = 0;

        for (double[] notaAlunos : notasAlunos) {
            for (double nota : notaAlunos) {
                form += nota;
                qtd++;
            }
        }

        return form / qtd;
    }

    public static int[] calAlunRec(int[] numAlun, double[][] notasAlunos) {
        int[] alunRec = new int[10];
        int qtd = 0;

        for (int i = 0; i < 10; i++) {
            double form = 0;

            for (double notas : notasAlunos[i]) {
                form += notas;
            }

            if (form / 4 < 6) {
                alunRec[qtd] = numAlun[i];

                qtd++;
            }
        }

        int[] res = new int[qtd];
        System.arraycopy(alunRec, 0, res, 0, qtd);
        return res;
    }
}
