/**
 * ArrayQueueStatic.java
 * This class describe static implementation of cyclic queue
 * @version    1.1 09/08/13
 * @author     Maksym Tsivyna
 */
public class ArrayQueueStatic {

    private static int[] array;             // Array of int elements
    private static int numberOfElements;    // Number of elements in array
    private static int storePosition;       // Value store position
    private static int removePosition;      // Position of remove array element

    /**
     * Current method is used for initialization array
     * @param numberOfElements
     */
    public ArrayQueueStatic(int numberOfElements) {
        array = new int[this.numberOfElements = numberOfElements];
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public static int addElement(int value) {

        // Verification of boundary positions in array
        if (storePosition == numberOfElements && removePosition == 0) {
            System.out.println("A queue is full: " + " Store position = " + storePosition +
                " Remove position = " + removePosition);
            return value;
        }

        array[storePosition] = value;   // Store current value into the define position
        storePosition++;                // Increment store position for next value
        return value;
    }

    /**
     * Current method is used for storing boundary elements
     */
    public static void removeElement() {

        if (storePosition == numberOfElements) {
            storePosition = 0;
        }

        removePosition++;

        if (removePosition == numberOfElements) {
            removePosition = 0;
        }
    }

    /**
     * Current method is used for showing output queue of input values
     */
    public static void showResultArray() {
        for (int queuePosition = 0; queuePosition <= numberOfElements - 1; queuePosition++) {
            System.out.println(array[queuePosition]);
        }
    }
}
