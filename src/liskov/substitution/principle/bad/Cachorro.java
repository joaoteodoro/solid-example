package liskov.substitution.principle.bad;

public class Cachorro implements Animal {
    public void comer() {
        System.out.println("O cachorro está comento...");
    }

    public void latir() {
        System.out.println("Au au!");
    }
}
