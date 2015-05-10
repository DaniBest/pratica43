package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class TrianguloEquilatero extends Retangulo implements FiguraComLados {

    public TrianguloEquilatero() {
        super();
    }

    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3) / 2);
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    @Override
    public double getPerimetro() {
        return 3 * getBase();
    }

    public double getLado() {
        return getBase();
    }

}
