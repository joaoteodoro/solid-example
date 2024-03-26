package liskov.substitution.principle.bad;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.comer(); // Sem erro: Cachorro possui o método comer()
        animal.latir();// Erro: Animal não possui o método latir()
    }
}
