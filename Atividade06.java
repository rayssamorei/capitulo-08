package atividades;

import java.util.Scanner;

/**
 * Crie uma sub-rotina que receba como parâmetro a altura (alt) e o sexo de uma pessoa e retorne seu peso ideal.
Para homens, deverá calcular o peso ideal usando a fórmula: peso ideal = 72.7 *alt − 58; para mulheres: peso
ideal = 62.1 *alt − 44.7.
 */
public class Atividade06 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        double alt = entrada.nextDouble();

        System.out.println("Informe seu sexo: ");
        char sexo = entrada.next().charAt(0);

        double pesoIdeal = calcularPeso(alt, sexo);

        System.out.printf("O peso ideal é: %.1fKg",pesoIdeal);
        entrada.close();
    }

    public static double calcularPeso(double alt, char sexo){
        double pesoIdeal = 0;

        if(sexo == 'M' || sexo == 'm'){
            pesoIdeal = 72.2 * alt  - 58;
        } else if (sexo == 'F' || sexo == 'f'){
            pesoIdeal = 62.1 * alt - 44.7;
        } else {
            System.out.println("Digite um sexo válido. ");
        }
        return pesoIdeal;
    }
    




}
