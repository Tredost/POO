import entidades.AlunoDAO;
public class App {
    public static void main(String[] args) throws Exception {

        AlunoDAO alunos= new AlunoDAO();

        alunos.adicionarAluno("Ian Esteves", "Ciência de Dados", "202302937314");
        alunos.adicionarAluno("Matheus Liporace", "Fullstack", "202302417949");

        System.out.print(alunos);

        alunos.removerAluno("202302417949");

        System.out.print(alunos);

        alunos.atualizarCurso("202302937314", "Engenharia da Computação");

        alunos.buscarMatricula("203202937314");

        System.out.print(alunos);

    }
}
