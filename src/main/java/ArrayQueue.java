/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 21.10.13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue {

    private int[] array;            // Array of int elements
    private int[] extendedArray;    // Extended array of int elements
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element
    private int arraySize;          // Array size

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueue(int numberOfElements) {

        array = new int[numberOfElements];
    }

    /**
     * Current method is used for extending queue.
     */
    private void extending () {

        // Verifying of boundary positions
        if (removePosition == array.length && arraySize != 0) {

            removePosition = 0;

        }

        // Extending array if queue is filled
        else if ((storePosition == removePosition ||
                (storePosition == arraySize && removePosition == 0)) && arraySize != 0) {

            extendedArray = new int[array.length + 2];
            // Copying first part of primary array
            System.arraycopy(array, 0, extendedArray, 0, storePosition);
            // Copying last part of primary array
            System.arraycopy(array, storePosition, extendedArray, storePosition + 2,
                    extendedArray.length - storePosition - 2);

            // Incrementing head element position if array was extended in the middle
            if (removePosition != 0) {

                removePosition += 2;
            }

            array = extendedArray;              // Redefining array
            arraySize = extendedArray.length;   // Redefining arraySize variable
        }
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */

    public void addElement(int value) {

        // Queue size should be 0 after getting all head elements in queue
        if ((storePosition == removePosition || arraySize == removePosition) && storePosition != arraySize) {

            arraySize = 0;
        }

        extending();

        // Verifying of boundary positions
        if ((storePosition == arraySize && storePosition != removePosition) ||
                storePosition == removePosition && arraySize != 0) {

            storePosition = 0;
        }

        array[storePosition] = value;   // Store current value into the define position
        storePosition ++;               // Incrementing position
        arraySize = array.length;       // Redefining array size
    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public int getHeadElement() {

        // Checking that head element is present in queue
        if (removePosition == storePosition) {

            System.out.println("There is no head element");
            return 0;
        }

        // Verification of boundary positions in array
        if (removePosition == arraySize) {

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

        arraySize = array.length;
        return arraySize;
    }
}