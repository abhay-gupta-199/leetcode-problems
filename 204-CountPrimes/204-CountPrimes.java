// Last updated: 8/6/2025, 11:04:15 AM
class Solution{
    public int countPrimes(int n){
        if(n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i * i < n; i++) {
            if(isPrime[i]){
                for(int multiple = i * i; multiple < n; multiple += i) {
                    isPrime[multiple] = false;
                }
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime[i]) c++;
        } return c;
    }
}