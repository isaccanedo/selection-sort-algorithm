package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class SelectSort {

    /**
     *
     * @param arr
     */

    public void sortArr(int[] arr) {
        int selectedValue, swapValues;
        for (int i=0; i<arr.length-1; i++) {
            selectedValue = i; // selecione o primeiro valor da esquerda
            for (int n=i+1; n < arr.length; n++) { // obtenha outro valor próximo a selectedValue
                if (arr[n] < arr[selectedValue]) { // comparar selectedValue com n
                    selectedValue =n; // se n <valor selecionado, troque-os
                }
            }
            swapValues = arr[selectedValue];
            arr[selectedValue] = arr[i];
            arr[i] = swapValues; // trocar o selectedValue (valor selecionado) para a posição atual
        }
    }

    /**
     *
     * @param arr
     */

    public void showArr(int[] arr) { // exibir o conteúdo da matriz
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

}