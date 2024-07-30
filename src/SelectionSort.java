public class SelectionSort {
    public int[] performSelectionSort(int[] arr, int size) {

        for(int i=0;i<size;i++) {

            int minIndex = i;
            for(int j=i+1;i<size;i++) {
                if(arr[minIndex]>arr[j]) minIndex = j;
            }
            if(minIndex!=i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
