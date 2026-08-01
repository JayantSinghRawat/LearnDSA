

public class BackTrackingOnArrays {


    public static void change(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            return;
        }

        //recursion
        arr[i] = val;
        change(arr,i+1,val+1);
        arr[i] -=2;

    }

    public static void printarr(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr,0,1);
        printarr(arr);

    }
}
