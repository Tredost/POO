public class Palestrantes {
    int idade, histPalestras;
    String nome, genero, graduacao;



    Palestrantes(String nome, String genero, String graduacao, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.graduacao = graduacao;
        this.idade = idade;
    }


    void quantidadePalestras(int qntd) {
        this.histPalestras += qntd;
    }
}