package OperationOnArrays;
/*
Deletion Operation :
i/P : arr[]={3, 8, 12, 5, 6}
x=12
o/P : arr[]={3, 8, 5, 6, _}

i/P : arr[]={3, 8, 12, 5, 6}
x=6
o/P : arr[]={3, 8, 12, 5, _}

Time Complexity revision :
insertion : O(n)
search : O(n) linear search
search : O(logn) sorted arrays
delete : O(n)
Get ith element : O(1)
Update the ith element : O(1)
Insert at the end and delete from the end will do at constant time O(1)

 */
public class Deletion {
    public static void main(String[] args) {
        int n=5; int x=12;
        int arr[]={3,8,12,5,6};

        System.out.println("Before Deletion : ");
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        int res=delete(arr,n,x);
        System.out.println("After Deletion : ");
        for (int i=0; i<res; i++){
            System.out.println(arr[i]);
        }
    }

    public static int delete(int arr[], int n, int x){
        int i;
        for (i=0; i<n; i++){
            if (arr[i]==x){
                break;
            }
        }
        if (i==n){
            return n;
        }
        for(int j=i; j<n-1; j++) {
            arr[j] = arr[j + 1];
        }
        return n-1;
    }
}
