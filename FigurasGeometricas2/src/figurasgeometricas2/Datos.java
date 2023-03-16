/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas2;
import java.util.Scanner;

/**
 *
 * @author grace
 */
public class Datos {
    
    static int radioC, alturaR, alturaT, baseT, anchoR, ladoC;
    Scanner leer = new Scanner(System.in);
    FigurasGeometricas2 Fig = new FigurasGeometricas2();
    public void Plo()
    {
        System.out.println("Cual es el valor del radio? ");
        radioC = leer.nextInt();
        Fig.AreaCirculo(radioC);
        
         System.out.println("Cual es el valor del lado? ");
        ladoC = leer.nextInt();
        Fig.AreaCuadrado(ladoC);
        
         System.out.println("Cual es el valor de la base del triangulo? ");
        baseT = leer.nextInt();
        System.out.println("Cual es el valor de la altura del triangulo? ");
        alturaT = leer.nextInt();
        Fig.AreaTriangulo(alturaT, baseT);
        
         System.out.println("Cual es el valor de la base del rectangulo");
        anchoR = leer.nextInt();
         System.out.println("Cual es el valor de la altura del rectangulo");
         alturaR = leer.nextInt();
        Fig.AreaRectangulo(anchoR, alturaR);
        
    }
}
