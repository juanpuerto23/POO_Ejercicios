package modelo;

public class Figura 
{
    protected double area;
    protected double perimetro;
    
    public Figura()
    {
        this.area = 0;
        this.perimetro = 0;
    }

    public double mostrarArea()
    {
        return this.area;
    }

    public double mostrarPerimetro()
    {
        return this.perimetro;
    }
}
