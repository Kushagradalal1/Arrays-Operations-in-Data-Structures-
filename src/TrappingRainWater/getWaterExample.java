package TrappingRainWater;

public class getWaterExample {
    public static void main(String[] args) {
        int arr[]={3,0,1,2,5}; int n=5;
        int units=getWater(arr,n);
        System.out.println("Water Unit is : "+units);
    }
    public static int getWater(int arr[], int n){
        int res=0;
        for (int i=1; i<n-1; i++){
            int lmax=arr[i];
            //left maximum for loop :
            for (int j=0; j<i; j++){
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax=arr[i];
            //right maximum for loop :
            for (int j=0; j<n; j++){
                rmax = Math.max(rmax,arr[j]);
            }
            res = res + Math.min(lmax,rmax)-arr[i];
        }
        return  res;
    }
}
