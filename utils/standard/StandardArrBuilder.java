package standard;

import java.util.Collections;

public class StandardArrBuilder {

    private static int ROUND_SEED = 10;
    private static int[] EMPTY_INTEGER_ARR = new int[0];


    public static int[] roundIntegerArrrayBuild(int length){
        if (length == 0) return EMPTY_INTEGER_ARR;

        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
            arr[i] = (int)(1+Math.random()*(ROUND_SEED));
        }

        return arr;
    }
}
