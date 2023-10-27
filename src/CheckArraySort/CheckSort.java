package CheckArraySort;

public class CheckSort {
    public static void main(String[] args) {
        int n=4;
        int arr[]={1,23,3,4};
        if(sort(arr,n)){
            System.out.println("Sort");
        }else {
            System.out.println("UnSort");
        }
    }
    public static boolean sort(int arr[], int n){
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
