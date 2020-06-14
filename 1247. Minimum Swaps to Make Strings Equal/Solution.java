class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();

	int x = 0, y = 0;

	for (int i = 0; i < n; ++i)
		if (s1.charAt(i) != s2.charAt(i)) {
			if (s1.charAt(i) == 'x')
				++x;
			else
				++y;
		}

	int cnt = x + y;

	if (cnt % 2 == 1) return -1;

	return cnt / 2 + x % 2;
    }
}
