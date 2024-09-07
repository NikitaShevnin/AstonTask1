package solution;

public class Main {
    public static void main(String[] args) {
        // Create a MyArrayList and add some elements
        MyArrayList <Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);

        System.out.println("Initial list: " + list);

        // Sort the list using QuickSort
        quickSortRealisation.quickSort(list);

        System.out.println("Sorted list: " + list);

        // Demonstrate the size() method
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Demonstrate the set() method
        list.set(2, 7);
        System.out.println("List after setting an element: " + list);
    }
}

