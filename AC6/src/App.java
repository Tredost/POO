import java.util.Scanner;

import entidades.AlunoDAO;
public class App {
    public static void main(String[] args) throws Exception {

        AlunoDAO alunos = new AlunoDAO();
        alunos.carregarDados();
        boolean executando = true;
        Scanner leitor = new Scanner(System.in);

        while (executando) {
            System.out.println("O que deseja fazer?\n  1 - Listar todos os alunos\n  2 - Buscar aluno por matrícula\n  3 - Adicionar aluno\n  4 - Remover aluno\n  5 - Editar curso\n  6 - Salvar e sair\n");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(alunos);
                    break;

                case 2:
                    System.out.println(alunos.buscarMatricula(leitor) + "\n");
                    break;

                case 3:
                    alunos.adicionarAluno(leitor);
                    break;

                case 4:
                    alunos.removerAluno(leitor);
                    break;

                case 5:
                    alunos.atualizarCurso(leitor);
                    break;

                case 6:
                    alunos.salvarDados();
                    executando = false;
                    System.out.println("Salvando e encerrando programa!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        leitor.close();

    }
}
