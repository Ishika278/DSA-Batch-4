public class containmaxarea {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int left = 0 ;
        int right = arr.length - 1 ;
        int max_area = 0 ;
        int curr_area ;
        while(left < right){
            int h = Math.min(arr[left] , arr[right]);
            int width = right - left ;
            curr_area = h * width ;
            max_area = Math.max(max_area , curr_area);

             if (left < right){
                left++;
             } else if(left > right){
                right--;
             }else{
                left++;
                right--;
             }
        }
        System.out.println("Maximum area in the container : " +max_area );
    }
}
