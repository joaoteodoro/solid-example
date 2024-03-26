package interf.segregation.principle.good;

/**
 * Com essa abordagem, cada classe implementa apenas os métodos que realmente precisa. Isso torna o código mais modular
 * e flexível e atende ao princípio de Segregação de Interfaces.
 */
public class Pinguin implements AnimalQueCome, AnimalQueDorme, AnimalQueNada {
    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void nadar() {

    }
}
