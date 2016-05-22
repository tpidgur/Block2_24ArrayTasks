package ua.kpi.tef;

/**
 *  The Constants used as input data for the model
 *  the barrier values for time and menu options
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.05.16)
 */
public interface GlobalConstants {
    /**
     * coefficient that is used in several tasks in model
     */
    int PRIMARY_VALUE = 10;
    int ZERO_VALUE = 0;
    /**
     * the minimum value of menu option
     */
    int MENU_MIN_BARRIER = 1;
    /**
     * the maximum value of menu option
     */
    int MENU_MAX_BARRIER = 25;
    /**
     * the maximum value of randomly generated elements of array
     */
   int MAX_RANDOM_VALUE=20;
    /**
     * the minimum value of randomly generated elements of array
     */
    int MIN_RANDOM_VALUE=10;
    /**
     * the size of  one randomly generated array
     */
    int ARRAY1_SIZE=13;
    /**
     * the size of  another randomly generated array
     */
    int ARRAY2_SIZE=5;
}
