/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaed2;

import java.util.Scanner;

/**
 *
 * @author 13912471673
 */
public class BubbleSort {
    public static long compara=0, trocas=0;
    public static void bSort(int array[]){
        for (int fase = 1; fase < array.length; fase++) {
        for (int comp = 0; comp < array.length - fase; comp++) {
            compara++;
            if (array[comp] < array[comp + 1]) { // Verifica se precisa trocar para ordenação decrescente
                trocas++;
                int temp = array[comp];
                array[comp] = array[comp + 1];
                array[comp + 1] = temp;
            }//fim do if    
        }//fim do for comp
    }//fim do for fase
    }
 
}

     
