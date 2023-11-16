package atividades;

import java.util.Scanner;

/**
 *Faça uma sub-rotina que receba como parâmetro o raio de uma esfera, calcule e mostre no programa principal
o seu volume: v = 4/3 * R3
 */
public class Atividade04 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Informe o raio da esfera: ");
        double raio = entrada.nextDouble();

        double vol = volume(raio);

        System.out.println("O volume do raio da esfera é: " + vol);
        entrada.close();
    }
    public static double volume (double raio){
        double vol = 4/3 * (raio*3);
        return vol;
    }
}
