package modelo;

public class Rectangulo extends Figura
{
    public double base;
    public double altura;

    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public void calcularPerimetro(double base, double altura)
    {
        perimetro = (2*base) + (2*altura);
    }

    public void calcularArea(double base, double altura)
    {
        area = base * altura;
    }
}
