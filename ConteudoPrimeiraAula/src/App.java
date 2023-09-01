public class App {
    public static void main(String[] args) throws Exception {
        /*
         * comentario aqui
         * várias linhas
         */
        System.out.println("Salve, maluco!"); //comentario em linha

        //tipos de dados
        //<tipoVar> <nomeVar1>, <nomeVar2>, <nomeVar3>, ...;
        double x, y, z;
        //<tipoVar> <nomeVar> = <valor>;
        String nome = "Ian";

        //inteiros
        byte a = -50; // 8 bits -> -128 a 127
        short b = -15750; // 16 bits -> 32.768 a 32.767
        int c = 1050000;   // 32 bits -> padrão
        long d = 156000000; // 64 bits ->

        //decimais
        float e = 4.85f; // 32 bits
        double f = -105.48; // 64 bits -> padrão

        // booleano -> 1 bit
        boolean teste = true;
        boolean outroTeste = false;

        // texto
        char letra = 'a'; // uso de aspas simples. Ocupa 2 bytes e usa UNICODE
        String outroNome = "Ian"; // não é um tipo de dado primitivo

        //type casting
        f = (double) b;
        System.out.println(e);
        c = (int) e;
        System.out.println(c);
        System.out.println(e);

        //operadores aritimeticos
        x = 10.5;
        y = -4.5;
        z = 2.2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        //atribuição
        x += 2;
        z -= 1.5;

        //comparação
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);

        //lógicos
        System.out.println(false);         // NOT
        System.out.println(true && false); // AND
        System.out.println(true || false); // OR
        x++;
        x--;
        System.out.println("------------------");
        System.out.println(x);
        System.out.println(x++); //uso a variavel e depois incremento
        System.out.println(x);
        System.out.println(++x); // incremento e depois uso a variavel

        c = 2;
        int w = ++c;
        System.out.println(w);

        w = c--;
        System.out.println(w);

        //estrutura de decisão
        //if-else
        int idade = 19;

        if (idade > 18)
            System.out.println("maior de idade");
        else
            System.out.println("menor de idade");

        //switch
        String opcao = "a";

        switch (opcao) {

            case "a":
                System.out.println("opao a");
                break;
            case "b":
                System.out.println("opao b");
                break;
            case "c":
                System.out.println("opao c");
                break;
            default:
            System.out.println("opao invalida");
        }

        System.out.println("-------------------");
        //estrutura de repetição
        //for
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        for (i = 0; i < 10; i++) {
            i++;
            if (i == 3) {
                continue; // interrompe a iteração
            }
            System.out.println(i);
            if (i == 5) {
                break;  // interrompe
            }
        }
        //while
        i = 10;
        while (i > 0) {
            System.out.println(i--);
        }




    }
}
