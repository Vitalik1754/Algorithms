package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 15;
        array[2] = 16;
        array[3] = 20;
        array[4] = 17;
        array[5] = 13;
        array[6] = 14;
        array[7] = 8;
        array[8] = 9;
        array[9] = 5;
        System.out.println("Номери варіантів групи Кн23с :"+Arrays.toString(array));
        int[] sortedArray = insertionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
        }

        System.out.println("Посортовані номера варіантів групи Кн23с :"+Arrays.toString(sortedArray));
    }
    public static int[] insertionSort(int[] version){
        int i ,j, newBooks;
        for (i = 1; i < version.length; i++){
            int newVersion = version[i];
            j = i;
            while (j>0&& version[j-1] > newVersion) {
                version[j] = version[j-1];
                j--;
            }
            version[j] =  newVersion;
        }
        return version;
    }
}