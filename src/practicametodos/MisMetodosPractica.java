/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

/**
 *
 * @author alba
 */
public class MisMetodosPractica {
    public  void imprimir (/*parametros*/ int n1, int n2){
        int resultado = n1 +n2;
        
        System.out.println("suma: " + resultado);
}
public  int sumar (int n1, int n2){
          //return termina el metodo y debe regresar una respueta del mismo tipo de metodo 
          return n1 + n2;
    }
     public  String concatenar (String cadena1, String cadena2){
          return cadena1.concat(" "). concat(cadena2);
      }
     public  boolean comprobar (int m){
         return m > 10;
     }
}

