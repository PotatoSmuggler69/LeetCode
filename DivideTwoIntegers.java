public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        long quotient = (long)dividend/(long)divisor;
        if(quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(quotient<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)quotient;
    }
}
