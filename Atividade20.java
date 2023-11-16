package atividades;

import java.util.Scanner;

/**
 *. A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e o
número de filhos. Faça uma sub-rotina que leia esses dados para um número não determinado de pessoas
e retorne a média de salário da população, a média do número de filhos, o maior salário e o percentual
de pessoas com salário inferior a R$ 380,00
 */
public class Atividade20 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double totalSal = 0, maxSal = 0;
        int qtdtotalFilhos = 0, qtd = 0, superior380 = 0;

        while (true) {
            System.out.print("Informe o salário: ");
            double salario = entrada.nextDouble();

            if (salario == -1){
                break;
            }

            System.out.print("Informe o número de filhos: ");
            int filhos = entrada.nextInt();

            totalSal += salario;
            qtdtotalFilhos += filhos;
            qtd++;

            if (salario > maxSal) {
                maxSal = salario;
            }

            if (salario < 380) {
                superior380++;
            }

            double mediaSal = calculate(totalSal, qtd);
            double mediaFilhos = calculate(qtdtotalFilhos, qtd);
            double percSuperior380 = ((double) superior380 / qtd) * 100;

            System.out.println("Média de salário da população: " + mediaSal);
            System.out.println("Média do número de filhos: " + mediaFilhos);
            System.out.println("Maior salário: " + maxSal);
            System.out.println("Percentual de pessoas com salário inferior a R$ 380,00: " + percSuperior380 + "%");

        }

        entrada.close();
    }

    public static double calculate(double total, int count) {
        return total / count;
    }
}
