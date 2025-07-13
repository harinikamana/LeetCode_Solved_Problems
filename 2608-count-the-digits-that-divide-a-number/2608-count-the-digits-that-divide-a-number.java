class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int count = 0;
        int t = num;
        while(t!=0){
            int r = t % 10;
            t = t / 10;
            sum = sum + r;
            if(num % r == 0){
                count+=1;
            }
        }
        return count;
    }
}