package liskov.substitution.principle.good;

import liskov.substitution.principle.bad.Animal;
import liskov.substitution.principle.bad.Cachorro;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.comer(); // Sem erro: Cachorro possui o método comer()
        ((Cachorro) animal).latir();// Erro: Animal não possui o método latir()
    }
}
