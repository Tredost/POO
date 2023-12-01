package exercicios;
public class Gato extends Animal{
    String especie;

    Gato(String especie) {
        super(especie);
    }

    public void andar() {
        System.out.println("Andando!");
    }

    public void fazerBarulho() {
        System.out.println("Barulho!");
    }
}
