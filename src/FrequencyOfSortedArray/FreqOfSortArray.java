package FrequencyOfSortedArray;

public class FreqOfSortArray {
    public static void main(String[] args) {
        int arr[]={10,10,10,25,30,30}; int n=6;
        freqCout(arr,n);
    }
    public static void freqCout(int arr[], int n){
        int freq=1;
        for (int i=1; i<n; i++){
            if (arr[i]==arr[i-1]){
                freq++;
            }else {
                System.out.println(arr[i-1]+" "+freq);
                freq=1;
            }
        }
        System.out.println(arr[n-1]+" "+freq);
    }
}
