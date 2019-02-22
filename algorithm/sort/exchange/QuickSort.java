package exchange;

import standard.StandardPrint;

public class QuickSort {

    public static int[] simpleQuickSort(int[] arr) {
        if (arr.length == 0) return arr;
        quickSort(arr, 0 , arr.length - 1);
        return arr;
    }

    /**
     * 简单的int类型数据快速排序
     * @param arr
     * @param low
     * @param high
     */
    private static void quickSort(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int key = arr[low];
        int temp;

        while(end > start){
            while(end > start && arr[end] >= key) end--;

            if (arr[end] <= key) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            while(end > start && arr[start] <= key) start++;

            if (arr[start] >= key) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            StandardPrint.IntegerArrPrint(arr);
        }

        if (start > low) quickSort(arr, low, start - 1);
        if (end < high) quickSort(arr, end + 1, high);

//        return arr;
    }
}
