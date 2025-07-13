class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n!=0){
            int r = n %10;
            n = n / 10;
            sum = sum + r;
            product = product * r;
        }
        int result = product - sum;
        return result;
    }
}