package entidades;

public class Aluno {
    private String nome;
    private String curso;
    private String matricula;

    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    // toString

    public String toString() {
        return "Nome do aluno: " + this.nome + "\n" +
        "Curso: " + this.curso + "\n" + "Matrícula: " + this.matricula ;
    }

    // GETTERS

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    // SETTERS

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCurso(String novoCurso) {
        this.curso = novoCurso;
    }

    public void setMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }
}


