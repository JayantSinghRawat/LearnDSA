import java.util.*;

public class QuickSort {
    public static void printarr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        //last element
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);


    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;  //to make space for smaller element

        for(int j = si; j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; //index of pivot
    }



     public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
