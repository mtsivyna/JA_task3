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
    private int numberOfElements;   // Number of elements in array
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element
    private int headElement;        // Head queue element
    private int currentElement;     // Queue element with defined index

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueue(int numberOfElements) {

        this.numberOfElements = numberOfElements;
        array = new int[numberOfElements];
    }

    /**
     * Current method is used for extending primary queue
     */
    public void extendQueue() {

        extendedArray = new int[array.length + 3];                      // create new extended array
        System.arraycopy(array, 0, extendedArray, 0, array.length);     // copying data into the new array
        array = extendedArray;                                          // redefining array
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public void addElement(int value) {

        // Verification of boundary positions in array
        if (storePosition == array.length) {
            storePosition = 0;
        }

        removePosition++;

        if (removePosition == array.length) {
            removePosition = 0;
        }

        array[storePosition] = value;   // Store current value into the define position
        storePosition++;                // Increment store position for next value
    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public int getHeadElement() {

        if (storePosition == 0) {
            headElement = array[numberOfElements - 1];
        }

        else {
            headElement = array[storePosition - 1];
        }

        return headElement;
    }

    /**
     * Current method is used for getting queue elements with defined index
     */
    public int showArrayElement(int index) {

        // Queue index validation
        if (index <= array.length - 1){
            currentElement = array[index];
        }

        else {
            System.out.println("Please enter valid index");
        }
        return currentElement;
    }
}