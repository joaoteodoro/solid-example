package single.responsibility.principle.bad;

/**
 * A classe Pessoa viola o SRP porque possui duas responsabilidades distintas:
 * - Salvar a pessoa no banco de dados
 * - Enviar um email para a pessoa
 * Essas responsabilidades não estão relacionadas entre si e , portanto, devem ser separadas em classes diferentes.
 */
public class Pessoa {
    private String nome;
    private int idade;

    public void salvar() {
        // Código para salvar a pessoa no banco de dados
    }

    public void enviarEmail() {
        // Código para enviar um email para a pessoa
    }
}
