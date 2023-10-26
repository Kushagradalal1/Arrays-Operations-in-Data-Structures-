package OperationOnArrays;
/*
Example : Insertion in Arrays :
_______________________________

             1  2  3 4 5
i/P : arr[]={5,10,20,_,_}
indexing start at 1
size of an Array is : 5
x=7 : x is the element we want to insert
pos=2 : pos is the position
o/P : arr[5,7,10,20,_]


 */
public class Insertion {
    public static void main(String[] args) {
        int n=3; int x=7; int pos=2;
        int cap=5;
        int arr[]=new int[cap];
        arr[0]=5;
        arr[1]=10;
        arr[2]=20;
        System.out.println("Before Insertion : ");
        for (int i=0; i<=cap-1; i++){
            System.out.println(arr[i]);
        }
        int res=insert(arr,n,cap,pos,x);
        System.out.println("After Insertion : ");
        for (int i=0; i<=cap-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static int insert(int arr[], int n, int cap, int pos, int x){
        if(n==cap){
            return n;
        }
        //inserting at which position :
        int idx=pos-1;
        for (int i=n-1; i>=idx; i--){
            arr[i+1]=arr[i];

        }
        arr[idx]=x;
        return n+1;
    }
}
