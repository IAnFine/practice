package select;

public class Select {

    /**
     * 简单选择排序
     * @param arr
     * @return
     */
    public static int[] simpleSelectSort(int[] arr){
        int length = arr.length;
        if (length == 0) return arr;

        for (int i = 0; i < length; i++) {

            int index = i;

            for (int j = i; j < length; j++) {
                if (arr[index] > arr[j]) index = j;
            }

            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

//            StandardPrint.IntegerArrPrint(arr); 标准输出数组
        }

        return arr;
    }
}
