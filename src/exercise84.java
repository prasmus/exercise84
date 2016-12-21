/**
 * Created by Praktika on 21.12.2016.
 */
public class exercise84 {
    public static void main(String[] args) {
        int[] myArray = {2, 1, 7, 66, 43, 3, 8, 77, 4};
        System.out.println(indexOfMax(myArray));
    }

    public static int indexOfMax(int[] myArray) {
        int maxNumber = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[maxNumber] < myArray[i]) {
                maxNumber = i;
            }
        }
        return myArray[maxNumber];
    }
}
