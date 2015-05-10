package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class Quadrado extends Retangulo implements FiguraComLados {

    public Quadrado() {
        super();
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getBase();
    }
}
