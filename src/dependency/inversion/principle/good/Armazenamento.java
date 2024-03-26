package dependency.inversion.principle.good;

/**
 * Na versão corrigida, a classe Calculadora não depende mais diretamente do banco de dados. Em vez disso, ela depende
 * da interface Armazenamento. Isso torna a classe mais flexivel e permite que ela seja usada com diferentes tipos de
 * armazenamento .
 */
public interface Armazenamento {
    void salvar(int resultado);
}
