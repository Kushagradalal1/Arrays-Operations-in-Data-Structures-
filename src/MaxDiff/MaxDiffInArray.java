package MaxDiff;

public class MaxDiffInArray {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1}; int n=7;

        int val=maxDiff(arr,n);
        System.out.println(val);
    }

    public static int maxDiff(int arr[], int n){
        int res=arr[1]-arr[0];
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                res= Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
}
