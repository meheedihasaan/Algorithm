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
public class BinarySearch_Recursion {    
    
    public int binarySearch(int arr[], int item, int beg, int end){
        int mid = beg + (end-beg)/2;
        if(end >= beg){
            if(arr[mid] == item){
                return mid;
            }
            
            //Item presents in the Left SubArray
            if(arr[mid] > item){
                return binarySearch(arr, item, beg, mid-1);
            }
            
            //Item presents in the Right SubArray
            if(arr[mid] < item){
                return binarySearch(arr, item, mid+1, end);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        //Sorted Array
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int n = arr.length-1;
        int x = 23;
        
        //Object And Method Calling
        BinarySearch_Recursion bs = new BinarySearch_Recursion();
        int result = bs.binarySearch(arr, x, 0, n);  //Pass The array, searching item, beginning index and ending index
        
        if(result == -1){
            System.out.println("Item is not present");
        }
        else{
            System.out.println("Item found at index "+result);
        }
    }
    
}
