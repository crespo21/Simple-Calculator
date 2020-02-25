public class Calculator {
    public static  int add(int... numbers){
        int sum = 0;
        for (int i=0; i < numbers.length;i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static  int multiply(int... numbers){
        int product = 1;
        for (int i=0; i < numbers.length;i++){
            product = product * numbers[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] numbers = {3,3};
        System.out.println(add(numbers));
        System.out.println(multiply(numbers));
    }
}
