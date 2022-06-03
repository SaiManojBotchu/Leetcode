// TC - O(logN)
class Solution {
    public int singleNonDuplicate(int[] A) {
          int low = 0, high = A.length - 2;
          while (low <= high) {
              int mid = (low + high) / 2;
              if (A[mid] == A[mid ^ 1])
                  low = mid + 1;
              else
                  high = mid - 1;   
          }
        return A[low];
    }
}

// TC - O(N/2)
// class Solution {
//     public int singleNonDuplicate(int[] A) {
//         int i = 0, j = 1;
//         while (i < A.length && j < A.length && A[i] == A[j]) {
//             i += 2;
//             j += 2;
//         }
//         return A[i];
//     }
// }
