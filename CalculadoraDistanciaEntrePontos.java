package Exer;
import java.util.Scanner;

public class CalculadoraDistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas do primeiro ponto (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Digite as coordenadas do segundo ponto (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("A distância entre os pontos é: " + distancia);
    }
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
