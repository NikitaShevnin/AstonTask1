package solution;

import java.util.Arrays;

/**
 * A simple implementation of an ArrayList-like data structure that can store elements of a
 * parameterized type T.
 *
 * @param <T> the type of elements stored in the list
 */
public class myArrayListRealisation<T> {
    private T[] array;
    private int size;

    /**
     * Constructs a new {@code myArrayListRealisation} instance with an initial capacity of 10.
     */
    public myArrayListRealisation() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    /**
     * Adds the specified element to the end of this list.
     *
     * @param element the element to be added to this list
     */
    public void add(T element) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = element;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index    the index of the element to replace
     * @param element  the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * Returns a string representation of this {@code myArrayListRealisation} instance.
     * The string representation consists of a list of the elements, enclosed in curly braces
     * ("{}"). Adjacent elements are separated by the characters ", " (a comma followed by a
     * space). Elements are converted to strings as by {@link String#valueOf(Object)}.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        return "myArrayListRealisation{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
