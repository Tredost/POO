class mais {
    static int x = 10;

public static void main(String[] args) {
    media(8.0f, 7.5f, 8.5f);
    --x;
    System.out.println(++x);
    Pessoa pessoaA = new Pessoa("Jo", 20);
    Pessoa pessoaB = new Pessoa("Jo", 20);
    System.out.println(pessoaA == pessoaB);


}

static class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}

public static void media(float a, float b, float c) {
    System.out.println(a + b + c);
}

public static boolean teste(int num) {
    if (num > 0) {
        return true;
    }
    return false;
}
}