package liskov.substitution.principle.good;

import liskov.substitution.principle.bad.Animal;

public class Gato implements Animal {
    public void comer() {
        System.out.println("O gato está comento...");
    }
}
