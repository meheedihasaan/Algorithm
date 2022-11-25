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

    Time Complexity: O(n^2) - even the array is sorted
    Space Complexity: O(1)

*/

public class BubbleSort {
    
    //Method for Bubble Sort
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //Comparing every adjacent element and swap them
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    //Method for printing Array element
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
        
    //The Main Method
    public static void main(String[] args) {
        int arr[] = {50, 45, 35, 40, 30, 25, 20, 15, 10, 5};
        System.out.println("Array elements before sorting: ");
        printArray(arr);
        
        System.out.println("Array elements after sorting: ");
        bubbleSort(arr);
        printArray(arr);
    }
    
}
