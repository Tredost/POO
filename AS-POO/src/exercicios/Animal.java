package exercicios;
public abstract class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public abstract void andar();

    public abstract void fazerBarulho();

}
