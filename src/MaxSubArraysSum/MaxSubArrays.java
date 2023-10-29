package MaxSubArraysSum;

public class MaxSubArrays {
    public static void main(String[] args) {
        int arr[]={5,8,3}; int n=3;
        int res=maxSubArrays(arr,n);
        System.out.println("Max Sub arrays sum is : "+res);
    }
    public static int maxSubArrays(int arr[], int n){
        int res=0;
        for (int i=0; i<n; i++){
            int curr=0;
            for (int j=i; j<n; j++){
                curr=curr+arr[j];
                res= Math.max(res,curr);
            }
        }
        return res;
    }
}
