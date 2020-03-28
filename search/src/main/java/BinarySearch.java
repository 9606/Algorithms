public class BinarySearch {
    public int find(int[] array, int target) {
        if (array == null) return -1;
        int left = 0;
        int right = array.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int lowerBound(int[] array, int target) {
        if (array == null) return -1;
        int left = 0;
        int right = array.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (array[mid] == target) {
                right = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left >= array.length) return -1;
        return left;
    }

    public int upperBound(int[] array, int target) {
        if (array == null) return -1;
        int left = 0;
        int right = array.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (array[mid] == target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left > array.length) return -1;
        return left - 1;
    }
}
