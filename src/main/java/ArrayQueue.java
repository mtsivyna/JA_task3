/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 15.09.13
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue {

    private int[] array;            // Array of int elements
    private int[] extendedArray;    // Extended array of int elements
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueue(int numberOfElements) {

        array = new int[numberOfElements];
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public void addElement(int value) {

        // Incrementing position
        ++ storePosition;

        // Verification of boundary positions in array
        if (storePosition == array.length) {

            extendedArray = new int[array.length + 1];                     // create new extended array
            System.arraycopy(array, 0, extendedArray, 1, array.length);    // copying data into the new array
            array = extendedArray;                                         // redefining array
            storePosition = 0;
            removePosition ++;
        }

        // Store current value into the define position
        array[storePosition] = value;

    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public int getHeadElement() {

        // Incrementing position
        ++ removePosition;

        // Verification of boundary positions in array
        if (removePosition == array.length) {
            removePosition = 0;
        }

        return array[removePosition];   // Return head element
    }

    /**
     * Current method used for getting queue size
     * @return
     */
    public int getQueueSize() {

        int size = array.length - 1;
        return size;
    }
}