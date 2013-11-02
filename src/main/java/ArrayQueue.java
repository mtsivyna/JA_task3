/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 21.10.13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue {

    private int[] array;            // Array of int elements
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element
    private int size = 0;           // queue size

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
        if (size == array.length) {

            int addSize = array.length / 2 + 2;
            int[] extendedArray = new int[array.length + addSize];
            // Copying first part of primary array
            System.arraycopy(array, 0, extendedArray, 0, storePosition);
            // Copying last part of primary array
            System.arraycopy(array, storePosition, extendedArray, storePosition + addSize,
                    extendedArray.length - storePosition - addSize);

            // Incrementing head element position according to new array size
            if(storePosition == removePosition) {
                removePosition += addSize;
            }
            else
                removePosition = addSize;

            array = extendedArray;              // Redefining array
        }
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */

    public void addElement(int value) {

        extending();
        array[storePosition] = value;           // Store current value into the define position
        size ++;                                // increment queue size after adding new element
        storePosition ++;                       // incrementing position

        if (storePosition == array.length) {    // verifying of boundary store position

            storePosition = 0;
        }
    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public int getHeadElement() {

        if (size == 0) {

            return 0;
        }

        if (removePosition == array.length) {

            removePosition = 0;
        }

        // Getting head element
        int element = array[removePosition];
        removePosition = (removePosition == array.length) ? 0 : removePosition + 1;
        size --;
        return element;   // Return head element
    }

    /**
     * Current method used for getting queue size
     * @return
     */
    public int getQueueSize() {

        return array.length;
    }

    public void getarray () {

        for (int el : array) {
            System.out.println(el);
        }
    }
}