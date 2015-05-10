package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class Circulo extends Elipse {

    public Circulo() {
        super();
    }

    public Circulo(double raio) {
        super(raio, raio);
    }

    public double getRaio() {
        return getEixoX() / 2;
    }

    @Override
    public double getPerimetro() {
        return 2 * (Math.PI) * (getEixoX() / 2);
    }
}
