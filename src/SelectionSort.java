public class SelectionSort {
    public int[] performSelectionSort(int[] arr, int size) {

        for(int i=0;i<size-1;i++) {

            int minIndex = i;
            for(int j=i+1;j<size;j++) {
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

    public void printArray(int[] arr) {

        System.out.println("Sorted array: ");
        for(int ele: arr) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

}
