/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaed2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 13912471673
 */
public class JavaSortsBubble {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
       int tamanho;
       System.out.println("Tamanho do vetor:");
       tamanho = scanner.nextInt();
       int[] vetor = new int[tamanho];
       System.out.println("Dados vetor:");
       for(int i=0; i<vetor.length; i++){
           vetor[i] = scanner.nextInt();
       }   
        printArray(vetor);//mostrar o vetor
        BubbleSort.bSort(vetor);//ordenar
        System.out.println("Vetor ordenado");
        printArray(vetor);//mostrar ordenado
    }
    
    public static void printArray(int array[]){
         for(int i=0; i<array.length; i++){
             System.out.print(array[i]+"|");
         }
         System.out.println("\n");
    }   
    
}
