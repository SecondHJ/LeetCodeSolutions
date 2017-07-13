package easy;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * Created by second on 2017/7/13.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m, lo = 0, hi = m + n;
        //merge nums2 into nums1
        int k = 0;
        for (int i = m; i < m + n; i++){
            nums1[i] = nums2[k++];
        }
        sort(nums1);
    }

    public static void sort(int[] a){
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--){
                exch(a, j, j - 1);
            }
        }
    }

    private static void exch(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
