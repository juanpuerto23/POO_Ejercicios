package ejecutable;

import modelo.*;

public class Test 
{
    public static void main(String[] args) 
    {
        Vaca daisy = new Vaca();
        Animal animal = new Vaca();
        Serpiente serpiente = new Serpiente();
        
        System.out.println("Daisy dice: " + daisy.hablar());
        System.out.println("Animal dice: " + animal.hablar());
        System.out.println("Serpiente dice: " + serpiente.hablar());
    }    
}
