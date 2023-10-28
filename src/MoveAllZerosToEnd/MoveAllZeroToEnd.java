package MoveAllZerosToEnd;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int n=6;
        int arr[]={8,5,0,10,0,20};
        System.out.println("Before Statement : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        moveAllZerosToEnd(arr,n);
        System.out.println();
        System.out.println("After Statement : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void moveAllZerosToEnd(int arr[], int n){
        int nonZeroIndex=0;
        for (int i=0; i<n; i++){
            if (arr[i]!=0){
                arr[nonZeroIndex]=arr[i];
                nonZeroIndex++;
            }
        }
        for (int i=nonZeroIndex; i<n; i++){
            arr[i]=0;
        }
    }
}
