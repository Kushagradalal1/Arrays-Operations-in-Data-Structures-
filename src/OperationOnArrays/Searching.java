package OperationOnArrays;
/*
Searching on Unsorted Array:
             0   1  2  3
i/P : arr[]={20, 5, 7, 25}
x=5
o/O : 1 (index)

             0   1  2  3
i/P : arr[]={20, 5, 7, 25}
x=15
o/O : -1 (index)

-> Time Complexity is O(n) : Linear search.
If the element we want to search and if that element is not present in that case
we need to traverse whole array.
-> Time Complexity is O(logn)
If we have sorted arrays.Example : Binary Search.

 */
public class Searching {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50}; int n=5; int x=20;
        int res=search(arr,n,x);
        //printing the search element index:
        System.out.println("Element "+x+" Found At Index : "+res);
    }
    public static int search(int arr[], int n, int x){
        for (int i=0; i<n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
