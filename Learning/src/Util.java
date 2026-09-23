//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Util {
    public Util() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 3, 2, 5, 43, 32, 700, 23, 80, 50, 80, 43, 54, 65};
        int secondHigh = SecondHighNumber(a);
        System.out.println("secondHigh =" + secondHigh);
    }

    public static int SecondHighNumber(int[] array) {
        int secondHigh = 0;
        int high = array[0];

        for(int i = 0; i < array.length; ++i) {
            if (high < array[i]) {
                secondHigh = high;
                high = array[i];
            }

            if (high > array[i] && secondHigh < array[i]) {
                secondHigh = array[i];
            }
        }

        return secondHigh;
    }
}
