package interf.segregation.principle.bad;

/**
 * A interface Animal viola o ISP porque força todas as classes que a implementam a ter métodos que nem todas as classes
 * precisam. Por exempl, um Cachorro não precisa saber nadas.
 */
public interface Animal {
    void comer();
    void dormir();
    void nadar();
}
