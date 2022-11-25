/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

/**
 *
 * @author User
 */
public class MinimumProductSubsetOfAnArray {
    
    public static int minProduct(int arr[]){
        int n = arr.length;
        int zeroCount = 0;
        int negCount = 0;
        int negMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int product = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                negCount++;
                product*=arr[i];
                negMax = Math.max(negMax, arr[i]);
            }
            else if(arr[i] == 0){
                zeroCount++;
            }
            
            //Minimum of Positive number
            min = Math.min(arr[i], min);
        }
        
        //If array contains at least one zero and not contains negative number then minimum product is 0
        if(zeroCount > 0 && negCount == 0){
            return 0;
        }
        
        if(negCount > 0){            
            if(negCount%2 == 0 || negCount == 1){
                return product;   //If array contains even number of neg number or only one negative number then ans is their product
            }
            else{
                return product/negMax;  //If Odd, then divide product by maximum negative number
            }
        }
        //If array doesn't contain any zero and negative number then smallest positive number is the answer.
        return min;   
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,0,-5,-9,9,-10};
        System.out.println(minProduct(arr));
    }
    
}
