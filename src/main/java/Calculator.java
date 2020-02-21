import java.util.Scanner;

public class Calculator {
//Index 3 out of bounds for length 3
    public static int Add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] ;
        }
        return sum;
    }

    public static int multiply(int... numbers) {
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[1];
        }
        return product;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        int numbers = input.nextInt();


        System.out.println("Enter numbers to add: "+Add(numbers));
        System.out.println("your added total is: "+Add(numbers));

        System.out.println("");
        Add();
        System.out.println("Enter numbers to multiply: "+ numbers);

        System.out.println("your multiplied total is: "+numbers);




    }
}
