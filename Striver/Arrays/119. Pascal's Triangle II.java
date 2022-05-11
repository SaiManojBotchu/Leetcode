class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> res = new ArrayList<>();
        long ele = 1;
        for (int i = 0; i <= r; i++) {
            if (i == 0 || i == r) res.add(1);
            else {
                ele = (ele * (r - i + 1) / i);
                res.add((int)ele);
            }
        }
        return res;
    }
}

/* 
logic:

for (i = 1 to r)
    res[i] = rCi;

But if we compute every element with the above formula. time complexity will be O(N2)
so to decrease time complexity we are going to use a better appoach for this

r = 4, i = 1
=> ele = 4C1 = (4 / 1) = 1 * (4 / 1)

i = 2
=> ele = 4C2 = (4 * 3) / 2 = (4) * (3 / 2) = 4C1 * (3 / 2)

i = 3
=> ele = 4C3 = (4 * 3 * 2) / (3 * 2) = ((4 * 3) / 2) * (2 / 3) = 4C2 * (2 / 3)

from the above equations, we can say that => nextEle = (prevEle * (r - i + 1)) / i;

*/
