/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

/**
 *
 * @author User
 */
public class MaximumProductSubsetOfAnArray {
    public static int maxProduct(int arr[]){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int negMax = Integer.MIN_VALUE;
        long product = 1;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                zeroCount++;
                continue;
            }
            
            if(arr[i] > 0){
                posCount++;
                product = ((product%mod) * (arr[i]%mod))%mod;
            }
            else if(arr[i] < 0){
                negCount++;
                product = ((product%mod) * (arr[i]%mod))%mod;
                negMax = Math.max(negMax, arr[i]);
            }
        }
        
        if(zeroCount == n){
            return 0;
        }
        
        if(negCount%2 != 0){
            if(negCount == 1 && posCount == 0){
                return 0;
            }
            else{
                return (int)(product/negMax);
            }
        }
        return (int)product;
    }
    
    public static void main(String[] args) {
        int arr[] = {-2, 0, 2, 3, -3, -2};
        System.out.println(maxProduct(arr));
    }
}
