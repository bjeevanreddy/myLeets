class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
    int[] result = new int[n];
    int p = 0, q = 1;

    for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) {
            result[p] = arr[i];
            p += 2;
        } else {
            result[q] = arr[i];
            q += 2;
        }
    }

    // for (int i = 0; i < n; i++) {
    //     arr[i] = result[i];
    // }
    return result;
    }
}