public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] data) {
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            int index = data[i];
            try {
                total += data[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: Index Out of Bounds @ Index - " + index);
            }
        }
        System.out.println("Total: " + total);
    }
}
