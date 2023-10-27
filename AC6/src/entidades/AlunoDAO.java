package entidades;
import entidades.Aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class AlunoDAO {
        private List<Aluno> alunos;
        private final String arquivoAlunos = "alunos.txt";

        public AlunoDAO() {
            this.alunos = new ArrayList<>();
        }

        public void carregarDados() {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] dados = linha.split("|");
                    if (dados.length == 3) {
                        String nome = dados[0];
                        String curso = dados[1];
                        String matricula = dados[2];
                        alunos.add(new Aluno(nome, curso, matricula));
                    }
                }
            } catch (IOException e) {
                System.err.println("Erro ao carregar dados: " + e.getMessage());
            }
        }

        public void salvarDados() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos, true))) {
                for (Aluno aluno : alunos) {
                    writer.write(aluno.getNome() + "|" + aluno.getCurso() + "|" + aluno.getMatricula());
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Erro ao salvar dados: " + e.getMessage());
            }
        }

        public void adicionarAluno(Scanner leitor) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = leitor.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nome = leitor.nextLine();
            System.out.print("Digite o curso do aluno: ");
            String curso = leitor.nextLine();
            this.alunos.add(new Aluno(nome, curso, matricula));
            System.out.println("Aluno adicionado com sucesso.");
        }

        public void removerAluno(Scanner leitor) {
            System.out.print("Informe a matrícula do aluno a ser removido: ");
            String matricula = leitor.nextLine();
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    alunos.remove(aluno);
                    System.out.println("Aluno removido com sucesso.");
                    break;
                }
            }
        }

        public void atualizarCurso(Scanner leitor) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = leitor.nextLine();
            System.out.print("Digite o novo curso do aluno: ");
            String novoCurso = leitor.nextLine();
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    aluno.setCurso(novoCurso);
                    break;
                }
            }
        }

        public Aluno buscarMatricula(Scanner leitor) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = leitor.nextLine();
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
                listaAlunos += aluno + "\n\n";
            }
            return listaAlunos;
        }
    }

