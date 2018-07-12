package chapter_02.binary_search;

/**
 * @author malex
 */
class BinarySearchInSortArray {

    private int[] array = new int[100];

    BinarySearchInSortArray() {
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = num++;
        }
    }

    // find element in sort array
    boolean find(int element) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (array[curIn] == element) {
                System.out.println("Find element: " + array[curIn]);
                return true;
            } else if (lowerBound > upperBound) {
                System.out.println("The element is not found: " + element);
                return false;
            } else {

                if (element > array[curIn]) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
}
