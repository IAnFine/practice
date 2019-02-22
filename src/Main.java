import MedianSorted.Solution;
import exchange.QuickSort;
import standard.StandardArrBuilder;
import standard.StandardPrint;

public class Main {

    public static void main(String[] args) {

//        int[] arr = StandardArrBuilder.roundIntegerArrrayBuild(10);
        int[] arr = {1,3};
        int[] brr = {2};
//        StandardPrint.IntegerArrPrint(arr);
        String  a = "1010";
        String  b = "1011";


        Solution solution = new Solution();

        System.out.println(solution.findMedianSortedArrays(arr,brr));
//        StandardPrint.IntegerArrPrint();
//
//        System.out.print("排序前：");
//        StandardPrint.IntegerArrPrint(arr);
//
//        long start = System.currentTimeMillis();
//        QuickSort.simpleQuickSort(arr);
//
//        long end = System.currentTimeMillis();
//
//        System.out.print("排序后：");
//        StandardPrint.IntegerArrPrint(arr);
//
//        System.out.println("耗时：");
//        System.out.println(end - start);
    }
}
