/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaed2;

/**
 *
 * @author 13912471673
 */
public class SelectionSort {
    public static long compara=0, trocas=0;
   private static int indexMinArray(char array[], int posAtual) {
    int k = posAtual;
    for (int i = posAtual + 1; i < array.length; i++) {
        compara++;
        if (array[i] < array[k]) // Comparando caracteres
            k = i;
    }
    return k;
}

public static void Ssort(char array[]) {
    for (int i = 0; i < array.length - 1; i++) {
        int k = indexMinArray(array, i);
        trocas++;
        char temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
}

}
