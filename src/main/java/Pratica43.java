
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/**
 *
 * @author DANIEL
 */
public class Pratica43 {

    public static void main(String[] args) {
        Elipse elipse = new Elipse(3, 8);
        Circulo circulo = new Circulo(4);
        Retangulo r = new Retangulo(4, 2);
        Quadrado q = new Quadrado(4);
        TrianguloEquilatero te = new TrianguloEquilatero(4);

        System.out.println("Área de " + elipse + " = " + elipse.getArea());
        System.out.println("Perímetro de " + elipse + " = " + elipse.getPerimetro());
        System.out.println("Área de " + circulo + " = " + circulo.getArea());
        System.out.println("Perímetro de " + circulo + " = " + circulo.getPerimetro());
        System.out.println("Área de " + r + " = " + r.getArea());
        System.out.println("Perímetro de " + r + " = " + r.getPerimetro());
        System.out.println("Área de " + q + " = " + q.getArea());
        System.out.println("Perímetro de " + q + " = " + q.getPerimetro());
        System.out.println("Área de " + te + " = " + te.getArea());
        System.out.println("Perímetro de " + te + " = " + te.getPerimetro());
    }

}
