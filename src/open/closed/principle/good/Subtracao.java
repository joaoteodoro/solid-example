package open.closed.principle.good;

public class Subtracao implements OperacaoMatematica {
    @Override
    public int calcular(int a, int b) {
        return a - b;
    }
}
