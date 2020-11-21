package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Algoritmo de classificação de seleção");
        System.out.println("---------------------------------------------");

        int[] arr = {5,2,9,0,1};
        SelectSort selectSort= new SelectSort();

        System.out.print("Antes:\t");  selectSort.showArr(arr);
        selectSort.sortArr(arr); // sort the array
        System.out.print("Depois:\t"); selectSort.showArr(arr);
    }
}