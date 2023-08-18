import java.util.Scanner;

public class AC2 {
    public static void main(String[] args) throws Exception {

        System.out.println("AC2  18/08/2023");

        double resultado = 0;
        double numMem;
        double num1;
        double num2;
        int opc;
        String enc;


        Scanner leitor = new Scanner(System.in);

        num1 = peganum1(leitor);

        while (true) {

            opc = escolhe(leitor);

            switch (opc) {

                case 1:
                    System.out.println("VOCE ESCOLHEU SOMA!");
                    resultado = soma(num1, leitor);
                    break;
                case 2:
                    System.out.println("VOCE ESCOLHEU SUBTRACAO!");
                    resultado = sub(num1, leitor);
                    break;
                case 3:
                    System.out.println("VOCE ESCOLHEU MULTIPLICACAO!");
                    resultado = mult(num1, leitor);
                    break;
                case 4:
                    System.out.println("VOCE ESCOLHEU DIVISAO!");
                    resultado = div(num1, leitor);
                    break;
                default:
                System.out.println("OPCAO NAO EXISTE!");
            }

            System.out.println("DESEJA ENCERRAR O PROGRAMA? \n sim \n nao ");
            enc = leitor.next();
            if (enc.equals("sim")) {
                break; }

            System.out.println("ESCOLHA! \n nova operação = 1 \n limpar memoria = 2");
            int esc = leitor.nextInt();
            if (esc == 1) {
                num1 = resultado; }

            else {
                num1 = peganum1(leitor); }
        }
        leitor.close();

        System.out.println("OBRIGADO POR USAR A CALCULADORA DO IAN :)");

    }

    public static double peganum1(Scanner leitor) {

         double num1;

            System.out.println("ESCOLHA O NUM1:");
            num1 = leitor.nextDouble();
            System.out.println("VOCE ESCOLHEU O NUMERO:");
            System.out.println(num1);
            return num1;

        }

         public static int escolhe(Scanner leitor) {

             System.out.println("ESCOLHA A OPERACAO! \n 1 - soma \n 2 - sub \n 3 - mult \n 4 - div ");
             int opc = leitor.nextInt();
             return opc;
        }

        public static double soma(double num1, Scanner leitor) {

         double resultado, num2;

            System.out.println("ESCOLHA O NUM2: ");
            num2 = leitor.nextDouble();
            resultado = (num1 + num2);
            System.out.println("RESULTADO:");
            System.out.println(resultado);
            return resultado;

        }

        public static double sub(double num1, Scanner leitor) {

        double resultado, num2;

            System.out.println("ESCOLHA O NUM2: ");
            num2 = leitor.nextDouble();
            resultado = (num1 - num2);
            System.out.println("RESULTADO:");
            System.out.println(resultado);
            return resultado;

        }

        public static double mult(double num1, Scanner leitor) {

        double resultado, num2;

            System.out.println("ESCOLHA O NUM2: ");
            num2 = leitor.nextDouble();
            resultado = (num1 * num2);
            System.out.println("RESULTADO:");
            System.out.println(resultado);
            return resultado;

        }

        public static double div(double num1, Scanner leitor) {

        double resultado, num2;

            System.out.println("ESCOLHA O NUM2: ");
            num2 = leitor.nextDouble();
            resultado = (num1 / num2);
            System.out.println("RESULTADO:");
            System.out.println(resultado);
            return resultado;

        }

}
