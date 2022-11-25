/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgorithm;

/**
 *
 * @author Acer
 */
public class LinearSearch_Example {
    
    public int LinearSearch(int arr[], int item){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        //Sorted or Unsorted Array
        int arr[] = {1, 2, 4, 5, 3, 8, 6};
        int x = 5;
        
        //Object And Method Calling
        LinearSearch_Example lse = new LinearSearch_Example();
        int result = lse.LinearSearch(arr, x);
        
        if(result == -1){
            System.out.println("Item not found!");
        }
        else{
            System.out.println("Item found at index "+result);
        }
    }
    
}
