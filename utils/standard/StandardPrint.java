package standard;

public class StandardPrint {


    public static void IntegerArrPrint(int[] arr){

        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[arr.length - 1]);
        sb.append("]");
        System.out.println(sb);
    }
}
