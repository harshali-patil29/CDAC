import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5, 8, 6};
        int[] array2 = {3, 4, 5, 6, 7, 8};
        int[] intersectionArr = new int[Math.min(array1.length, array2.length)];
        
        Arrays.sort(array1);
        Arrays.sort(array2);          
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                intersectionArr[k++] = array1[i];
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }        
        intersectionArr = Arrays.copyOf(intersectionArr, k);
        System.out.println("Intersection of the two arrays: " + Arrays.toString(intersectionArr));
    }
}
