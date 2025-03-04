//merge sort
import java.util.*;
public class qn4 {
    public static void main(String args[]){
        int arr[]={31,32,33,34,35,36,37,38};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+i+1];
        }
        int l=0;
        int j=0;
        int k=low;
        while(l<n1 && j<n2){
            if(L[l]<=R[j]){
                arr[k++]=L[l++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        while(l<n1){
            arr[k++]=L[l++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
}
