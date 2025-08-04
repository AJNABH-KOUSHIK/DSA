class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR cancels paired numbers
           // The XOR bitwise operator (^) has key properties:
           //a ^ a = 0 — XORing a number with itself yields zero
          //a ^ 0 = a — XORing zero with a number yields the number
         //XOR is commutative and associative (order doesn’t matter)
        }
        return result;
    }
}
