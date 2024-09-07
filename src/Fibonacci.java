import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> fibonacci(int n){

        int first_number = 0;
        int second_number = 1;
        int result = 0;
        List<Integer> sequence = new ArrayList<>();

        for(int count = 0; count < n; count++){

            result = first_number+second_number;
            sequence.add(result);
            first_number = second_number;
            second_number = result;
        }
        return sequence;
    }

    public static void main(String[] args){

        int number = 8;
        List<Integer> result = fibonacci(number);

        System.out.println(result);

        if(result.contains(number)){
            System.out.println("Result contains number");
        } else {
            System.out.println("Result doesn't contains number");

        }
    }

}
