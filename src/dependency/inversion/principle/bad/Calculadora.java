package dependency.inversion.principle.bad;

/**
 * A classe Calculadora viola o DIO porque depende diretamente do banco de dados. Isso torna a classe menos flexivel e
 * difícil de testar.
 */
public class Calculadora {
    public void calcular(int a, int b) {
        int resultado = a + b;

        // Código para salvar o resultado no banco de dados
    }
}
