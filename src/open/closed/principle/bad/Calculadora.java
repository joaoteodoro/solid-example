package open.closed.principle.bad;

/**
 * A classe Calculadora está violando o OCP poque está "fechada para modificação". Se você precisar adicionar uma
 * nova operação matemática, precisará modificar a classe Calculadora. Isso pode levar a erros e dificultar a
 * manutenção do código.
 */
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}
