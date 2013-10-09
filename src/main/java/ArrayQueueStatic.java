
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
    private static int storePosition;      // Value store position
    private static int removePosition;     // Position of remove array element

    /**
     * Current method is used for creating array
     * @param numberOfElements
     */
    public ArrayQueueStatic(int numberOfElements) {

        array = new int[numberOfElements];
    }

    /**
     * Current method is used for adding value into the storePosition in array
     * @param value
     * @return
     */
    public static void addElement(int value) {



        // Verification of boundary positions in array
        if (storePosition + 1 == removePosition || (storePosition + 1 == array.length - 1 && removePosition == 0)) {
            System.out.println("``````````");
            //extendedArray = new int[array.length + 1];                     // create new extended array
            //System.arraycopy(array, 0, extendedArray, 1, array.length);    // copying data into the new array
            //array = extendedArray;                                         // redefining array
            //storePosition = 0;
            //removePosition ++;
        }
        // Store current value into the define position
        array[storePosition] = value;
        // Incrementing position
        storePosition ++;
        if (storePosition == array.length - 1){
            storePosition = 0;
        }

    }

    /**
     * Current method is used for getting head queue element
     * @return
     */
    public static int getHeadElement() {

        // Incrementing position
        if (removePosition == array.length - 1) {
            removePosition = 0;
        }

        // Verification of boundary positions in array
        if (removePosition == array.length) {
            return 0;
        }
        removePosition ++;
        return array[removePosition - 1];   // Return head element
    }

    /**
     * Current method used for getting queue size
     * @return
     */
    public static int getQueueSize() {

        int size = array.length - 1;
        return size;
    }
}
