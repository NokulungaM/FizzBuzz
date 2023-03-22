package za.co.thefizzbuzz.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        if (divisibleBy3 && divisibleBy5){
            return "FizzBuzz";
        }else if (divisibleBy5) {
            return "Buzz";
        }else  if (divisibleBy3){
            return "Fizz";
        }
        return String.valueOf(number);
    }

    public String countTo(int number){
        String [] myList = new String[number];
        for(int i = 1; i < number + 1; i++)
            myList[i-1] = checkNumber(i);
        return Arrays.toString(myList);
    }
}



