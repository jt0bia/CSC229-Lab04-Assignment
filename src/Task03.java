public class Task03 {
    int fib(int n) {
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    // 1: What is the time complexity of this algorithm and why?
    // The time complexity of this algorithm is exponential,
    // or a Big O notation of O(2^n), because each time the
    // function executes it will recursively call itself twice,
    // which leads to exponential growth of calls and computations.

}
