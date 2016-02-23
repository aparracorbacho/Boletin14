/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author aparracorbacho
 */
public class TemperaturaErradaExcepcion extends Exception {
     public TemperaturaErradaExcepcion(){
        super("Mensaje por defecto, la temperatura tiene que ser mayor a 80");
    }
    public TemperaturaErradaExcepcion(String mensaxe){
        super(mensaxe);
    }
}
