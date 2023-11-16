package atividades;

import java.util.Scanner;

/**
 *. Elabore uma sub-rotina que receba dois números como parâmetros e retorne 0, se o primeiro número for
divisível pelo segundo número. Caso contrário, deverá retornar o próximo divisor
 */
public class Atividade03 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);

        int num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();

        int divisor = divisivel(num1, num2);

        if(divisor == 0){
            System.out.println("Resultado da divisão de " + num1 + " por " + num2 + "é: " + divisor);
        } else {
            System.out.println("Próximo divisor: " + divisor);
        }
        entrada.close();

    }
    public static int divisivel (int num1, int num2){
        if(num1 % num2 == 0) {
            return 0;
        } else {
            return num2+1;
        }
    }
}
