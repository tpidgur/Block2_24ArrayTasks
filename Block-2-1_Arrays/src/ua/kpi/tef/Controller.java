package ua.kpi.tef;

import java.util.Scanner;

/**
 * Class controller provides the menu that switches between different tasks in model
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.05.16)
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * The method sends commands after the correct value has been entered by user.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = model.fillArrayRandomly(GlobalConstants.MIN_RANDOM_VALUE, GlobalConstants.MAX_RANDOM_VALUE, GlobalConstants.ARRAY1_SIZE);
        int[] arr2 = model.fillArrayRandomly(GlobalConstants.MIN_RANDOM_VALUE, GlobalConstants.MAX_RANDOM_VALUE, GlobalConstants.ARRAY2_SIZE);
        int k = 0;
        do { //at least once the menu option is chosen (for option number 6 (break) for example)
            k = inputIntValueWithScanner(sc);
            menu(k, arr1, arr2);
        } while (k != GlobalConstants.MENU_MAX_BARRIER); //menu loop  until break option isn't chosen
    }

    // The Utility methods

    /**
     * checks for validity entered in console data
     *
     * @param sc
     * @return int value that is used in menu
     */


    public int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(View.CHOOSE_OPERATION);

        while (true) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) < GlobalConstants.MENU_MIN_BARRIER ||
                    res > GlobalConstants.MENU_MAX_BARRIER) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.CHOOSE_OPERATION);
                continue;
            }
            break;
        }
        return res;
    }

    /**
     * provides the menu that switches between different tasks in model
     * @param value is equivalent to the number of task
     * @param arr is the first operational array sent as input data to the model
     * @param arr2 is the second operational array sent as input data to the model
     */
    public void menu(int value, int arr[], int arr2[]) {
        switch (value) {
            case 1:
                view.printMessage(View.TASK1, arr, model.findSum(arr));
                break;
            case 2:
                view.printMessage(View.TASK2, arr, model.findMax(arr));
                view.printMessage(View.VALUE_BY_INDEX + arr[model.findMax(arr)]);
                break;
            case 3:
                view.printMessage(View.TASK3, arr, model.findMin(arr));
                view.printMessage(View.VALUE_BY_INDEX + arr[model.findMin(arr)]);
                break;
            case 4:
                view.printMessage(View.TASK4, arr, model.calculateAverage(arr));
                break;
            case 5:
                view.printMessage(View.TASK5 + GlobalConstants.PRIMARY_VALUE, arr, model.equalToGivenElem(arr, GlobalConstants.PRIMARY_VALUE));
                break;
            case 6:
                view.printMessage(View.TASK6, arr, model.equalToGivenElem(arr, GlobalConstants.ZERO_VALUE));
                break;
            case 7:
                view.printMessage(View.TASK7, arr, model.countPositiveElem(arr));
                break;

            case 8:
                view.printMessage(View.TASK8 + GlobalConstants.PRIMARY_VALUE, arr, model.multiplyByValue(arr, GlobalConstants.PRIMARY_VALUE));
                break;
            case 9:
                view.printMessage(View.TASK9, arr, model.addIndex(arr));
                break;
            case 10:
                view.printMessage(View.TASK10, arr, model.resetToZeroEvenValueElem(arr));
                break;
            case 11:
                view.printMessage(View.TASK11, arr, model.resetToZeroOddElem(arr));
                break;
            case 12:
                view.printMessage(View.TASK12, arr, model.findFirstPositiveElem(arr));
                break;
            case 13:
                view.printMessage(View.TASK13, arr, model.findLastNegativeElem(arr));
                break;
            case 14:
                view.printMessage(View.TASK14 + GlobalConstants.PRIMARY_VALUE, arr, (model.findElemOccurenceIndices(arr, GlobalConstants.PRIMARY_VALUE)));
                break;
            case 15:
                view.printMessage(View.TASK15, arr, (model.isSortedInAscendingOrder(arr)));
                break;
            case 16:
                view.printMessage(View.TASK16, arr, (model.isSortedInDecendingOrder(arr)));
                break;
            case 17:
                view.printMessage(View.TASK17 + GlobalConstants.PRIMARY_VALUE, arr, (model.circularRightShift(arr, GlobalConstants.PRIMARY_VALUE)));
                break;
            case 18:
                view.printMessage(View.TASK18, arr, (model.findEqualElem(arr)));
                break;
            case 19:
                view.printMessage(View.TASK19 + model.calculateAverage(arr), arr, (model.countGtreaterThanMean(arr)));
                break;
            case 20:
                view.printMessage(View.TASK20, arr, (model.findNotEqualElem(arr)));
                break;
            case 21:
                view.printMessage2(View.TASK21, arr, arr2);
                view.printMessage(View.RESULT + model.findNotEqualElemInTwoArrays(arr, arr2).toString());
                break;
            case 22:
                view.printMessage(View.TASK22, arr, (model.countEqualValueElem(arr)));
                break;
            case 23:
                view.printMessage2(View.TASK23, arr, arr2);
                view.printMessage(View.RESULT, model.mergeSorting(arr, arr2));
                break;
            case 24:
                view.printMessage(View.TASK24, arr, (model.swapPositiveElem(arr)));
                break;
            case 25:
                view.printMessage(View.BREAK);
                break;
        }
    }
}
