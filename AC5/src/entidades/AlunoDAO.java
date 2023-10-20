package entidades;
import entidades.Aluno;
import java.util.ArrayList;
import java.util.List;

    public class AlunoDAO {
        private List<Aluno> alunos;
    
        public AlunoDAO() {
            this.alunos = new ArrayList<>();
        }
    
        public void adicionarAluno(String nome, String curso, String matricula) {
            Aluno aluno = new Aluno(nome, curso, matricula);
            this.alunos.add(aluno);
        }
    
        public void removerAluno(String matricula) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    alunos.remove(aluno);
                    break;
                }
            }
        }
    
        public void atualizarCurso(String matricula, String novoCurso) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    aluno.setCurso(novoCurso);
                    break;
                }
            }
        }
    
        public Aluno buscarMatricula(String matricula) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    return aluno;
                }
            }
            return null;
        }
    
        public String toString() {
            String listaAlunos = "";
            
            for (Aluno aluno : alunos) {
                listaAlunos += aluno + "\n";
            }
            return listaAlunos;
        }
    }

