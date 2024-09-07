package solution;

/**
 * A utility class that provides implementation of the QuickSort algorithm.
 */
public class quickSortRealisation {

    /**
     * Sorts the elements in the specified list in ascending order using the QuickSort algorithm.
     * Uses the natural ordering of the elements (the {@link Comparable} interface).
     *
     * @param <T>  the type of elements in the list
     * @param list the list to be sorted
     */
    public static <T extends Comparable<T>> void quickSort(myArrayListRealisation<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

    /**
     * Sorts the range of elements in the specified list in ascending order using the QuickSort algorithm.
     * Uses the natural ordering of the elements (the {@link Comparable} interface).
     *
     * @param <T>   the type of elements in the list
     * @param list  the list to be sorted
     * @param left  the index of the leftmost element of the range to be sorted
     * @param right the index of the rightmost element of the range to be sorted
     */
    public static <T extends Comparable<T>> void quickSort(myArrayListRealisation<T> list, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(list, left, right);
            quickSort(list, left, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, right);
        }
    }

    /**
     * Partitions the range of elements in the specified list around a pivot.
     * Uses the natural ordering of the elements (the {@link Comparable} interface).
     *
     * @param <T>   the type of elements in the list
     * @param list  the list to be partitioned
     * @param left  the index of the leftmost element of the range to be partitioned
     * @param right the index of the rightmost element of the range to be partitioned
     * @return the index of the pivot element
     */

    private static <T extends Comparable<T>> int partition(myArrayListRealisation<T> list, int left, int right) {
        T pivot = (T) list.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (((Comparable<T>) list.get(j)).compareTo(pivot) < 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, right);
        return i + 1;
    }

    /**
     * Swaps the elements at the specified indices in the list.
     *
     * @param <T>  the type of elements in the list
     * @param list the list containing the elements to be swapped
     * @param i    the index of the first element to be swapped
     * @param j    the index of the second element to be swapped
     */


    private static <T extends Comparable<T>> void swap(myArrayListRealisation<T> list, int i, int j) {
        T temp = (T) list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
