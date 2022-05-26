class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] A) {
        subsets(A, 0, new ArrayList<>());
        return res;
    }
    
    public void subsets(int[] A, int ind, List<Integer> li) {
        if (ind == A.length) {
            res.add(new ArrayList<>(li));
            return;
        }
        li.add(A[ind]);
        subsets(A, ind + 1, li); // pick
        li.remove(li.size() - 1);
        subsets(A, ind + 1, li); // not pick
    }
}

// solution - 2 (using for loop)
// class Solution {
//     List<List<Integer>> res = new ArrayList<>();
    
//     public List<List<Integer>> subsets(int[] A) {
//         subsets(A, 0, new ArrayList<>());
//         return res;
//     }
    
//     public void subsets(int[] A, int ind, List<Integer> li) {
//         res.add(new ArrayList<>(li));
//         if (ind == A.length) return;
//         for (int i = ind; i < A.length; i++) {
//             li.add(A[i]);
//             subsets(A, i + 1, li);
//             li.remove(li.size() - 1);
//         }
//     }
// }
