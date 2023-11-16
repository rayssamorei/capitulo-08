package atividades;

import java.util.Scanner;

/**
 *. Faça uma sub-rotina que receba um vetor X de 30 elementos inteiros como parâmetro e retorne dois
vetores A e B. O vetor A deve conter os elementos de X que sejam maiores que zero e o vetor B, os elementos menores ou iguais a zero.
 */
public class Atividade14 {
    public static void main(String[] args) {

        verificar();
    }
    public static void verificar() {
        var input = new Scanner(System.in);
    
        int tam = 30;
        int[] x = new int[tam];
        int[] a = new int[x.length];
        int[] b = new int[x.length];
    
        for (int i = 0; i < tam; i++){
            System.out.print("Informe o " +(i + 1)+ "° valor: ");
            x[i] = input.nextInt();
    
        }
    
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
            a[i] = x[i];
            } else {
            b[i] = x[i];
            }
        }
        
        
        for(int j = 0; j < a.length; j++){
            System.out.println("Os valores maiores que zero são: " +  a[j]);
        }

        System.out.println();

        for(int j = 0; j < b.length; j++){
            System.out.println("Os valores menores ou igual a zero são: " + b[j]);
        }

        input.close();
    }
}
