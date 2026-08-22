class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0;
        int mul = 1;
        while(t != 0){
            mul *= t%10;
            sum += t%10;
            t /= 10;
        }
        if(n % (mul+sum) == 0) return true;
        else return false;
    }
}