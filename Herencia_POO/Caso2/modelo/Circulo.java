package modelo;

public class Circulo extends Figura
{
    public double diametro;

    public Circulo(double diametro)
    {
        this.diametro = diametro;
    }

    public void calcularArea(double diametro)
    {
        area = Math.PI * diametro;
    }

    public void calcularPerimetro(double diametro)
    {
        perimetro = (2*Math.PI*(diametro/2));
    }
}
