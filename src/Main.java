public class Main {
    public static void main(String[] args) {
        int[] arr = {3,9,1,8,6,7,2,13,11};
        int arrSize = arr.length;

        System.out.println("...........................");
        System.out.print("Array is: ");
        for(int i: arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("...........................");
        System.out.println("Bubble Sorting");
        System.out.println("...........................");
        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.performBubbleSort(arr, arrSize);
        bubbleSort.printSortedArray(arr);
        System.out.println("...........................");
        System.out.println("Selection Sorting");
        System.out.println("...........................");
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.performSelectionSort(arr, arrSize);
        bubbleSort.printSortedArray(arr);
        System.out.println("...........................");
        System.out.println("...........................");
    }
}