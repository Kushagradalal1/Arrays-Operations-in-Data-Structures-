package LeftRotateByDthPosition;

public class LeftRotateByDthPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; int n=5;
        int d=2;
        System.out.println("Before Rotate : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        leftRotateByDthPosition(arr,n,d);
        System.out.println();
        System.out.println("After Rotate : ");
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
    public static void leftRotateByDthPosition(int arr[], int n, int d){
        for (int i=0; i<d; i++){
            leftRotateByOne(arr,n);
        }
    }
}