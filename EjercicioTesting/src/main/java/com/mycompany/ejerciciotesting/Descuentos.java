

package com.mycompany.ejerciciotesting;


public class Descuentos {

    public static int calcularDescuento(Cliente c){
        
        if(c.getYear()>5){
            return 10;
        }else{
            return 0;
        }
       
    }
}
