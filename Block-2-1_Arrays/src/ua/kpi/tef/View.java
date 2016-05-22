package ua.kpi.tef;

import java.util.Arrays;

/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.05.16)
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CHOOSE_OPERATION = "\nENTER NUMBER 1-24 to see the task solutions  or 25 to break";
    public static final String TASK1 = "Task1: calculate the sum of all elements in array:";
    public static final String TASK2 = "Task2: find INDEX of the maximum element and its value  in the given array:";
    public static final String TASK3 = "Task3: find INDEX of the minimum element and its value in the given array:";
    public static final String TASK4 = "Task4: find the arithmetic mean value of the given array:";
    public static final String TASK5 = "Task5: count the number of elements equal to the given:";
    public static final String TASK6 = "Task6: count the number of elements equal to 0:";
    public static final String TASK7 = "Task7: count the number of positive elements:";
    public static final String TASK8 = "Task8: multiply the initial array by value:";
    public static final String TASK9 = "Task9: summate corresponding element and its index in array:";
    public static final String TASK10 = "Task10: reset to zero elements with even values:";
    public static final String TASK11 = "Task11: reset to zero elements with odd index:";
    public static final String TASK12 = "Task12: find index of first positive element or return -1 if there are no such:";
    public static final String TASK13 = "Task13: find index of last negative element or return -1 if there are no such::";
    public static final String TASK14 = "Task14: find the indices at which the given value is stored in array:";
    public static final String TASK15 = "Task15: check if the array is sorted in ascending order:";
    public static final String TASK16 = "Task16: check if the array is sorted in descending order:";
    public static final String TASK17 = "Task17: ensure the circular right shift of elements by k positions=";
    public static final String TASK18 = "Task18: find elements that repeat in array:";
    public static final String TASK19 = "Task19: count  number of elements that are greater than the mean average value: ";
    public static final String TASK20 = "Task20: find elements that don't repeat in array:";
    public static final String TASK21 = "Task21: print elements of one array that  don't equal to elements of the second one:";
    public static final String TASK22 = "Task22: count the number of elements that equal the first element in array:";
    public static final String TASK23 = "Task23: from two sorted arrays organize the third one without sorting:";
    public static final String TASK24 = "Task24: swap the first positive element in array  with the last positive and so on moving to the middle:";
    public static final String VALUE_BY_INDEX = "Value of this element in array is: ";
    public static final String BREAK = "BREAK!!! ";
    public static final String RESULT = "RESULT IS: ";

    //different methods for printing the output data
    public void printMessage(Object message) {
        System.out.println(message);
    }


    public void printMessage(String message, int[] array) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
    }

    public void printMessage(String message, int[] array, Object val) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
        System.out.println(RESULT + val);
    }

    public void printMessage(String message, int[] array, int[] val) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
        System.out.println(RESULT + Arrays.toString(val));
    }

    public void printMessage2(String message, int[] array, int[] array2) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

}
