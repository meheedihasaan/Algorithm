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
public class Example {
    
    public static void linearSearch(int arr[], int x){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int position = -1;
        for(left = 0; left <= right;) {
            if(x == arr[left]){
                position = left;
                System.out.println("Index : "+ position);
                System.out.println("Attempt : "+ (position+1));
            }
            
            if(x == arr[right]){
                position = right;
                System.out.println("Index : "+ position);
                System.out.println("Attempt : "+ (n-position));
            }
            
            left++;
            right--;
        }
        
        if(position == -1){
            System.out.println("Current element is not present in the Array!");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 100;
        linearSearch(arr, x);
    }
    
}
