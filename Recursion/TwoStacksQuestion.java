package com.aryan.Recursion;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts the following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
        int maxCount = 0;
        long currentSum = 0;
        
        // --- Step 1: Greedily take from stack 'a' ---
        int countA = 0;
        // Take elements from 'a' as long as the sum is within the limit.
        while (countA < a.size() && currentSum + a.get(countA) <= maxSum) {
            currentSum += a.get(countA);
            countA++;
        }
        // This is our initial best score
        maxCount = countA;

        // --- Step 2: Try adding elements from 'b' ---
        int countB = 0;
        while (countB < b.size()) {
            // Add the next element from 'b'
            currentSum += b.get(countB);
            countB++;

            // If the sum is now too high, remove elements from 'a' until it's valid again.
            while (currentSum > maxSum && countA > 0) {
                countA--;
                currentSum -= a.get(countA);
            }

            // If the current combination is valid, check if it's a new max count.
            if (currentSum <= maxSum) {
                maxCount = Math.max(maxCount, countA + countB);
            } else {
                // If a sum is still > maxSum even after removing all of 'a', we can't proceed.
                break;
            }
        }
        
        return maxCount;
    }

}

public class TwoStacksQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.twoStacks(maxSum, a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
