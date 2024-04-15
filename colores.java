public class colores {

    public class Ejercicio04 {

        public static int[] generaArrayInt(int n, int min, int max) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * (max - min + 1)) + min;
            }
            return array;
        }
    
        public static int minimoArrayInt(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    
        public static int maximoArrayInt(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    
        public static double mediaArrayInt(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }
    
        public static boolean estaEnArrayInt(int[] array, int num) {
            for (int i : array) {
                if (i == num) {
                    return true;
                }
            }
            return false;
        }
    
        public static int posicionEnArray(int[] array, int num) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    return i;
                }
            }
            return -1;
        }
    
        public static int[] volteaArrayInt(int[] array) {
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            return reversedArray;
        }
    
        public static int[] rotaDerechaArrayInt(int[] array, int n) {
            int[] rotatedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                rotatedArray[(i + n) % array.length] = array[i];
            }
            return rotatedArray;
        }
    
        public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
            int[] rotatedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                rotatedArray[i] = array[(i + n) % array.length];
            }
            return rotatedArray;
        }
    }
    
}