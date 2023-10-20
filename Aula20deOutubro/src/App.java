import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        arrayList();
    }


public static void arrayList() {
    ArrayList<Integer> numeros = new ArrayList<>(); //Integer Boolean etc.
    System.out.println(numeros);

    numeros.add(8); // adiciona no final
    numeros.add(3);
    System.out.println(numeros);
    System.out.println(numeros.size());
    System.out.println(numeros.get(1));

    numeros.remove(1); // remove o integer 8 
    System.out.println(numeros);

    numeros.add(0, 16);
    
    numeros.set(5, 24);

    for (Integer numero : numeros) {
        System.out.println(numero);
    }

    
    System.out.println(numeros.contains(8)); // verifica se o array contemo integer 8
    System.out.println(numeros);
    numeros.clear();
    System.out.println(numeros);
}

public static void linkedList() {
    LinkedList<String> carros = new LinkedList<>();
    System.out.println(carros);

    carros.add("honda");
    carros.add("mercedez");

    System.out.println(carros);
    System.out.println(carros.indexOf("honda"));

    carros.pop();
    System.out.println(carros);

    carros.push("bmw");
    System.out.println(carros);
}

public static void pilhas() {
    Stack<Double> notas = new Stack<>();

    notas.push(4.5);
    notas.push(8.8);
    System.out.println(notas.peek());

    notas.push(0.7);
    System.out.println(notas.peek());

    notas.pop();
    System.out.println(notas.peek());
    System.out.println(notas);

    for (Double nota : notas) {
        System.out.println(nota);
    }

}

public static void conjuntos() {
    HashSet<String> frutas = new HashSet<>();

    frutas.add("maça");
    frutas.add("laranja");
    frutas.add("melancia");
    System.out.println(frutas);

    frutas.add("maça");
    System.out.println(frutas);

    for (String fruta : frutas) {
        System.out.println(fruta);
    }

    frutas.remove("laranja");
    System.out.println(frutas);
}


public static void mapas() {
    HashMap<String,String> alunos = new HashMap<>();
    alunos.put("1234", "João");
    alunos.put("5678", "Aline");

    System.out.println(alunos);
    System.out.println(alunos.get("1234"));
    System.out.println(alunos.get("1235"));

    alunos.remove("1234");
    alunos.remove("1235");
    System.out.println(alunos);

    System.out.println(alunos.containsKey("1111"));
    System.out.println(alunos.containsValue("Maria"));
    System.out.println(alunos.containsValue("Aline"));

    System.out.println(alunos.size());

    for (String matricula : alunos.keySet()) {
        System.out.println(matricula);
        System.out.println(alunos.get(matricula));
    }

    for (String nome : alunos.values()) {
        System.out.println(nome);
    }


}
}