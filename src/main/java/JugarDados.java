package com.company;

import java.util.Scanner;

public class JugarDados {
    Scanner sc = new Scanner(System.in);
    Dado dadoObj = new Dado();
    int dado = 0, victorias = 0, R = 1, partidas = 0;
    void jugar () {

        while (R==1) {
        int dadoActual;
        int victoria=0;
            dado=0;

            for (int i = 0; i < 3; i++) {
                dadoObj.tirarDados();
                dadoActual = dadoObj.getDado();
                dadoObj.imprimirDados(dadoActual);
                if (dado == dadoActual) {
                    victoria++;
                }
                dado = dadoActual;
            }
            if (victoria == 2) {
                System.out.println("Victoria");
                victorias++;
            }
            partidas++;
            System.out.println("Quieres volver a tirar?      1.Si             2.No");
            R = sc.nextInt();
            if (R==1){
                victoria=0;
            }else{
                System.out.println("Partidas Jugadas: " + partidas + "\nVictorias: " + victorias);
            }
        }
    }
}
