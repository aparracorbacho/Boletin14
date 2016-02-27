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
public class ConversorTemperaturas {
  public final static float TLIMITE=80;
  public float faren,reamur;
    
     public float centigradosAFharenheit(float temp) throws TemperaturaErradaExcepcion{ 
        if (temp<TLIMITE) {
            throw new TemperaturaErradaExcepcion(" La temperatura tiene que ser mayor a 80");
        } else {          
        faren=(float)(9.0/5.0*temp+32);
        return faren;
        }
    }
    
    public void centigradosAReamur(float temp){
    
        try{
        reamur=(float)(4.0/5.0*temp);
              
        if (temp<TLIMITE){throw new TemperaturaErradaExcepcion();}
            } else { System.out.println(" temperatura  : "+ reamur);
        }catch(TemperaturaErradaExcepcion error1){             
            
            System.out.println("erro2 "+ error1.getMessage());       
        } 
    }
    
}
