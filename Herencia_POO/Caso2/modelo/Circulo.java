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
        double radio = diametro/2;
        area = Math.round(Math.PI * Math.pow(radio, 2));
    }

    public void calcularPerimetro(double diametro)
    {
        perimetro = Math.round(2*Math.PI*(diametro/2));
    }
}
