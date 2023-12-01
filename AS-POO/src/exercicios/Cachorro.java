package exercicios;
public class Cachorro extends Animal{
    String especie;

    Cachorro(String especie) {
        super(especie);
    }

    public void andar() {
        System.out.println("Andando!");
    }

    public void fazerBarulho() {
        System.out.println("Barulho!");
    }

}
