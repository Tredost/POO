public class Alunos {
    int idade, periodo, inscricoes;
    String nome, genero, curso, tipo;



    Alunos(String nome, String genero, String cruso, int idade, int periodo) {
        this.nome = nome;
        this.genero = genero;
        this.curso = curso;
        this.idade = idade;
        this.periodo = periodo;
        if (periodo == 1) {
            this.tipo = "calouro";
        }
    }

    void inscreverAluno(int qntd) {
        this.inscricoes += qntd;
    }
}