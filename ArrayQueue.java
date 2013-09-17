/**
 * ArrayQueue.java
 * This class describe implementation of cyclic queue
 * @version    1.1 09/08/13
 * @author     Maksym Tsivyna
 */
public class ArrayQueue {

    private int[] array;            // Array of int elements
    private int numberOfElements;   // Number of elements in array
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element

    /**
     * Current method is used for initialization array
     * @param numberOfElements
     */
    public ArrayQueue(int numberOfElements) {
        array = new int[this.numberOfElements = numberOfElements];
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public int addElement(int value) {

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
    public void removeElement() {

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
    public void showResultArray() {
        for (int queuePosition = 0; queuePosition <= numberOfElements - 1; queuePosition++) {
            System.out.println(array[queuePosition]);
        }
    }
}
