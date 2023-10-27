package ReverseAnArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int n=4;
        int arr[]={10,5,23,6};
        System.out.println("Before Reverse : ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        reverse(arr,n);
        System.out.println("After Reverse : ");
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int arr[], int n){
        int low=0; int high=n-1;
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
