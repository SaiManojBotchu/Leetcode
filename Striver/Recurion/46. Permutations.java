class Solution {
    public List<List<Integer>> permute(int[] A) {
        List<List<Integer>> res = new ArrayList<>();
        permutations(0, A, res);
        return res;
    }
    public void permutations(int ind, int[] A, List<List<Integer>> res) {
        if (ind == A.length) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                li.add(A[i]);
            }
            res.add(new ArrayList<>(li));
            return;
        }
        for (int i = ind; i < A.length; i++) {
            swap(A, i, ind);
            permutations(ind + 1, A, res);
            swap(A, i, ind);
        }
    }
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}


/* (more space since we are using arrays and arraylists)

class Solution {
    public List<List<Integer>> permute(int[] A) {
        List<List<Integer>> res = new ArrayList<>();
        int[] present = new int[A.length];
        permutations(A, new ArrayList<>(), res, present);
        return res;
    }
    
    public void permutations(int[] A, List<Integer> li, List<List<Integer>> res, int[] present) {
        if (li.size() == A.length) {
            res.add(new ArrayList<>(li));
            return;
        }
        for (int i = 0; i < A.length; i++) {
            if (present[i] == 1) continue;
            present[i] = 1;
            li.add(A[i]);
            permutations(A, li, res, present);
            li.remove(li.size() - 1);
            present[i] = 0;
        }
    }
}
*/
