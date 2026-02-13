public class scndlast {
    public static void main(String[] args) {
       int[] arr ={-1,0,3,7,8};
       int first =-99999;
       int sec =-99999;

       for(int i=0; i<5; i++){
        if(arr[i]>first){
             sec = first;
            first =arr[i];
        }
        else if(arr[i]>sec){
            sec = arr[i];
        }
       }
       System.out.println("second largest:" + sec);
    }
    
}
