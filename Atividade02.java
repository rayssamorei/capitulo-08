package atividades;

import java.util.Scanner;
/**
e receba três números inteiros como parâmetros, representando horas, minutos e segundos, e os converta em segundos. Exemplo: 2h, 40min e 10s correspondem a 9.610 segundos.
 */
public class Atividade02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        System.out.println("Informe o tempo em horas: ");
        int horas = entrada.nextInt();
        System.out.println("Informe o tempo em minutos: ");
        int minutos = entrada.nextInt();
        System.out.println("Informe o tempo em segundos: ");
        int segundos = entrada.nextInt();
        
        int totalEmSegundos = tempoEmS(horas, minutos, segundos);

        System.out.println(horas + "h, " + minutos +  "min, " + segundos + "s" + " correspondem a: " + totalEmSegundos);

        entrada.close();
    }

    public static int tempoEmS(int hora, int min, int seg) {
        if(hora < 0 || min < 0 || seg < 0){
            System.out.println("Digite um número positivo. ");
            return -1;
        }

        int totalSegundos = hora * 3600 + min * 60 + seg;

        return totalSegundos;
    }


}
