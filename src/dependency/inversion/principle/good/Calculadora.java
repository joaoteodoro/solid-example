package dependency.inversion.principle.good;

public class Calculadora {
    private Armazenamento armazenamento;

    public Calculadora(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void calcular(int a, int b) {
        int resultado = a + b;

        // Armazenamento do resultado usando a interface Armazenamento
        armazenamento.salvar(resultado);
    }
}
