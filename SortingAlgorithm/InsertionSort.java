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
public class InsertionSort {
    
    public static void sort(int nums[]){
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > current){
                nums[j+1] = nums[j];
                j--;
            }
            j++;
            nums[j] = current;
        }
    }
     
    public static void main(String[] args) {
        int nums[] = {4,-1,7,-6,6,5,2,10};
        sort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    
}
