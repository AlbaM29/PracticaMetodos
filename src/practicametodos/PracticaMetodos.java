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
public class PracticaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ;
       
       int resultado = sumar(sumar(9, 23), 7);
        System.out.println(concatenar("El resultado es", "" + resultado));
        
        int resultado2 = sumar (sumar (8, 12), 10);
        boolean mayor = comprobar (resultado2);
        if (comprobar(resultado2))
            System.out.println("Es mayor");
        else
            System.out.println("No es mayor");
        MisMetodosPractica mismetodospractica = new MisMetodosPractica();
        mismetodospractica.comprobar(resultado);
        mismetodospractica.imprimir(resultado, resultado2);
    }
    
    public static int sumar (int n1, int n2){
          //return termina el metodo y debe regresar una respueta del mismo tipo de metodo 
          return n1 + n2;
    }
     public static String concatenar (String cadena1, String cadena2){
          return cadena1.concat(" "). concat(cadena2);
      }
     public static boolean comprobar (int m){
         return m > 10;
     }

}
    
    

