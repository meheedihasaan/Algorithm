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

    Worst Case: O(n^2)
    Best Case: O(n)
    Memory Complexity: O(1)

*/

public class BubbleSort_Optimized {
    
    //Method for Bubble Sort
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            //Comparing every adjacent elements and swap them
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            //If Array is already sorted
            if(flag){
                break;
            }
        }
    }
    
    //Method for printing Array elements
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
