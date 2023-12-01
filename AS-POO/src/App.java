import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import exercicios.Quadrilatero;
import exercicios.Teste;

public class App {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------EXERCICIO1-------------------\n");
        // não implementado na main

        System.out.println("\n--------------EXERCICIO2-------------------\n");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(array);
        int novoNumero = 7;

        int [] novoArray = Teste.append(array, novoNumero);
        for (int i = 0; i < novoArray.length; i++) {
            System.out.println(novoArray[i]);
        }

        System.out.println("\n--------------EXERCICIO3-------------------\n");

        Quadrilatero quadrilatero = new Quadrilatero();
        quadrilatero.calcularArea(leitor);
    }
}
