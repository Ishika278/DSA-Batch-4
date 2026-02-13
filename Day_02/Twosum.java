public class Twosum {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,3,7};
        int target = 8;
        int n = arr.length;
        int ans;

        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                 ans = arr[i] + arr[j];
                if ( ans == target){
                   System.out.println("Two elements equal to Target value are : "+ arr[i] +  " and " + arr[j] );
                }
            }
       }    
    }
}
