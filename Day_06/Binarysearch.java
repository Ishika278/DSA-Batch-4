public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,5,6};
        int target = 5;
        int low = 0;
        int high = arr.length - 1 ;
        while(low <=high){
            int mid = low + (high - low) /2;
            if(arr[mid] == target){
            System.out.println("Element found at index : " + mid) ;
            return;
            }
            else if(arr[mid] < target){
                low = mid + 1 ;
                System.out.println("Element is found at  index : " + mid) ;
                break;
            }
            else{
                high = mid - 1 ;
                System.out.println("Element is found at index : " + mid) ;
            
            }
        }
    System.out.println("Element not found in the array") ;

    }
}
