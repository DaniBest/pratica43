package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class Retangulo implements FiguraComLados {

    private double base;
    private double altura;

    public Retangulo() {
        base = altura = 0;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public double getPerimetro() {
        return (getBase() + getAltura()) * 2;
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public double getLadoMenor() {
        if (altura < base) {
            return altura;
        } else {
            return base;
        }
    }

    @Override
    public double getLadoMaior() {
        if (altura > base) {
            return altura;
        } else {
            return base;
        }
    }

}
