import java.util.Scanner;

import entidades.AlunoDAO;
public class App {
    public static void main(String[] args) throws Exception {

        AlunoDAO alunos = new AlunoDAO();
        alunos.carregarDados();
        boolean executando = true;
        Scanner leitor = new Scanner(System.in);

        while (executando) {
            System.out.println("O que deseja fazer?\n  1 - Listar todos os alunos\n  2 - Buscar aluno por matrícula\n  3 - Adicionar aluno\n  4 - Remover aluno\n  5 - Editar aluno\n  6 - Salvar e sair\n");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(alunos);
                    break;

                case 2:
                    System.out.println(alunos.buscarMatricula(leitor));
                    break;

                case 3:
                    alunos.adicionarAluno(leitor);
                    break;

                case 4:
                    alunos.removerAluno(leitor);
                    break;

                case 5:
                    //alunos.editarAluno(scanner);
                    break;

                case 6:
                    alunos.salvarDados();
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        leitor.close();






        /* AlunoDAO alunos= new AlunoDAO();

        alunos.adicionarAluno("Ian Esteves", "Ciência de Dados", "202302937314");
        alunos.adicionarAluno("Matheus Liporace", "Fullstack", "202302417949");

        System.out.print(alunos);

        alunos.removerAluno("202302417949");

        System.out.print(alunos);

        alunos.atualizarCurso("202302937314", "Engenharia da Computação");

        alunos.buscarMatricula("203202937314");

        System.out.print(alunos); */

    }
}
