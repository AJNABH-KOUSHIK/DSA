class LongestCommonPrefix {
    public int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int count = 1; // At least the first element is always unique
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = sol.removeDuplicates(arr);
        System.out.println("Unique count k = " + k);
        System.out.print("First k unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
