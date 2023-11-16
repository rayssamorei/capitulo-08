package atividades;
import java.util.Scanner;
/**
 *Faça uma sub-rotina que receba um número inteiro e positivo N como parâmetro e retorne a soma dos números inteiros existentes entre o número 1 e N (inclusive)
 */
public class Atividade01 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = entrada.nextInt();

        int resultado = somaAteN(num);

        if(resultado != -1){
            System.out.println("A soma dos números de 1 a " + num + " é: " + resultado);
        }
        entrada.close();

    }
    public static int somaAteN(int n) {
        if(n <= 0){
            System.out.println("Digite um número inteiro e positivo.");
            return -1;
        }

        int soma = 0;
        for(int i = 1; i <= n; i++) {
            soma += i;
        }

        return soma;
    }
}