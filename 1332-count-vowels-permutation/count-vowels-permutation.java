class Solution {
    public int countVowelPermutation(int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        long mod = 1000000007;

        for (int j = 2; j <= n; j++) {
            long na = (e + i + u) % mod;
            long ne = (a + i) % mod;
            long ni = (e + o) % mod;
            long no = i % mod;
            long nu = (i + o) % mod;

            a = na;
            e = ne;
            i = ni;
            o = no;
            u = nu;
        }

        return (int)((a + e + i + o + u) % mod);
    }
}