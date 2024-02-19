public class Task01 {

    public static void main(String[] args) {
        countDown(3);
        countDownEven(10);
    }

    public static void countDown(int num) {
        if (num == 0) // test
            System.out.println("Blastoff!");
        else {
            System.out.println("...");
            countDown(num-1); // recursive call
        }
    }

    // 1: What is the output of the code?
    // If num is assigned to 3, the code outputs:
    // ...
    // ...
    // ...
    // Blastoff!

    // 2: Modify it so that it only prints even numbers
    public static void countDownEven(int num) {
        if (num == 0)
            System.out.println("Blastoff!");
        else {
            if (num % 2 == 0) // Conditional statement that only applies to even numbers
                System.out.println(num + "..."); // Prints out the even number
            countDownEven(num-1);
        }
    }

    // 3: What's the time complexity of this code and why?
    // The time complexity is O(n) because the code takes a parameter of num (n),
    // and the code will operate n amount of times because there is a recursion
    // for the countdown method.


}
