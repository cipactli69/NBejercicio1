/*
 * All rights reserved @cipactli69
 * 
 * Muestra los primeros 100 números primos (1, 2, 3, 5, 7, 11, 13...)
 * número primo es un número natural mayor que 1 que tiene únicamente dos divisores positivos distintos: él mismo y el 1.​​
*/

package com.mycompany.cje1;

/**
 *
 * @author @cipactli69
 */
public class CJE1 {

    public static void main(String[] args) {
        String resultado = "";
        int contador = 0;
        int num = 1;    
        while(contador < 100){
            if(NumeroPrimo(num)){
                resultado += num + ", ";
                contador ++;
            }
            num++; 
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
    }
      
        
       
    private static Boolean NumeroPrimo(Integer numero){
        Boolean esPrimo = true;
        for(int i=2; i<numero; i++){
            if(numero %i == 0){
                esPrimo = false;
            }
        }
        return (esPrimo);
    }// fin main
}//fin de la clase xdxxd

