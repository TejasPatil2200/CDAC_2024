public class RevArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
      
        System.out.println("Original Array: ");
        printArray(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed Array: ");
        printArray(array);
    }
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}