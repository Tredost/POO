public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 150; i < 201; i++){
            System.out.println(i);
        }
        diaSemana(9);
        eBissexto(2000);
        for (int i = 0; i < 100; i++) {
            ePrimo(i);
        }
    }

    public static void eBissexto(int ano) {

        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 != 0) {
                System.out.println("Não é bissexto");
            } else {
                System.out.println("É bissexto");
            }

        } else {
            System.out.println("Não é bissexto");
        }

    }

    public static void diaSemana(int dia) {
        switch (dia) {

            case 1:
                System.out.println("Domingo!");
                break;

            case 2:
                System.out.println("Segunda!");
                break;

            case 3:
                System.out.println("Terça!");
                break;

            case 4:
                System.out.println("Quarta!");
                break;

            case 5:
                System.out.println("Quinta!");
                break;

            case 6:
                System.out.println("Sexta!");
                break;

            case 7:
                System.out.println("Sábado!");
                break;

            default:
                System.out.println("Valor inválido!");
                break;
        }

    }

    public static void ePrimo(int num) {
        if (num > 7 && num != 3 && num % 2 != 0 && num % 3 !=0 && num % 5 != 0 && num % 7 != 0) {
            System.out.println(num + "É primo!");
        } else if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println(num + "É primo!");
        } else {
            System.out.println( num + "Não é primo!");
        }
    }

}
