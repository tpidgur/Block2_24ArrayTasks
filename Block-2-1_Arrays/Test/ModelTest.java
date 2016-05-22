import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import ua.kpi.tef.Model;
import ua.kpi.tef.View;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by Зая on 22.05.2016.
 */
public class ModelTest {
    /**
     * The {@code Model}  represents the instance of the mentioned class
     * The {@code ACCURACY}  sets the tolerance in the following methods, like assertEquals (expected,actual, ACCURACY);
     */
    private static Model model;
    public static final double ACCURACY = 1e-10;
    int[] arr = {1, 2, 4, 3, 5, 3, 3, 6, 7, 8, 7, 5, 7};
    int secondArray[] = { 5, 7 ,9 ,12 ,3 ,2};

    /**
     * initializes instance of the class Model and sets the initial value
     */
    @BeforeClass
    public static void runT() {
        model = new Model();

    }

    @Test
    public void testFindSum() {
        int res = model.findSum(arr);
        assertEquals(View.TASK1,61,res);
    }

    @Test
    public void testFindMax()  {
        int res = model.findMax(arr);
        assertEquals(View.TASK2,9,res);
    }

    @Test
    public void testFindMin(){
        int  res = model.findMin(arr);
        assertEquals(View.TASK3,0,res);
    }

    @Test
    public void testCalculateAverage()  {
        double res = model.calculateAverage(arr);
        assertEquals(View.TASK4,4.6923076923076925,res,ACCURACY);

    }

    @Test
    public void testEqualToGivenElem()  {
        int res = model.equalToGivenElem(arr,3);
        assertEquals(View.TASK5,3,res);
    }
    @Test
    public void testEqualToGivenElem2()  {
        int res = model.equalToGivenElem(arr,0);
        assertEquals(View.TASK6,0,res);
    }
    @Test
    public void testCountPositiveElem()  {
        int res = model.countPositiveElem(arr);
        assertEquals(View.TASK7,13,res);
    }

    @Test
    public void testMultiplyByValue() {
        int [] res = model.multiplyByValue(arr,5);
        assertArrayEquals(View.TASK8,new int[]{5, 10, 20, 15, 25, 15, 15, 30, 35, 40, 35, 25, 35},res);
    }

    @Test
    public void testAddIndex() {
        int [] res = model.addIndex(arr);
        assertArrayEquals(View.TASK9,new int[]{1, 3, 6, 6, 9, 8, 9, 13, 15, 17, 17, 16, 19},res);

    }

    @Test
    public void testResetToZeroEvenValueElem() {
        int [] res = model.resetToZeroEvenValueElem(arr);
        assertArrayEquals(View.TASK10,new int[]{1, 0, 0, 3, 5, 3, 3, 0, 7, 0, 7, 5, 7},res);


    }

    @Test
    public void testResetToZeroOddElem()  {
        int [] res = model.resetToZeroOddElem(arr);
        assertArrayEquals(View.TASK11,new int[]{1, 0, 4, 0, 5, 0, 3, 0, 7, 0, 7, 0, 7},res);
    }

    @Test
    public void testFindFirstPositiveElem() {
        int res = model.findFirstPositiveElem(arr);
        assertEquals(View.TASK12,0,res);
    }

    @Test
    public void testFindLastNegativeElem()  {
        int res = model.findLastNegativeElem(arr);
        assertEquals(View.TASK13,-1,res);
    }

    @Test
    public void testFindElemOccurenceIndices()  {
        String res = model.findElemOccurenceIndices(arr,3).toString();
        assertEquals(View.TASK14,"3 5 6 ",res);
    }

    @Test
    public void testIsSortedInAscendingOrder()  {
       boolean res = model.isSortedInAscendingOrder(arr);
        assertEquals(View.TASK15,false,res);
    }

    @Test
    public void testIsSortedInDecendingOrder(){
        boolean res = model.isSortedInDecendingOrder(arr);
        assertEquals(View.TASK16,false,res);
    }

    @Test
    public void testCircularRightShift()  {
        int [] res = model.circularRightShift(arr,5);
        assertArrayEquals(View.TASK17,new int[]{7, 8, 7, 5, 7, 1, 2, 4, 3, 5, 3, 3, 6},res);
    }

    @Test
    public void testFindEqualElem()  {
        String res = model.findEqualElem(arr).toString();
        assertEquals(View.TASK18,"3 5 7 ",res);

    }

    @Test
    public void testCountGtreaterThanMean()  {
        int res = model.countGtreaterThanMean(arr);
        assertEquals(View.TASK19,7,res);

    }

    @Test
    public void testFindNotEqualElem()  {
        String res = model.findNotEqualElem(arr).toString();
        assertEquals(View.TASK20,"1 2 4 6 8 ",res);


    }

    @Test
    public void testFindNotEqualElemInTwoArrays()  {
        String res = model.findNotEqualElemInTwoArrays(arr,secondArray).toString();
        assertEquals(View.TASK21,"[1, 4, 6, 8]",res);

    }

    @Test
    public void testCountEqualValueElem()  {
        int res = model.countEqualValueElem(arr);
        assertEquals(View.TASK22,0,res);

    }

    @Test
    public void testMergeSorting()  {//методсортировки доделать + з нумерацією тасків наплутано
        int [] res = model.mergeSorting(arr,secondArray);
        assertArrayEquals(View.TASK23,new int[]{1, 2, 4, 3, 5, 5, 3, 3, 6, 7, 7, 8, 7, 5, 7, 9, 12, 3, 2},res);

    }

    @Test
    public void testSwapPositiveElem()  {
        int [] res = model.swapPositiveElem(arr);
        assertArrayEquals(View.TASK24,new int[]{7, 5, 7, 8, 7, 6, 3, 3, 5, 3, 4, 2, 1},res);

    }

}