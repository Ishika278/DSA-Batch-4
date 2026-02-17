import java.util.HashMap;

public class containduplicates {

    static boolean containduplicates(int[] arr , int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
         
        for(int i = 0 ; i < n ; i++ ){
            if(map.containsKey(arr[i])){
                return true;
            }else{
                map.put(arr[i], true);
            }
        }
          return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,2};
        int n = 6;
        System.out.println(containduplicates(arr,n));
    }
    
}
