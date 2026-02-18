
public class peakelement {
    public static void main(String[] args) {
        int arr[] = {6,5,9,7,2,1,3,6,4,5};
        int n = arr.length;
        if(n == 1){
            System.out.println(arr[0]);
        }
        else if(arr[0] > arr[1]){
            System.out.println(arr[0]);
        }
        else if(arr[n-1] > arr[n-2]){
            System.out.println(arr[n-1]);
        }
        else{
            for(int i=1; i<n-2; i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    
}
