package interf.segregation.principle.bad;

public class Cachorro implements Animal {
    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void nadar() {
        // Pinguem pode nadas, Cachorro não necessariamente...
    }
}
