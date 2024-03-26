package liskov.substitution.principle.good;

/**
 * A nova versão do código não viola o LSP porque a nova interface Cachorro herda da interface Animal. Isso significa
 * que todos os métodos de Animal também estão presentes em Cacorro, O método latir() só será chamado em objetos que
 * realmente possuem esse método. Isso evita comportamentos inesperados e garante que o código seja seguro.
 */
public interface Animal {
    void comer();
}
