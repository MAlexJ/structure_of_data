package chapter_02.listing_2_2;

import java.util.Arrays;

/**
 * The class describe the base structure of data in the array
 *
 * @author malex
 */
public class HighArray {

    private long[] array;
    private int nElements;

    public HighArray(int size) {
        array = new long[size];
        nElements = 0;
    }

    long[] getArray() {
        return array;
    }

    // insert data in array
    public boolean insert(long element) {
        if (nElements < array.length) {
            array[nElements] = element;
            nElements++;
            return true;
        } else {
            System.out.println("Array is full");
            return false;
        }
    }

    public boolean delete(long element) {
        int j;
        for (j = 0; j < nElements; j++)
            if (array[j] == element) {
                break;
            }
        if (j == nElements) {
            return false;
        } else {
            nElements--;
            for (int k = j; k < nElements; k++) {
                array[k] = array[k + 1];
            }
            array[nElements] = 0;
            return true;
        }
    }

    public boolean find(long element) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (array[j] == element) {
                break;
            }
        }
        return j != nElements;
    }

    public void display() {
        System.out.println("Array: " + Arrays.toString(array));
    }

}
