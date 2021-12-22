package B03.Problema2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        //calcularPrecio(int iaclm, Persona p, int plazas) 	
        //Persona(boolean enferma, boolean sintomas, boolean contacto, boolean pasaporte, boolean profimpre, int edad)
        
       Persona p1 = new Persona(true, true, true, false, false, 20);
       Persona p2 = new Persona(false, false, false, true, false, 18);
       Persona p3 = new Persona(false, false, false, true, true, 18); // profimpre true
       Persona p4 = new Persona(false, false, false, true, false, 70);
       Persona p5 = new Persona(false, false, false, true, true, 70);  //prof impre true
       
       Principal.calcularPrecio(0, p1, 80);
       Principal.calcularPrecio(0, p2, 80);
       Principal.calcularPrecio(50, p2, 80);
       Principal.calcularPrecio(50, p4, 80);
       Principal.calcularPrecio(150, p2, 80);
       Principal.calcularPrecio(150, p4, 80);
       Principal.calcularPrecio(250, p3, 80);
       Principal.calcularPrecio(250, p5, 80);
       Principal.calcularPrecio(250, p2, 80);
       Principal.calcularPrecio(250, p4, 80);
       Principal.calcularPrecio(400, p3, 80);
       Principal.calcularPrecio(400, p5, 80);
       Principal.calcularPrecio(400, p2, 80);
       Principal.calcularPrecio(400, p4, 80);
       Principal.calcularPrecio(600, p3, 80);
       Principal.calcularPrecio(600, p5, 80);
       Principal.calcularPrecio(600, p2, 80);
       Principal.calcularPrecio(600, p4, 80);
       
       
       
       
    }
}
