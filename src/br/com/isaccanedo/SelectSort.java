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
            selectedValue = i; // select first value from the left
            for (int n=i+1; n < arr.length; n++) { // get another value next to selectedValue
                if (arr[n] < arr[selectedValue]) { // compare selectedValue to n
                    selectedValue =n; // if n < selectedValue, swap them
                }
            }
            swapValues = arr[selectedValue];
            arr[selectedValue] = arr[i];
            arr[i] = swapValues; // swap selectedValue to current position
        }
    }

    /**
     * 
     * @param arr
     */

    public void showArr(int[] arr) { // display content of array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

}