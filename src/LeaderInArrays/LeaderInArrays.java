package LeaderInArrays;
/*
i:P arr[]={7,10,4,3,6,5,2}
First Leader from back side is : 2
Second Leader compare with 2<5 : 5
Third Leader compare with 5<6 : 6
Fourth Leader compare with 6<10 : 10
o:P 10,6,5,2
 */
public class LeaderInArrays {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2}; int n=7;
        leader(arr,n);

    }
    public static void leader(int arr[], int n){
        int current_leader=arr[n-1];
        System.out.print(current_leader+" ");
        for (int i=n-2; i>=0; i--){
            if (current_leader<arr[i]){
                current_leader=arr[i];
                System.out.print(current_leader+" ");
            }
        }
    }
}
