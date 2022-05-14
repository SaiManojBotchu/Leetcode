class Solution {
    public void sortColors(int[] A) {
        int low = 0, mid = 0, high = A.length - 1;
        
        while (mid <= high) {
            if (A[mid] == 0) {
                swap(A, low++, mid++);
            }
            else if (A[mid] == 2) swap(A, mid, high--);
            else if (A[mid] == 1) mid++;
        }
    }
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
