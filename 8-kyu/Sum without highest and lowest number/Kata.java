package org.example.kyu_8.sumwithouthighestandlowestnumber;

public class Kata
{
    public static int sum(int[] numbers)
    {

        if (numbers == null || numbers.length == 0) {
            return 0;
        }


        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number: numbers) {
            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        int smallestCount = 0;
        int largestCount = 0;
        int sum = 0;

        for (int number: numbers) {
            if (number == smallest && smallestCount == 0) {
                smallestCount++;
                continue;
            }

            if (number == largest && largestCount == 0) {
                largestCount++;
                continue;
            }

            sum += number;
        }


        return sum;
    }
}
