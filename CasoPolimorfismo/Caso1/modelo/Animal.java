package modelo;

public class Animal 
{
    private int peso = 0;
    
    public void setPeso(int peso)
    {
        this.peso = peso;
    }

    public int getPeso()
    {
        return peso;
    }

    public String hablar()
    {
        return "Los animales no hablan";
    }
}
