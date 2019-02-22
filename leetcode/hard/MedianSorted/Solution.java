package MedianSorted;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int total = n1 + n2;
        int mid = total / 2;

        boolean isEven = (total % 2 == 0);

        int a1 = 0;
        int b1 = 0;
        int index = 0;
        int res = 0;
        int[] resa = new int[2];

        while((a1 < n1 || b1 < n2) && index <= mid) {

            if (a1 == n1) {
                res = nums2[b1++];
            }
            else if (b1 == n2) {
                res = nums1[a1++];
            }
            else {
                if (nums1[a1] < nums2[b1]) {
                    res = nums1[a1++];
                }
                else {
                    res = nums2[b1++];
                }
            }

            resa[index % 2] = res;
            index++;

            System.out.println(res);
            System.out.print("a1:");
            System.out.println(a1);
            System.out.print("b1:");
            System.out.println(b1);
        }


        System.out.println(isEven);
        System.out.println(index);

        if (isEven) {
            return ((double)resa[0] + (double)resa[1]) / 2.0;
        }
        return res;
    }
}
