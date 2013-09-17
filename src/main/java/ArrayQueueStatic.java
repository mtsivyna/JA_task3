
/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 15.09.13
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueueStatic {

    private static int[] array;            // Array of int elements
    private static int[] extendedArray;    // Extended array of int elements
    private static int numberOfElements;   // Number of elements in array
    private static int storePosition;      // Value store position
    private static int removePosition;     // Position of remove array element
    private static int headElement;        // Head queue element
    private static int currentElement;     // Queue element with defined index

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueueStatic(int numberOfElements) {

        this.numberOfElements = numberOfElements;
        array = new int[numberOfElements];
    }

    /**
     * Current method is used for extending primary queue
     */
    public static void extendQueue() {

        extendedArray = new int[array.length + 3];                      // create new extended array
        System.arraycopy(array, 0, extendedArray, 0, array.length);     // copying data into the new array
        array = extendedArray;                                          // redefining array
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public static void addElement(int value) {

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
    public static int getHeadElement() {

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
    public static int showArrayElement(int index) {

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
