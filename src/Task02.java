public class Task02 {

    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) //base case
            return y;
        else
            return gcd(y, x % y);
    }

    // 1: What is the output of this code?
    // For example, if x is 10, and y is 15, the output is:
    // 5

    // 2: Modify it to find the gcd using subtraction instead of %
    // To use subtraction the Euclidean algorithm can be applied
    public static int gcdSubtraction(int x, int y) {
        if (y == 0)
            return y;
        else
            return gcdSubtraction(y, x - y);
    }

}
