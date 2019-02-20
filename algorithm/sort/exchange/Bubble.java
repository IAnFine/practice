package exchange;

/**
 *
 *  冒泡排序
 */
public class Bubble {
    /**
     * 简单版冒泡排序 基础冒泡排序骨架
     * @param data
     * @return
     */
    public static int[] simpleBubblingSort(int[] data){
        int length;
        if ((length = data.length) == 0) return data;

        for(int i = 0; i < length; i++){

            for(int j = 0; j < length - i - 1; j++){

                if (data[j] > data[j + 1]){

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }
        }

        return data;
    }
}
