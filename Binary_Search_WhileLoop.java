 /**
 *
 * @author Mehedi
 */
 
public class BinarySearch_WhileLoop {
    
    public int binarySearch(int arr[], int item, int beg, int end){
        while(end >= beg){
            int mid = beg + (end-beg)/2;
            if(arr[mid] == item){
                return mid;
            }
            
            //Item presents in the left SubArray
            if(arr[mid] > item){
                end = mid - 1;
            }
            
            //Item presents in the right SubArray
            if(arr[mid] < item){
                beg = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        //Sorted Array
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int n = arr.length - 1;
        int x = 23;
        
        //Object And Method Calling
        BinarySearch_WhileLoop bsw = new BinarySearch_WhileLoop();       
        int result = bsw.binarySearch(arr, x, 0, n); //Pass The array, searching item, beginning index and ending index
        
        if(result == -1){
            System.out.println("Item is not found!");
        }
        else{
            System.out.println("Item found at index "+result);
        }
    }
    
}
