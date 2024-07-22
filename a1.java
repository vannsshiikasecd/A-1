public class a1{

    public static void main(String[] args) {
        // Task 1: Variable Declaration and Initialization
        int integarVar = 76;
        double twiceVar = 7.14;
        boolean sahiyagalatVar = true;
        String stringVar = "Hello, Java!";

        System.out.println("Integer value: " + integarVar);
        System.out.println("Double value: " + twiceVar);
        System.out.println("Boolean value: " + sahiyagalatVar);
        System.out.println("String value: " + stringVar);

        // Task 2: Control Structures
        checkNumber(25);
        checkNumber(-9);
        checkNumber(0);

        // Task 3: Loops
        printNumbers(4);
        printNumbers(0);
        printNumbers(15);

        // Task 4: Methods
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};
        int[] array3 = {5, 10, 15};
        int[] array4 = {};

        System.out.println("Average of array1: " + calculateAverage(array1));
        System.out.println("Average of array2: " + calculateAverage(array2));
        System.out.println("Average of array3: " + calculateAverage(array3));
        System.out.println("Average of array4: " + calculateAverage(array4)); // Handle empty array

        // Task 5: Bonus Challenge
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 10 prime? " + isPrime(10));
        System.out.println("Is 2 prime? " + isPrime(2));
        System.out.println("Is 1 prime? " + isPrime(1));
    }

    // Task 2: Control Structures
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

    // Task 3: Loops
    public static void printNumbers(int n) {
        if (n <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Task 4: Methods
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Array is empty. Returning 0 as the average.");
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    // Task 5: Bonus Challenge
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}