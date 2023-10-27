package LargestElementInArray;

public class LargestElementInArrayExample {
    public static void main(String[] args) {
        int n=5;
        int arr[]={10, 5, 20, 8, 100};

        int res=largestElement(arr,n);
        System.out.println("Largets element index is : "+res);
    }
    public static int largestElement(int arr[], int n){
        int largestIndex=0;
        for(int i=1; i<n; i++){
            if (arr[i]>arr[largestIndex]){
                largestIndex=i;
            }
        }
        return largestIndex;
    }
}
