package exercicios;
public class Teste {

    public static int[] append(int[] array, int novoNumero) {
        int tamanho = array.length;
        int novoTamanho = tamanho + 1;
        int[] arrayInteiros = new int[novoTamanho];

        int posicao = 0;
        for (int i = 0 ; i < tamanho; i++) {
            System.out.println(array[i]);
            arrayInteiros[i] = array[i];
            posicao = i + 1;
        }

        arrayInteiros[posicao] = novoNumero;

        return arrayInteiros;

    }
}

