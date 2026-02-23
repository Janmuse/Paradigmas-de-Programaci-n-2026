import java.awt.print.Printable;

public class Utils {
    public static <T> void imprimir(T[] vector) {
    for (int i= 0; i < vector.length; i++){
        System.out.print(vector[i] + " ");
     }
    System.out.println("");
    }

    public static <T extends Number & Comparable> T[] ordena(T[] vector) {
        quickSort(vector, 0, vector.length - 1);
        return vector;
    }

    private static <T extends Number & Comparable> int partition(T[] vector, int low, int high) {
        T pivot = vector[high];
        int j = low -1;
        for (int i = low; i < high; i++) {
            if (vector[i].compareTo(pivot) < 0) {
                j++;
                T temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
            }
        }
        T newpivot = vector[high];
        vector[high] = vector[j + 1];
        vector[j + 1] = newpivot;
        return j + 1;
    }

    private static <T extends Number & Comparable> void quickSort(T[] vector, int low, int high) {
        if(low < high){
            int pivotPos = partition(vector, low, high);
            quickSort(vector, low, pivotPos - 1);
            quickSort(vector, pivotPos + 1, high);
        }
    }
}

