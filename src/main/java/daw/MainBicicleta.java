/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class MainBicicleta {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta(100, "El biciclón", 
                "Terreneitor");
        
        System.out.println(b1);
        System.out.println(b2);
    }
}
