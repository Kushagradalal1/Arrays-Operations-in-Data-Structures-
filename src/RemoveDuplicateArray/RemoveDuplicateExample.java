package RemoveDuplicateArray;

public class RemoveDuplicateExample {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
        System.out.println("Before Removing Duplicates Element : ");
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        int resOne=removeDuplicates(arr,n);
        System.out.println("After Removing Duplicates Element : ");
        for (int i=0; i<resOne; i++){
            System.out.println(arr[i]);
        }
    }
    public static int removeDuplicates(int arr[], int n){
        int res=1;
        for (int i=1; i<n; i++){
            if (arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
