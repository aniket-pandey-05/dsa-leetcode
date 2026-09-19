class Solution {
    public int countGoodNumbers(long n) {
        
        long con = 1000000007;
        long res = calculatePow(5,n/2,con);
        res = (res * calculatePow(4,n/2,con)) % con;
        
        if(n%2 != 0){
            res *= 5;
            res %=con;
        }
        return (int)res;
    }
    public long calculatePow(long base , long half , long con){
        long res =1;
        while(half > 0){

            if(half % 2 == 1){
                res = (res*base)%con;
            }
            base = (base * base)%con;
            half /= 2;
        }
        return res;
    }
}