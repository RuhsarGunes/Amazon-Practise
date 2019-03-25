/*
 Merge Sort implementation
 */
package mergesort;

public class MergeSort {

    public static void sort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right){
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] Left = new int[n1];
        int[] Rigth = new int[n2];
        
        for(i = 0; i < n1; i++){
            Left[i] = arr[left + i];
        }
        for(j = 0; j < n2; j++){
            Rigth[j] = arr[mid + 1 + j];
        }
        
        i = 0;//initial index of first subarray
        j = 0; // initial index of second subarray
        k = left;//initial index of merged subarray
        
        while(i < n1 && j < n2){
            if(Left[i] <= Rigth[j]){
                arr[k] = Left[i];
                i++;
            }else{
                arr[k] = Rigth[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = Rigth[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,2};
        sort(arr, 0, arr.length -1);
        for(int i = 0; i < arr.length; i++){
             System.out.println(arr[i]);
        }
       
    }
    
}
