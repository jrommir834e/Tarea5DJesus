/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author jesus
 */
public class Bicicleta {
    
    //Atributos encapsulados
    
    private int numRuedas;
    private String modelo;
    private String tipoCadena;

    
    //Constructor parametrizado
    public Bicicleta(int numRuedas, String modelo, String tipoCadena) {
        this.numRuedas = numRuedas;
        this.modelo = modelo;
        this.tipoCadena = tipoCadena;
    }
    
    //Constructor por defecto
    public Bicicleta(){
        
    }
    
    //Getters y Setters

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCadena() {
        return tipoCadena;
    }

    public void setTipoCadena(String tipoCadena) {
        this.tipoCadena = tipoCadena;
    }
    
    
    
}
