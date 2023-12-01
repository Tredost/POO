package exercicios;
import java.util.Scanner;

public class Lista {

    public void calcularArea(Scanner leitor) {
        double altura, largura, lado, baseMaior, baseMenor;
        System.out.println("Deseja calcular área de qual quadrilátero?");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Altura:\n");
                altura = leitor.nextDouble();
                System.out.println("Largura:\n");
                largura = leitor.nextDouble();
                calculoDeArea(altura, largura);
                break;
            case 2:
                System.out.println("Lado:\n");
                lado = leitor.nextDouble();
                calculoDeArea(lado);
                break;
            case 3:
                System.out.println("Altura:\n");
                altura = leitor.nextDouble();
                System.out.println("Base maior:\n");
                baseMaior = leitor.nextDouble();
                System.out.println("Base menor:\n");
                baseMenor = leitor.nextDouble();
                calculoDeArea(baseMenor, baseMaior, altura);
                break;

            default:
            System.out.println("Opção inválida!");
                break;
        }
    }

    public double calculoDeArea(double altura, double largura){
        double area = altura * largura;
        return area;
    }

    public double calculoDeArea(double lado) {
        double area = lado * lado;
        return area;
    }

    public double calculoDeArea(double baseMenor, double baseMaior,double altura) {
        double area =  altura * ((baseMaior + baseMenor) / 2 );
        return area;

    }
}
