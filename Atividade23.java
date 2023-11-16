package atividades;

import java.util.Scanner;

/**
 *Os resultados deverão ser mostrados no programa principal.
23. Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando as medidas dos três lados de um triângulo.
Elabore sub-rotinas para:
■■ determinar se esses lados formam um triângulo (sabe-se que, para ser triângulo, a medida de um
lado qualquer deve ser inferior ou igual à soma das medidas dos outros dois).
■■ determinar e mostrar o tipo de triângulo (equilátero, isósceles ou escaleno), caso as medidas formem um triângulo.
Todas as mensagens deverão ser mostradas no programa principal.
 */
public class Atividade23 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double a, b, c;

        System.out.print("Informe o comprimento do primeiro lado: ");
        a = entrada.nextDouble();

        System.out.print("Informe o comprimento do segundo lado: ");
        b = entrada.nextDouble();

        System.out.print("Informe o comprimento do terceiro lado: ");
        c = entrada.nextDouble();

        if (triangulo(a, b, c)) {
            System.out.println("Os lados informados formam um triângulo: " +type(a, b, c));

        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }

        entrada.close();

    }

    public static boolean triangulo(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;

    }

    public static String type(double a, double b, double c){
        if (a == b && b == c) {
            return "Equilátero";

        } else if (a == b || b == c || c == a) {
            return "Isósceles";

        } else {
            return "Escaleno";

        }
    }
}
