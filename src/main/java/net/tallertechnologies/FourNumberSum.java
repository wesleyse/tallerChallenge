package net.tallertechnologies;

import java.util.ArrayList;
import java.util.List;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] inputArray, int targetSum) {

        if(inputArray.length < 4) {
            return List.of();
        }

        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {

                int thirdElementPointer = j + 1;
                int fourthElementPointer = thirdElementPointer + 1;

                while (thirdElementPointer <= inputArray.length - 2) {

                    if (inputArray[i] + inputArray[j] + inputArray[thirdElementPointer] + inputArray[fourthElementPointer] == targetSum) {
                        result.add(new Integer[]{inputArray[i], inputArray[j], inputArray[thirdElementPointer], inputArray[fourthElementPointer]});
                        thirdElementPointer++;
                        fourthElementPointer = thirdElementPointer + 1;
                    }
                    else {
                        fourthElementPointer++;
                        if(fourthElementPointer == inputArray.length) {
                            thirdElementPointer++;
                            fourthElementPointer = thirdElementPointer + 1;
                        }
                    }
                }
            }
        }

        return result;
    }

}
