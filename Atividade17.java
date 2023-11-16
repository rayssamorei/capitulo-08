package atividades;

import java.util.Scanner;

/**
 * Elabore uma sub-rotina que calcule o máximo divisor comum (MDC) de dois números recebidos como
parâmetros.
 */
public class Atividade17 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Insira o valor de n1: ");
        num1 = entrada.nextInt();

        System.out.print("Insira o valor de n2: ");
        num2 = entrada.nextInt();

        int mdc = mdc(num1, num2);
        System.out.printf("O mdc de %d e %d é: %d",num1, num2, mdc);

        entrada.close();

    }

    public static int mdc(int n1, int n2) {
        int form;

        while(n2 != 0){
            form = n2;
            n2 = n1 % n2;
            n1 = form;
        }

        return n1;
    }
}
