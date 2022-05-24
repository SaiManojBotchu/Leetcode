class Solution {
    int count = 0;
    
    public int countArrangement(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i + 1;
        }
        permutations(A, n - 1);
        return count;
    }
    
    public void permutations(int[] A, int i) {
        if (i == 0) {
            count++;
            return;
        }
        for (int j = i; j >= 0; j--) {
            swap(A, i, j);
            if (A[i] % (i + 1) == 0 || (i + 1) % A[i] == 0) {
                permutations(A, i - 1);
            }
            swap(A, i, j);
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

// more time space
// class Solution {
//     int count = 0;
    
//     public int countArrangement(int n) {
//         if (n <= 2) return n;
//         permutations(1, new int[n]);
//         return count;
//     }
    
//     public void permutations(int ind, int[] present) {
//         if (ind - 1 == present.length) {
//             count++;
//             return;
//         }
//         for (int i = 0; i < present.length; i++) {
//             if (present[i] == 0 && isDivisible(ind, i + 1)) {
//                 present[i] = 1;
//                 permutations(ind + 1, present);
//                 present[i] = 0;
//             }
//         }
//     }
    
//     public boolean isDivisible(int ind, int ele) {
//         return (ind % ele == 0 || ele % ind == 0);
//     }
// }
