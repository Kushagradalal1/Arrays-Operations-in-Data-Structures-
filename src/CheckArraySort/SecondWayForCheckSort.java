package CheckArraySort;

public class SecondWayForCheckSort {
    public static void main(String[] args) {
        int n=4;
        int arr[]={1,22,3,4};
        boolean res=sort(arr);
        System.out.println("If sorted then true ? otherwise false : "+res);
    }
    public static boolean sort(int arr[]){
        for (int i=1; i< arr.length; i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
