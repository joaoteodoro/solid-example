package liskov.substitution.principle.good;

import liskov.substitution.principle.bad.Animal;

public class CachorroImpl implements Cachorro {
    public void comer() {
        System.out.println("O cachorro está comento...");
    }

    public void latir() {
        System.out.println("Au au!");
    }
}
