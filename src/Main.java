import exchange.QuickSort;
import select.Select;
import standard.StandardArrBuilder;
import standard.StandardPrint;

public class Main {

    public static void main(String[] args) {

        int[] arr = StandardArrBuilder.roundIntegerArrrayBuild(10);


        System.out.print("排序前：");
        StandardPrint.IntegerArrPrint(arr);

        long start = System.currentTimeMillis();
        QuickSort.simpleQuickSort(arr);

        long end = System.currentTimeMillis();

        System.out.print("排序后：");
        StandardPrint.IntegerArrPrint(arr);

        System.out.println("耗时：");
        System.out.println(end - start);
    }
}
