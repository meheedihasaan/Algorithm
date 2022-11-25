/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithm;

/**
 *
 * @author Acer
 */

/*

    Time Complexity: O(n^2)
    Space Complexity: O(1)

*/

public class SelectionSort_Unstable {
    
    
    //Method for Selection Sort
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            //Find the index of minimum element of the unsorted subArray
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            //Swap iTh element with the minimum element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    //Method for printing Array
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    
    //The Main Method
    public static void main(String[] args) {
        int arr[] = {50, 45, 35, 40, 30, 25, 20, 15, 10, 5};        
        System.out.println("Array elements before sorting: ");
        printArray(arr);
        
        System.out.println("Array elements after sorting: ");
        selectionSort(arr);
        printArray(arr);
    }
    
}
