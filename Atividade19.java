package atividades;

import java.util.Scanner;

/**
 *Faça uma sub-rotina que receba como parâmetro dois vetores de dez números inteiros, determine e mostre o vetor intersecção entre eles.
 */
public class Atividade19 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int tam = 10;

        int[] vet1 = new int[tam];
        int[] vet2 = new int[tam];

        System.out.println("Informe 10 valores para o primeiro vetor: ");
        for (int i = 0; i < tam; i++){
            System.out.print("Insira o " +(i + 1)+ "° valor: ");
            vet1[i] = input.nextInt();
        }

        System.out.println("Informe 10 valores para o segundo vetor: ");
        for (int i = 0; i < tam; i++){
            System.out.print("Insira o " +(i + 1)+ "° valor: ");
            vet2[i] = input.nextInt();
        }

        int[] inter = intersecao(vet1, vet2);

        if (inter.length == 0){
            System.out.println("Não há elementos iguais nos vetores.");
        } else {
            System.out.println("Vetor de intersecção: ");
            for(int i : inter) {
                System.out.println(i + " ");
            }
        }


        input.close();
    }



    public static int[] intersecao(int[] vet1, int[] vet2) {
        int[] tep = new int[10];
        int form = 0;

        for (int i = 0; i < vet1.length; i++){
            for (int j = 0; j < vet2.length; j++){
                if (vet1[i] == vet2[j]) {
                    tep[form++] = vet1[i];
                    break;
                }
            }
        }


        int[] inter = new int[form];
        System.arraycopy(tep, 0, inter, 0, form);



        return inter;
    }
}
