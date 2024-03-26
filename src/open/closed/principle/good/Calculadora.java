package open.closed.principle.good;

/**
 * A classe Calculadora agora está "aberta para extensão" e "fechada para modificação". Você pode adicionar novas
 * operações matemáticas sem modificar a classe Calculadora. Isso torna o código mais flexivel e fácil de manter.
 */
public class Calculadora {
    private OperacaoMatematica operacao;

    public Calculadora(OperacaoMatematica operacao) {
        this.operacao = operacao;
    }

    public int calcular(int a, int b) {
        return operacao.calcular(a, b);
    }
}

