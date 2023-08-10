package Exer;

import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duração do evento em segundos: ");
        int segundosTotais = scanner.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        System.out.println("Duração do evento: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

        scanner.close();
    }
}
