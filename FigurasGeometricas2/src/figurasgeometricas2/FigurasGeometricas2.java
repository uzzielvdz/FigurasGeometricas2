/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas2;

/**
 *
 * @author grace
 */
public class FigurasGeometricas2 {

    int area;
    String mensaje;
    
   
    
    public void AreaCuadrado (int ladoC) {
    area = ladoC*ladoC;
    mensaje = "El area del cuadrado es igual a: " + area;
    System.out.println(mensaje);
    }
    
    public void AreaRectangulo (int alturaR, int anchoR) {
    area = anchoR*alturaR;
    mensaje = "El area del rectangulo es igual a: " + area;
    System.out.println(mensaje);
    }
    
    public void AreaTriangulo (int alturaT, int baseT) {
    area = alturaT*baseT;
    mensaje = "El area del triangulo es igual a: " + area;
    System.out.println(mensaje);
    }
    
    public void AreaCirculo (int radioC) {
    area = (int) (3.1416 * radioC);
    mensaje = "El area del circulo es igual a: " + area;
    System.out.println(mensaje);
    }
}
    
    