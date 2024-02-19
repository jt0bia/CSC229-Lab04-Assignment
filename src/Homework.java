public class Homework {
    public static void main(String[] args) {
        recursiveHello(10);

        System.out.println(multiplesOfSevenSum(1,100));

        // Initializes array and key for binary search
        int[] myArr = {10,20,34,46,53,62,78,85,91};
        int myKey = 85;

        // Output of binary search
        int index = binarySearch(myArr,0,myArr.length - 1, myKey);
        if (index != -1)
            System.out.println(myKey + " found at index " + index);
        else
            System.out.println(myKey + " not found in the array");
    }

    // 1. Write a function that prints "Hello World" n times recursively.
    public static void recursiveHello(int n) {
        System.out.println("Hello world!");

        // Base case
        if (n <= 1)
            return;

        recursiveHello(n - 1);
    }

    // 2. Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
    public static int multiplesOfSevenSum(int n1, int n2) {
        int currentSum;

        // Base case
        if (n1 > n2)
            return 0;

        else {
            // Checking if number multiple of 7
            if (n1 % 7 == 0)
                currentSum = n1;
            else
                currentSum = 0; // number will not add if not a multiple of 7

            // Recursive calculation
            return currentSum + multiplesOfSevenSum(n1 + 1, n2);
        }
    }

    // 3. Write a function that implements the binary search algorithm recursively.
    public static int binarySearch(int[] arr, int low, int high, int key) {
        // base case
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] < key)
            return binarySearch(arr, mid + 1, high, key);
        else if (arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);
        return mid;
    }
}
