package solution;

/**
 * A custom implementation of a non-thread-safe ArrayList.
 *
 * @param <T> the type of elements in this list
 */
public class myArrayListRealisation<T extends Comparable<T>> {

    private T[] array;
    private int size;

    public myArrayListRealisation() {
        this.array = (T[]) new Object[10]; // Инициализируем массив с начальным размером 10
        this.size = 0;
    }

    /**
     * Constructs an empty list with an initial capacity of 10.
     */
    public void MyArrayList() {
        this.array = new T[10];
        this.size = 0;
    }

    /**
     * Adds the specified element to the end of this list.
     * If the list is full, it increases the capacity of the underlying array.
     *
     * @param element the element to be added to this list
     */
    public void add(T element) {
        if (size == array.length) { // Если массив заполнен
            T[] newArray = (T[]) new Object[array.length * 2]; // Увеличиваем размер массива в 2 раза
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray; // Присваиваем новый массив
        }
        array[size++] = element; // Добавляем элемент в массив
    }


    /**
     * Increases the capacity of this ArrayList instance, if necessary, to ensure
     * that it can hold at least the number of elements specified by the
     * minimum capacity argument.
     */
    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   the index of the element to replace
     * @param element the element to be stored at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *
     * @param index the index of the element to be removed
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }
}
