public class Palestra {
    String palestrante;
    String data;
    String nome, local, informações;
    int numAlunos = 0;
    int vagas;

    Palestra(String nome, String local, int vagas, String data) {
        this.nome = nome;
        this.local = local;
        this.vagas = vagas;
        this.data = data;
    }


    void adicionarPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    void adicionarAlunos(int qntd) {
        this.numAlunos = qntd;
    }

}