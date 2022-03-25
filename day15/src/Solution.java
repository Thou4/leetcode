public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        while(p1 < m || p2 < n){
            if (p1 == m){
                temp [p1 + p2] = nums2 [p2++];
            }else if (p2 == n){
                temp [p1 + p2] = nums1 [p1++];
            }else if (nums1 [p1] < nums2 [p2]){
                temp [p1 + p2] = nums1 [p1++];
            }else {
                temp [p1 + p2] = nums2 [p2++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp [i];
        }
    }
}
