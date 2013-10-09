/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 09.10.13
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue {

    private int[] array;            // Array of int elements
    private int[] extendedArray;    // Extended array of int elements
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element
    private int addingCounter;      // Incrementing every time of calling method
    private int removeCounter;      // Incrementing every time of calling method

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueue(int numberOfElements) {

        array = new int[numberOfElements];
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * Extending queue if need
     * @param value
     * @return
     */
    public void addElement(int value) {

        addingCounter ++;

        // Verifying of boundary positions
        if (storePosition == array.length) {

            storePosition = 0;

            // Extending queue if queue is filled on the boundary element
            if (storePosition == removePosition) {

                extendedArray = new int[array.length + 1];                      // Creating new array
                System.arraycopy(array, 0, extendedArray, 1, array.length);     // Copying primary array
                removePosition ++;
                array = extendedArray;                                          // Re-initialization of array
            }
        }

        // Extending array if queue is filled in the middle
        else if (storePosition == removePosition && addingCounter > 1) {

            extendedArray = new int[array.length + 1];
            // Copying first part of primary array
            System.arraycopy(array, 0, extendedArray, 0, storePosition);
            // Copying last part of primary array
            System.arraycopy(array, storePosition, extendedArray, storePosition + 1,
                    extendedArray.length - storePosition - 1);
            removePosition ++;
            array = extendedArray;
        }

        array[storePosition] = value;   // Store current value into the define position
        storePosition ++;               // Incrementing position
    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public int getHeadElement() {

        removeCounter ++;

        // Checking that head element is present in queue
        if (removePosition == storePosition && removeCounter > addingCounter) {

            System.out.println("There is no head element");
            return 0;
        }

        // Verification of boundary positions in array
        if (removePosition == array.length) {

            removePosition = 0;
        }

        removePosition ++;                  // Incrementing position
        return array[removePosition - 1];   // Return head element
    }

    /**
     * Current method used for getting queue size
     * @return
     */
    public int getQueueSize() {

        int size = array.length;
        return size;
    }
}
