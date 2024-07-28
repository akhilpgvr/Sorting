public class BubbleSort {

    public int[] performBubbleSort(int[] arr, int size) {

        for(int i=0; i<size-1; i++) {
            for(int j=0; j<size-i-1; j++) {
                if(arr[j]> arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public void printSortedArray(int[] arr) {

        System.out.println("Sorted array: ");
        for(int ele: arr) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
