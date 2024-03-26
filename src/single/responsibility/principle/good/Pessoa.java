package single.responsibility.principle.good;

/**
 * As classes Pessoa e EmailService agora possuem responsabilidade únicas e bem definidas. Isso torna o código
 * mais modular, fácil de entender e de manter.
 */
public class Pessoa {
    private String nome;
    private int idade;

    public void salvar() {
        // Código para salvar a pessoa no banco de dados
    }
}

