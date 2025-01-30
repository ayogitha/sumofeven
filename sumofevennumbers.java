public class sumofevennumbers {
    
        public static void main(String[] args) {
            int sum = 0;
            int number = 2; // Start with the first even number
            while (number <= 100) {
                sum += number; // Add the current even number to the sum
                number += 2;   // Move to the next even number
            }
            System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
        }

    
}
