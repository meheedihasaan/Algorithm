 /**
 *
 * @author Mehedi
 */
 
public class LinearSearch_Implement {
    
    public int linearSearch(int arr[], int item){
        int left = 0;
        int right = arr.length - 1;
        for (left = 0; left <= right;) {
            if(arr[left] == item){
                return left;
            }
            if(arr[right] == item){
                return right;
            }
            left++;
            right--;
        }
        return -1;      
    }
    
    public static void main(String[] args) {
        //Sorted Or Unsorted Array
        int arr[] = {1, 2, 5, 4, 3};
        int x = 5;
        
        //Object And Method Calling
        LinearSearch_Implement ls = new LinearSearch_Implement();
        int result = ls.linearSearch(arr, x); //Passing array and searching item.
        
        if(result == -1){
            System.out.println("Item not found!");
        }
        else{
            System.out.println("Item found at index "+result);
        }
    }
    
}
