package LeftRotateByOne;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; int n=5;
        System.out.println("Before Rotation by One position : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        leftRotateByOne(arr,n);
        System.out.println();
        System.out.println("After Rotation by One position : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void leftRotateByOne(int arr[], int n){
        int temp=arr[0];
        for (int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}
