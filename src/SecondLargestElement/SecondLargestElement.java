package SecondLargestElement;

public class SecondLargestElement {
    public static void main(String[] args) {
        int n=4;
        int arr[]={10, 5, 20, 8};
        int largestIndex=largestElement(arr,n);
        int secondLargestIndex=secondLargestElement(arr,n,largestIndex);
        System.out.println("Largest Element at Index is : "+largestIndex);
        System.out.println("Second Largest Element at Index is : "+secondLargestIndex);
    }

    public static int largestElement(int arr[], int n){
        int largestIndex=0;
        for (int i=1; i<n; i++){
            if (arr[i]>arr[largestIndex]){
                largestIndex=i;
            }
        }
        return largestIndex;
    }
    public static int secondLargestElement(int arr[], int n, int largestIndex){
        int secondLargestIndex=-1;
        for (int i=0; i<n; i++){
            if (i!=largestIndex){
                if (secondLargestIndex==-1 || arr[i]>arr[secondLargestIndex]){
                    secondLargestIndex=i;
                }
            }
        }
        return secondLargestIndex;
    }
}
