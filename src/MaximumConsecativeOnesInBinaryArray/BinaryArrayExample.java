package MaximumConsecativeOnesInBinaryArray;

public class BinaryArrayExample {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,0}; int n=6;
        int res=consecativeOnes(arr,n);
        System.out.println("Consecutive Ones is : "+res);

    }
    public static int consecativeOnes(int arr[], int n) {
        int curr = 0; int res=0;
        for (int i=1; i<n; i++){
            if (arr[i]==1){
                curr++;
                res=Math.max(res,curr);
            }else {
                curr=0;
            }
        }
        return res;
    }
}
