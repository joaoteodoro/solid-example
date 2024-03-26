package liskov.substitution.principle.bad;

/**
 * A classe Cachorro não pode ser substituída por Animal em todos os contextos. Se uma função espera um Animal e recebe
 * um Cachorro, a função pode falhar se tentar chamar um método que não existe em Animal, como latir() neste exemplo.
 */
public interface Animal {
    void comer();
}
