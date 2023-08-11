public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("AC1  11/08/2023");
        eNotas(10, 6.5, 10);
        e150a200();
        ePrimo(47);
        eSemana(3);
        eBissexto(2014);

    }
        public static void eNotas(double AP1, double AP2, double AC) {

        //ex1 media das notas
        double APs, ACs, mediaNotas;
        APs = (AP1 + AP2) * 0.4;
        ACs = AC * 0.2;
        mediaNotas = APs + ACs;
        System.out.println(mediaNotas);
        }
        public static void e150a200() {

        //ex2 150 a 200
        for (int i = 150; i <= 200; i++) {
            System.out.println(i);
        }
    }

    public static void ePrimo(int numPrimo) {

        //ex3 primo
        boolean ehPrimo = true;


        if (numPrimo <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numPrimo); i++) {
                if (numPrimo % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numPrimo + " é primo");
        } else {
            System.out.println(numPrimo + " não é primo");
         }

        }

        public static void eSemana(int i) {

        //ex4 semana

        switch (i) {

            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
            System.out.println("valor inválido");
        }
    }

    public static void eBissexto(int ano) {

        //ex5 bissexto
        boolean ehBissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || ano % 400 == 0) {
                ehBissexto = true;
            }
        }

        if (ehBissexto) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }


    }
}




