package ua.kpi.tef;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * The program logic is demonstrated.
 * The  class provides the operations with arrays obtained from controller and sent as arguments in methods
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.05.16)
 */
public class Model {


    /**
     * calculates the sum of all elements in array
     *
     * @param array
     * @return int
     */
    public int findSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * finds the index of maximum element in the given array
     *
     * @param array
     * @return int  index of the maximum element in the given array
     */
    public int findMax(int array[]) {

        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * finds the index of minimum element in the given array
     *
     * @param array
     * @return int index of minimum element
     */
    public int findMin(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * finds the arithmetic mean value of the given array
     *
     * @param array
     * @return double
     */
    public double calculateAverage(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    /**
     * counts the number of elements equal to the given
     *
     * @param array
     * @return int
     */
    public int equalToGivenElem(int array[], double value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * counts the number of positive elements
     *
     * @param array
     * @return int
     */
    public int countPositiveElem(int array[]) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * multiplies all array by value
     *
     * @param array
     * @param val
     * @return the array
     */
    public int[] multiplyByValue(int array[], int val) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * val;
        }
        return result;
    }

    /**
     * summates corresponding element and its index in array
     *
     * @param array
     * @return int array
     */
    public int[] addIndex(int array[]) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] + i;
        }
        return result;
    }

    /**
     * resets to zero elements with even values
     *
     * @param array
     * @return int array
     */
    public int[] resetToZeroEvenValueElem(int array[]) {
        int result[] = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (result[i] % 2 == 0) {
                result[i] = 0;
            }
        }
        return result;
    }

    /**
     * resets to zero elements with odd index
     *
     * @param array
     * @return int array
     */
    public int[] resetToZeroOddElem(int array[]) {
        int result[] = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[i] = 0;
            }
        }
        return result;
    }

    /**
     * finds first positive element
     *
     * @param array
     * @return int index
     */
    public int findFirstPositiveElem(int array[]) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * finds last negative element in array
     *
     * @param array
     * @return int index
     */
    public int findLastNegativeElem(int array[]) {
        int index = -1;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * finds the indices at which the given value is stored in array
     *
     * @param array
     * @param val
     * @return StringBuilder line with the indices separated by space
     */
    public StringBuilder findElemOccurenceIndices(int array[], int val) {
        StringBuilder sb = new StringBuilder("");

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                sb.append(i + " ");
                counter++;
            }
        }
        if (counter == 0) {
            return null;
        } else return sb;
    }

    /**
     * checks if the array is sorted in ascending order
     *
     * @param array
     * @return boolean result
     */
    public boolean isSortedInAscendingOrder(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending order
     *
     * @param array
     * @return boolean result
     */
    public boolean isSortedInDecendingOrder(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * ensures the circular right shift of elements by k positions
     *
     * @param array
     * @param k
     */
    public int[] circularRightShift(int array[], int k) {
        int N = array.length;
        int additional[] = new int[N];
        for (int i = 0; i < N - k; i++) {
            additional[i + k] = array[i];
        }
        for (int i = k - 1; i >= 0; i--) {
            additional[i] = array[(N - 1)];
            N--;
        }
        return additional;
    }

    /**
     * finds the elements that repeat in array
     *
     * @param array
     */
    public StringBuilder findEqualElem(int array[]) {
        int additional[] = new int[array[findMax(array)] + 1];
        StringBuilder sb = new StringBuilder("");
        for (int val : array) {
            if (additional[val] == 1 || additional[val] == -1) {
                additional[val] = -1;
            } else {
                additional[val] = 1;
            }
        }
        for (int i = 0; i < additional.length; i++) {
            if (additional[i] == -1) {
                sb.append(i + " ");
            }
        }
        return sb;
    }

    /**
     * counts the number of elements that are greater than the mean average value
     *
     * @param array
     * @return total number of such elements
     */
    public int countGtreaterThanMean(int array[]) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double aver = (double) sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > aver) {
                number++;
            }
        }
        return number;
    }

    /**
     * finds the elements that don't repeat in array
     *
     * @param array
     */
    public StringBuilder findNotEqualElem(int array[]) {
        int additional[] = new int[array[findMax(array)] + 1];
        StringBuilder sb = new StringBuilder("");
        for (int val : array) {
            if (additional[val] == 1 || additional[val] == -1) {
                additional[val] = -1;
            } else {
                additional[val] = 1;
            }
        }
        for (int i = 0; i < additional.length; i++) {
            if (additional[i] == 1) {
                sb.append(i + " ");
            }
        }
        return sb;
    }

    /**
     * finds the elements that don't repeat in both array
     *
     * @param array
     * @param secondArray
     * @return HashSet with unique values
     */
    public HashSet findNotEqualElemInTwoArrays(int array[], int secondArray[]) {
        HashSet hashSet = new HashSet();
        int max1 = array[findMax(array)];//search the maximum value in first array
        int max2 = secondArray[findMax(secondArray)];//search the maximum value in second array
        int maxVal = (max1 > max2) ? max1 : max2;//compare two max values from two arrays and choose the largest among them
        int additional[] = new int[maxVal + 1];
        StringBuilder sb = new StringBuilder("");
        for (int val : secondArray) {
            additional[val] = 1;
        }
        for (int i : array) {
            if (additional[i] == 0) {
                hashSet.add(i);

            }
        }
        return hashSet;
    }

    /**
     * counts the number of elements that equal the first element in array
     *
     * @param array
     * @return int number of repetitions
     */
    public int countEqualValueElem(int array[]) {
        int counter = -1;
        for (int val : array) {
            if (array[0] == val) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * from two sorted arrays the third one is organized without sorting
     *
     * @param arrayFirst
     * @param arraySecond
     */
    public int[] mergeSorting(int arrayFirst[], int arraySecond[]) {
        int resultArray[] = new int[arrayFirst.length +
                arraySecond.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;
        while (firstIndex < arrayFirst.length
                && secondIndex < arraySecond.length) {
            if (arrayFirst[firstIndex] < arraySecond[secondIndex]) {
                resultArray[resultIndex++] = arrayFirst[firstIndex++];
            } else {
                resultArray[resultIndex++] = arraySecond[secondIndex++];
            }
        }
        while (firstIndex < arrayFirst.length) {
            resultArray[resultIndex++] = arrayFirst[firstIndex++];
        }
        while (secondIndex < arraySecond.length) {
            resultArray[resultIndex++] = arraySecond[secondIndex++];
        }
        return resultArray;
    }

    /**
     * swaps the first positive element in array  with the last positive and so on moving to the middle
     *
     * @param array
     * @return the swapped array
     */
    public int[] swapPositiveElem(int array[]) {
        int[] additional = Arrays.copyOf(array, array.length);
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (array[i] < 0 && i < j) {
                i++;
            }
            while (array[j] < 0 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                additional[i] = array[j];
                // array[i] = array[j];
                additional[j] = temp;
                // array[j] = temp;
                i++;
                j--;
            }
        }
        return additional;
    }

    /**
     * fills the array of ints with randomly generated values in range @param min and @param max of size @param size
     * @param min
     * @param max
     * @param size
     * @return the  filled array
     */
    public int[] fillArrayRandomly(int min, int max, int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max + 1 - min) + min;
        }
        return array;
    }


}
